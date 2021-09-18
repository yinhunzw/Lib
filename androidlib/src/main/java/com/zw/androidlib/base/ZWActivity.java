package com.zw.androidlib.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ZWActivity extends AppCompatActivity {
    private static final String ZHANGWEI = "zhangwei";
    public String TAG = ZHANGWEI + "-" +getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}