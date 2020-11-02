package com.example.pertemuan3b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var nilaiAntrian = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast pesan = Toast.makeText()
    }

    fun tambahAntrian(view: View) {
        nilaiAntrian++
        if (text_nomor != null) {
            text_nomor.text = nilaiAntrian.toString()
        }
    }

    fun resetAntrian(view: View) {
        nilaiAntrian = 0
        if (text_nomor != null) {
            text_nomor.text = nilaiAntrian.toString()
        }
    }
}