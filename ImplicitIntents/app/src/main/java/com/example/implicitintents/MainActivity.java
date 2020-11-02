package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etUrii;
    private EditText etLoc;
    private EditText etSharee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUrii = (EditText) findViewById(R.id.etUri);
        etLoc = (EditText) findViewById(R.id.etLocation);
        etSharee = (EditText) findViewById(R.id.etShare);
    }

    public void openWebsite(View view) {
        String url = etUrii.getText().toString();
        Uri webpage = Uri.parse(url);
        Log.d("URL", url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void openLocation(View view) {
        String lokasi = etLoc.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + lokasi);

        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        startActivity(intent);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void shareText(View view) {
        String text = etSharee.getText().toString();
        String mimetype = "text/plain";

        ShareCompat.IntentBuilder.from(this).setType(mimetype).setChooserTitle("Share this text with: ").setText(text).startChooser();
    }
}