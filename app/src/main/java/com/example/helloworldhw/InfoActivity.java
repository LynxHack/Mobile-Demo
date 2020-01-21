package com.example.helloworldhw;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;


public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView location = (TextView) findViewById(R.id.location);
        TextView deviceid = (TextView) findViewById(R.id.deviceid);
        TextView version = (TextView) findViewById(R.id.version);
        TextView manufacturer = (TextView) findViewById(R.id.manufacturer);
        TextView model = (TextView) findViewById(R.id.model);

        deviceid.setText("Device id: " + Build.ID);
        version.setText("Android version: " + System.getProperty("os.version"));
        manufacturer.setText("Manufacturer: " + Build.MANUFACTURER);
        model.setText("Phone Model: " + Build.MODEL);
    }
}
