package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 9-9-2017.
 */


public class europa_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.europa_screen);
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
    public void onButtonClickE1 (View Duitsland) {
        if (Duitsland.getId() == R.id.DisplayE1) {
            Intent E1 = new Intent(europa_screen.this, duitsland.class);
            startActivity(E1);
        }
    }
    public void onButtonClickE2 (View Engeland) {
        if (Engeland.getId() == R.id.DisplayE2) {
            Intent E2 = new Intent(europa_screen.this, engeland.class);
            startActivity(E2);
        }
    }
    public void onButtonClickE3 (View Frankrijk) {
        if (Frankrijk.getId() == R.id.DisplayE3) {
            Intent E3 = new Intent(europa_screen.this, frankrijk.class);
            startActivity(E3);
        }
    }
    public void onButtonClickE4 (View Griekenland) {
        if (Griekenland.getId() == R.id.DisplayE4) {
            Intent E4 = new Intent(europa_screen.this, griekenland.class);
            startActivity(E4);
        }
    }
    public void onButtonClickE5 (View Italië) {
        if (Italië.getId() == R.id.DisplayE5) {
            Intent E5 = new Intent(europa_screen.this, italie.class);
            startActivity(E5);
        }
    }
    public void onButtonClickE6 (View Kroatië) {
        if (Kroatië.getId() == R.id.DisplayE6) {
            Intent E6 = new Intent(europa_screen.this, kroatie.class);
            startActivity(E6);
        }
    }
    public void onButtonClickE7 (View Nederland) {
        if (Nederland.getId() == R.id.DisplayE7) {
            Intent E7 = new Intent(europa_screen.this, nederland.class);
            startActivity(E7);
        }
    }
    public void onButtonClickE8 (View Oostenrijk) {
        if (Oostenrijk.getId() == R.id.DisplayE8) {
            Intent E8 = new Intent(europa_screen.this, oostenrijk.class);
            startActivity(E8);
        }
    }
    public void onButtonClickE10 (View Spanje) {
        if (Spanje.getId() == R.id.DisplayE10) {
            Intent E10 = new Intent(europa_screen.this, spanje.class);
            startActivity(E10);
        }
    }
    public void onButtonClickE11 (View Zweden) {
        if (Zweden.getId() == R.id.DisplayE11) {
            Intent E11 = new Intent(europa_screen.this, zweden.class);
            startActivity(E11);
        }
    }
}
