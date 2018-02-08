package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 9-9-2017.
 */


public class oceanie_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oceanie_screen);
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
    public void onButtonClickO1(View Australië) {
        if (Australië.getId() == R.id.DisplayO1) {
            Intent O1 = new Intent(oceanie_screen.this, australie.class);
            startActivity(O1);
        }
    }
    public void onButtonClickO2(View Nieuw_Zeeland) {
        if (Nieuw_Zeeland.getId() == R.id.DisplayO2) {
            Intent O2 = new Intent(oceanie_screen.this, nieuw_zeeland.class);
            startActivity(O2);
        }
    }
}
