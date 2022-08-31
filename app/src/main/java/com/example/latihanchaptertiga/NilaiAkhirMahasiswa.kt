package com.example.latihanchaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NilaiAkhirMahasiswa : AppCompatActivity() {

    lateinit var edtNama : EditText
    lateinit var edtNim : EditText
    lateinit var edtUas : EditText
    lateinit var edtUts : EditText
    lateinit var edtTugas : EditText
    lateinit var btnHitung : Button
    lateinit var btnReset : Button
    lateinit var tvNama : TextView
    lateinit var tvNim : TextView
    lateinit var tvUas : TextView
    lateinit var tvUts : TextView
    lateinit var tvTugas : TextView
    lateinit var tvTotal : TextView
    lateinit var tvRataRata : TextView
    lateinit var tvNilaiHuruf : TextView
    lateinit var tvStatus : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilai_akhir_mahasiswa)

        edtNama = findViewById(R.id.edt_nama)
        edtNim = findViewById(R.id.edt_nim)
        edtUas = findViewById(R.id.edt_uas)
        edtUts = findViewById(R.id.edt_uts)
        edtTugas = findViewById(R.id.edt_tugas)
        btnHitung = findViewById(R.id.btn_hitung)
        btnReset = findViewById(R.id.btn_Reset)
        tvNama = findViewById(R.id.tv_nama)
        tvNim = findViewById(R.id.tv_nim)
        tvUas = findViewById(R.id.tv_uas)
        tvUts = findViewById(R.id.tv_uts)
        tvTugas = findViewById(R.id.tv_tugas)
        tvTotal = findViewById(R.id.tv_total)
        tvRataRata = findViewById(R.id.tv_ratarata)
        tvNilaiHuruf = findViewById(R.id.tv_nilai_huruf)
        tvStatus = findViewById(R.id.tv_status)

        btnHitung.setOnClickListener {
            hitungNilai()
        }

        btnReset.setOnClickListener {
            reset()
        }
    }

    fun reset() {
        edtNama.setText("")
        edtNim.setText("")
        edtUas.setText("")
        edtUts.setText("")
        edtTugas.setText("")
        btnHitung.setText("")
        btnReset.setText("")
        tvNama.setText("")
        tvNim.setText("")
        tvUas.setText("")
        tvUts.setText("")
        tvTugas.setText("")
        tvTotal.setText("")
        tvRataRata.setText("")
        tvNilaiHuruf.setText("")
        tvStatus.setText("")
    }

    fun hitungNilai() {
        var nama = edtNama.text.toString()
        tvNama.text = nama
        var nim = edtNim.text.toString()
        tvNim.text = nim
        var uas = edtUas.text.toString()
        tvUas.text = uas
        var uts = edtUts.text.toString()
        tvUts.text = uts
        var tugas = edtTugas.text.toString()
        tvTugas.text = tugas
        var totalNilai = uas.toInt() + uts.toInt() + tugas.toInt()
        tvTotal.text = totalNilai.toString()
        var rataRata = totalNilai/3
        tvRataRata.text = rataRata.toString()

        if (rataRata in 91..100){
            tvNilaiHuruf.text = "A"
        } else if (rataRata in 81..90){
            tvNilaiHuruf.text = "B"
        } else if (rataRata in 71..80){
            tvNilaiHuruf.text = "C"
        } else if (rataRata in 61..70){
            tvNilaiHuruf.text = "D"
        } else {
            tvNilaiHuruf.text = "E"
        }

        if (tvNilaiHuruf.text == "A"){
            tvStatus.text = "Lolos"
        } else if (tvNilaiHuruf.text == "B"){
            tvStatus.text = "Lolos"
        } else if (tvNilaiHuruf.text == "C"){
            tvStatus.text = "Lolos"
        } else if (tvNilaiHuruf.text == "D"){
            tvStatus.text = "Tidak Lolos"
        } else{
            tvStatus.text = "Tidak Lolos"
        }
    }
}