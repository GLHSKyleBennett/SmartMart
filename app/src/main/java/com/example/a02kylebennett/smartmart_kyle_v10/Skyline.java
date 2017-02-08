package com.example.a02kylebennett.smartmart_kyle_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Skyline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skyline);
    }

    public void All_Firms(View view) {
        Intent intent = new Intent(this, All_Firms.class);
        startActivity(intent);
    }

    public void Electronics(View view) {
        Intent intent = new Intent(this, Electronics.class);
        startActivity(intent);
    }
}
