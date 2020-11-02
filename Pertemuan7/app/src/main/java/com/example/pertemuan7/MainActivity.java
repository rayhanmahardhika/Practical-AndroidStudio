package com.example.pertemuan7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    protected static final String EXTRA_MESSAGE = "ini key untuk extra di intent";
    protected static final int TEXT_REQUEST = 1;
    private EditText etMainn;
    private TextView tvHeaderMainn;
    private TextView tvGetReplyMessagee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMainn = findViewById(R.id.etMain);
        tvHeaderMainn = findViewById(R.id.tvHeaderMain);
        tvGetReplyMessagee = findViewById(R.id.tvGetReplyMessage);

        Log.d(LOG_TAG , "--------------------------------");
        Log.d(LOG_TAG , "onCreate Main");

        if(savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if(isVisible) {
                tvHeaderMainn.setVisibility(View.VISIBLE);
                tvGetReplyMessagee.setText(savedInstanceState.getString("reply_text"));
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG , "onStart Main");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG , "onResume Main");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG , "onPause Main");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG , "onStop Main");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG , "onDestroy Main");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG , "onRestart Main");
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG , "Button Send awdawda");
        String message = etMainn.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == TEXT_REQUEST) {
            if(resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                tvHeaderMainn.setVisibility(View.VISIBLE);
                tvGetReplyMessagee.setText(reply);
            }
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if(tvHeaderMainn.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text", tvGetReplyMessagee.getText().toString());
        }
    }
}