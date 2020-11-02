package com.example.pertemuan5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int nilai = 0;
    private TextView tampilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilan = (TextView) findViewById(R.id.LabelAngka);
    }

    public void FungsiTambah(View view) {
        nilai++;
        tampilan.setText(Integer.toString(nilai));
    }

    public void FungsiReset(View view) {
        nilai = 0;
        tampilan.setText(Integer.toString(nilai));
    }
}