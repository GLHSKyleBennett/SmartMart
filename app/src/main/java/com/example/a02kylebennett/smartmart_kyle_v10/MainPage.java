package com.example.a02kylebennett.smartmart_kyle_v10;

import android.app.ActionBar;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }


    public void Shop(View view) {
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
}
}
