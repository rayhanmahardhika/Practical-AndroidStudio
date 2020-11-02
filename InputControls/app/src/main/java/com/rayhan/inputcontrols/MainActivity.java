package com.rayhan.inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sPengajuann = findViewById(R.id.sPengajuan);
        if(sPengajuann != null) {
            sPengajuann.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
          this,
          R.array.listPengajuan,
          android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        if(sPengajuann != null) {
            sPengajuann.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void fDiterima(View view) {
        Toast.makeText(getApplicationContext(), "Judul Diterima", Toast.LENGTH_SHORT).show();
    }

    public void fProgress(View view) {
        Toast.makeText(getApplicationContext(), "Sudah Progress", Toast.LENGTH_SHORT).show();
    }

    public void fPendadaran(View view) {
        Toast.makeText(getApplicationContext(), "Sudah Pendadaran", Toast.LENGTH_SHORT).show();
    }
}