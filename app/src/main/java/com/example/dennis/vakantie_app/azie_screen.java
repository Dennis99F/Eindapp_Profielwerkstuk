package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 9-9-2017.
 */

public class azie_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.azie_screen);
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

    public void onButtonClickAA1 (View China) {
        if (China.getId() == R.id.DisplayAA1) {
            Intent AA1 = new Intent(azie_screen.this, china.class);
            startActivity(AA1);
        }
    }
    public void onButtonClickAA2 (View Indonesië) {
        if (Indonesië.getId() == R.id.DisplayAA2) {
            Intent AA2 = new Intent(azie_screen.this, indonesie.class);
            startActivity(AA2);
        }
    }
    public void onButtonClickAA3 (View Japan) {
        if (Japan.getId() == R.id.DisplayAA3) {
            Intent AA3 = new Intent(azie_screen.this, japan.class);
            startActivity(AA3);
        }
    }
    public void onButtonClickAA4 (View Thailand) {
        if (Thailand.getId() == R.id.DisplayAA4) {
            Intent AA4 = new Intent(azie_screen.this, thailand.class);
            startActivity(AA4);
        }
    }
}
