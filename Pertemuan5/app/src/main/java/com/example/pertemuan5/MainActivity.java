package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int nilaiAngka = 0;
    private TextView TampilAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TampilAngka = (TextView) findViewById(R.id.LabelAngka);
    }

    public void FungsiTambah(View view) {
        nilaiAngka++;
        TampilAngka.setText(Integer.toString(nilaiAngka));
    }

    public void FungsiKurang(View view) {
        nilaiAngka--;
        TampilAngka.setText(Integer.toString(nilaiAngka));
    }

    public void FungsiReset(View view) {
        nilaiAngka = 0;
        TampilAngka.setText(Integer.toString(nilaiAngka));
    }
}