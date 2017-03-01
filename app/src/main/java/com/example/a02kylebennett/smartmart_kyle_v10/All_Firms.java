package com.example.a02kylebennett.smartmart_kyle_v10;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class All_Firms extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_firms);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar9);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout9);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

        };

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view9);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout9);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //@Override
    /*public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;
    }*/



    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.electronics) {
            Intent intent = new Intent(this, Electronics.class);
            startActivity(intent);
        }
        else if (id == R.id.clothing) {
            Intent intent = new Intent(this, Clothing.class);
            startActivity(intent);
        }
        else if (id == R.id.food) {
            Intent intent = new Intent(this, Food_and_Beverages.class);
            startActivity(intent);
        }
        else if (id == R.id.pets) {
            Intent intent = new Intent(this, Pets.class);
            startActivity(intent);
        }
        else if (id == R.id.all_firms) {
            Intent intent = new Intent(this, All_Firms.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout9);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void Mavco(View view) {
        Intent intent = new Intent(this, Mavco.class);
        startActivity(intent);
    }

    public void Spectrum(View view) {
        Intent intent = new Intent(this, Spectrum.class);
        startActivity(intent);
    }

    public void Skyline(View view) {
        Intent intent = new Intent(this, Skyline.class);
        startActivity(intent);
    }

    public void Affinity(View view) {
        Intent intent = new Intent(this, Affinity.class);
        startActivity(intent);
    }

    public void DexaCorp(View view) {
        Intent intent = new Intent(this, DexaCorp.class);
        startActivity(intent);
    }

    public void Smooth_Move(View view) {
        Intent intent = new Intent(this, Smooth_Move.class);
        startActivity(intent);
    }

    public void ITW(View view) {
        Intent intent = new Intent(this, ITW.class);
        startActivity(intent);
    }

    public void DTE(View view) {
        Intent intent = new Intent(this, DTE.class);
        startActivity(intent);
    }

    public void WayBound(View view) {
        Intent intent = new Intent(this, WayBound.class);
        startActivity(intent);
    }

    public void LRM(View view) {
        Intent intent = new Intent(this, LRM.class);
        startActivity(intent);
    }
}
