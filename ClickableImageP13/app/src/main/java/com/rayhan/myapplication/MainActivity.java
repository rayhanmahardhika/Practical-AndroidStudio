package com.rayhan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    private String pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fabOrderr = findViewById(R.id.fabOrder);
        fabOrderr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                tampilPesan(pesanan);
                Intent keOrder = new Intent(MainActivity.this, OrderActivity.class);
                keOrder.putExtra("pilihan", pesanan.toString());
                startActivity(keOrder);
            }
        });
    }

    public void tampilPesan(String pesan) {
        Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_SHORT).show();
    }

    public void fKapucino(View view) {
        pesanan = getString(R.string.teksPesanKapucino);
        tampilPesan(pesanan);
    }

    public void fKopi(View view) {
        pesanan = getString(R.string.teksPesanKopi);
        tampilPesan(pesanan);
    }

    public void fTeh(View view) {
        pesanan = getString(R.string.teksPesanTeh);
        tampilPesan(pesanan);
    }




}