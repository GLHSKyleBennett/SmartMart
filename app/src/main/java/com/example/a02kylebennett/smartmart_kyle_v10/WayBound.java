package com.example.a02kylebennett.smartmart_kyle_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WayBound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_way_bound);
    }

    public void All_Firms(View view) {
        Intent intent = new Intent(this, All_Firms.class);
        startActivity(intent);
    }

    public void Clothing(View view) {
        Intent intent = new Intent(this, Clothing.class);
        startActivity(intent);
    }
}
