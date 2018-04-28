package com.capstone.scanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    boolean readerConnected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//         check for fingerprint reader
    }

    // click enroll button
    public void clickEnroll(View view) {
        Intent intent = new Intent(this, EnrollActivity.class);

//        if (readerConnected) {}
        startActivity(intent);
    }

    // click verify button
    public void clickVerify(View view) {
        Intent intent = new Intent(this, EnrollActivity.class);

//        if (readerConnected) {}
        startActivity(intent);
    }
}
