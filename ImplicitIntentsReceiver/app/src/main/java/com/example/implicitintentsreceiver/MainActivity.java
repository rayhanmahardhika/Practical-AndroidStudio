package com.example.implicitintentsreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Uri uri = intent.getData();

        if (uri != null) {
            String uriString = "URI: " + uri.toString();
            TextView tUriMessagee = findViewById(R.id.tUriMessage);
            tUriMessagee.setText(uriString);
        }

    }
}