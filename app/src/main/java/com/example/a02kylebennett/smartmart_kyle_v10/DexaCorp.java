package com.example.a02kylebennett.smartmart_kyle_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DexaCorp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dexa_corp);
    }

    public void All_Firms(View view) {
        Intent intent = new Intent(this, All_Firms.class);
        startActivity(intent);
    }

    public void Electronics(View view) {
        Intent intent = new Intent(this, Electronics.class);
        startActivity(intent);
    }

    public void Food_and_Beverages(View view) {
        Intent intent = new Intent(this, Food_and_Beverages.class);
        startActivity(intent);
    }
}
