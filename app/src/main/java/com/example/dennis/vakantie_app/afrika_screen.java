package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 7-9-2017.
 */

public class afrika_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afrika_screen);
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

    public void onButtonClickA1 (View Egypte) {
        if (Egypte.getId() == R.id.DisplayA1) {
            Intent A1 = new Intent(afrika_screen.this, egypte.class);
            startActivity(A1);
        }
    }
    public void onButtonClickA2 (View Marokko) {
        if (Marokko.getId() == R.id.DisplayA2) {
            Intent A2 = new Intent(afrika_screen.this, marokko.class);
            startActivity(A2);
        }
    }
    public void onButtonClickA3 (View Tanzania) {
        if (Tanzania.getId() == R.id.DisplayA3) {
            Intent A3 = new Intent(afrika_screen.this, tanzania.class);
            startActivity(A3);
        }
    }
    public void onButtonClickA4 (View Zuid_Afrika) {
        if (Zuid_Afrika.getId() == R.id.DisplayA4) {
            Intent A4 = new Intent(afrika_screen.this, zuid_afrika.class);
            startActivity(A4);
        }
    }



}
