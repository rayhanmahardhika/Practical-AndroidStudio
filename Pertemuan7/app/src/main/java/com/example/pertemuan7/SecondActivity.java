package com.example.pertemuan7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    private EditText etSecond;
    protected static final String EXTRA_REPLY = "Ini key untuk extra dari Intent second";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tvMessage = findViewById(R.id.tvMessage);
        etSecond = findViewById(R.id.etSecond);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        tvMessage.setText(message);

        Log.d(LOG_TAG , "--------------------------------");
        Log.d(LOG_TAG , "onCreate Second");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG , "onStart Second");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG , "onResume Second");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG , "onPause Second");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG , "onStop Second");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG , "onDestroy Second");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG , "onRestart Second");
    }

    public void returnReply(View view) {
        String message = etSecond.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, message);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG , "End SecondActivity");
        finish();
    }
}