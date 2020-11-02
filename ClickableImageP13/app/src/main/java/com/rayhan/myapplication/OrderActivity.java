package com.rayhan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    private TextView tvPesanann;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        tvPesanann = findViewById(R.id.tvPesanan);
        tvPesanann.setText(getIntent().getStringExtra("pilihan"));
    }
}