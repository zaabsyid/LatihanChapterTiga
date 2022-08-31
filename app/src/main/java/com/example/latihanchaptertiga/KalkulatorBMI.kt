package com.example.latihanchaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KalkulatorBMI : AppCompatActivity() {

    lateinit var edtUmur : EditText
    lateinit var edtTinggi : EditText
    lateinit var edtBerat : EditText
    lateinit var btnHitung : Button
    lateinit var btnReset : Button
    lateinit var tvUmur : TextView
    lateinit var tvTinggi : TextView
    lateinit var tvBerat : TextView
    lateinit var tvBMI : TextView
    lateinit var tvKategori : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator_bmi)

        edtUmur = findViewById(R.id.edt_umur)
        edtTinggi = findViewById(R.id.edt_tinggi)
        edtBerat = findViewById(R.id.edt_berat)

        btnHitung = findViewById(R.id.btn_hitung)
        btnReset = findViewById(R.id.btn_Reset)

        tvUmur = findViewById(R.id.tv_umur)
        tvBerat = findViewById(R.id.tv_berat)
        tvTinggi = findViewById(R.id.tv_tinggi)
        tvBMI = findViewById(R.id.tv_bmi)
        tvKategori = findViewById(R.id.tv_kategori)

        btnHitung.setOnClickListener {
            hitungBMI()
        }

        btnReset.setOnClickListener {
            reset()
        }

    }

    fun reset() {
        edtUmur.setText("")
        edtBerat.setText("")
        edtTinggi.setText("")
        tvUmur.setText("")
        tvTinggi.setText("")
        tvBerat.setText("")
        tvBMI.setText("")
        tvKategori.setText("")
    }

    fun hitungBMI() {
        var umur = edtUmur.text.toString()
        tvUmur.text = umur
        var tinggi = edtTinggi.text.toString()
        tvTinggi.text = tinggi
        var berat = edtBerat.text.toString()
        tvBerat.text = berat

        var tinggiDalamMeter = tinggi.toDouble()/100
        var tinggiDalamKuadrat = tinggiDalamMeter*tinggiDalamMeter
        var totalBMI = berat.toFloat()/tinggiDalamKuadrat
        tvBMI.text = totalBMI.toString()

        if(totalBMI.toDouble() < 16){
            tvKategori.text = "Terlalu Kurus"
        }else if(totalBMI.toDouble() in 16.1..17.0){
            tvKategori.text = "Cukup Kurus"
        }else if(totalBMI.toDouble() in 17.1..18.5){
            tvKategori.text = "Sedikit Kurus"
        }else if(totalBMI.toDouble() in 18.6..25.0){
            tvKategori.text = "Normal"
        }else if(totalBMI.toDouble() in 25.1..30.0){
            tvKategori.text = "Gemuk"
        }else if(totalBMI.toDouble() in 30.0..35.0){
            tvKategori.text = "Obesitas Kelas 1"
        }else if(totalBMI.toDouble() in 35.1..40.0){
            tvKategori.text = "Obesitas Kelas 2"
        }else{
            tvKategori.text ="Obesitas Kelas 3"
        }
    }
}