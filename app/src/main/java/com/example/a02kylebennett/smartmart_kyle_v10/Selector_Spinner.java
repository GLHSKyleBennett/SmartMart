package com.example.a02kylebennett.smartmart_kyle_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Selector_Spinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector__spinner);

        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();
        String Selection = bundle.getString("Selection");

        if (Selection.equals("Electronics")) {
            Intent intent = new Intent(this, Electronics.class);
            startActivity(intent);
        }
        else if (Selection.equals("Food and Beverages")) {
            Intent intent = new Intent(this, Food_and_Beverages.class);
            startActivity(intent);
        }
        else if (Selection.equals("Clothing")) {
            Intent intent = new Intent(this, Clothing.class);
            startActivity(intent);
        }
        else if (Selection.equals("Pets")) {
            Intent intent = new Intent(this, Pets.class);
            startActivity(intent);
        }
    }
}
