package com.xwrl.custom.testbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xwrl.custom.dyztestbar.TestBar;

public class MainActivity extends AppCompatActivity {

    TestBar mTestBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}