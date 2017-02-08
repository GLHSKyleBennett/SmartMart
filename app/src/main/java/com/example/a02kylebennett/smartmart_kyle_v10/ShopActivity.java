package com.example.a02kylebennett.smartmart_kyle_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class ShopActivity extends AppCompatActivity implements OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Spinner spinner = (Spinner) findViewById(R.id.Selector);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);


    }
public String item = "";

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        item = parent.getItemAtPosition(position).toString();

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
    public void Search(View view) {
        Intent intent = new Intent(this, Selector_Spinner.class);
        Bundle bundle = new Bundle();
        bundle.putString("Selection", item);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void All_Firms(View view) {
        Intent intent = new Intent(this, All_Firms.class);
        startActivity(intent);
    }
}

