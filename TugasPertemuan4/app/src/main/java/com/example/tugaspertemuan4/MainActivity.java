package com.example.tugaspertemuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int nilaiAngka = 0;
    private TextView tampilAngka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilAngka = (TextView) findViewById(R.id.text_angka);
    }

    public void aksiUbahNilai(View view) {

        if((Button)view == (Button) findViewById(R.id.button_action1)) {
            nilaiAngka++;
        }else if((Button)view == (Button) findViewById(R.id.button_action2)) {
            nilaiAngka += 2;
        }else if((Button)view == (Button) findViewById(R.id.button_action3)) {
            nilaiAngka += 5;
        }else if((Button)view == (Button) findViewById(R.id.button_action4)) {
            nilaiAngka -= 1;
        }else if((Button)view == (Button) findViewById(R.id.button_action5)) {
            nilaiAngka -= 2;
        }else if((Button)view == (Button) findViewById(R.id.button_action6)) {
            nilaiAngka -= 5;
        }else if((Button)view == (Button) findViewById(R.id.button_reset)) {
            nilaiAngka = 0;
        }

        if(tampilAngka != null) {
            tampilAngka.setText(Integer.toString(nilaiAngka));
        }

        Toast pesan = Toast.makeText(this, R.string.label_pesan, Toast.LENGTH_SHORT);
        pesan.show();
    }
}