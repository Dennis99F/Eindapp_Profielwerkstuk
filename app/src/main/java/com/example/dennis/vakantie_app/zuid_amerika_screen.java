package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 9-9-2017.
 */


public class zuid_amerika_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zuid_amerika_screen);
        if(getSupportActionBar()!=null)

            // Add back button
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    public void onButtonClickZ1(View Argentinië) {
        if (Argentinië.getId() == R.id.DisplayZ1) {
            Intent Z1 = new Intent(zuid_amerika_screen.this, argentinie.class);
            startActivity(Z1);
        }
    }
    public void onButtonClickZ2(View Brazilië) {
        if (Brazilië.getId() == R.id.DisplayZ2) {
            Intent Z2 = new Intent(zuid_amerika_screen.this, brazilie.class);
            startActivity(Z2);
        }
    }
    public void onButtonClickZ3(View Chili) {
        if (Chili.getId() == R.id.DisplayZ3) {
            Intent Z3 = new Intent(zuid_amerika_screen.this, chili.class);
            startActivity(Z3);
        }
    }
}
