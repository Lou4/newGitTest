package com.example.mcgiver.myapplication;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;


public class MyActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        int i = am.getMemoryClass();
        TextView t = (TextView) findViewById(R.id.asd);
        t.setText("heap della memoria per singola applicazione: "+ Integer.toString(i));

    }



}
