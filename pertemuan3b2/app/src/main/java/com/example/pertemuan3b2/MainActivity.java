package com.example.pertemuan3b2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int nilaiAntrian = 0;
    private TextView tampilAntrian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilAntrian = (TextView) findViewById(R.id.text_nomor);

    }

    public void tambahAntrian(View view) {
        nilaiAntrian++;
        if(tampilAntrian != null) {
            tampilAntrian.setText(Integer.toString(nilaiAntrian));
        }

        Toast pesan = Toast.makeText(this, R.string.label_pesan, Toast.LENGTH_SHORT);
        pesan.show();
    }

    public void resetAntrian(View view) {
        nilaiAntrian = 0;
        if(tampilAntrian != null) {
            tampilAntrian.setText(Integer.toString(nilaiAntrian));
        }
    }
}