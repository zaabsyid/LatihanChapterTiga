package com.example.latihanchaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnKalkulatorBmi : Button
    lateinit var btnNilaiAkhirMahasiswa : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKalkulatorBmi = findViewById(R.id.btn_kalkulator_bmi)
        btnNilaiAkhirMahasiswa = findViewById(R.id.btn_nilai_akhir_mahasiswa)

        btnKalkulatorBmi.setOnClickListener {
            var intent = Intent(this, KalkulatorBMI::class.java)
            startActivity(intent)
        }

        btnNilaiAkhirMahasiswa.setOnClickListener {
            var intent = Intent(this, NilaiAkhirMahasiswa::class.java)
            startActivity(intent)
        }
    }
}