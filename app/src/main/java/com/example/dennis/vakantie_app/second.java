package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 7-9-2017.
 */

public class second extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

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

    public void onButtonClickS1 (View Afrika) {
        if (Afrika.getId() == R.id.Bdisplay) {
            Intent S1 = new Intent(second.this, afrika_screen.class);
            startActivity(S1);
        }
    }
    public void onButtonClickS2 (View Azië) {
        if (Azië.getId() == R.id.Bdisplay2) {
            Intent S2 = new Intent(second.this, azie_screen.class);
            startActivity(S2);
        }
    }
    public void onButtonClickS3 (View Europa) {
        if (Europa.getId() == R.id.Bdisplay3) {
            Intent S3 = new Intent(second.this, europa_screen.class);
            startActivity(S3);
        }
    }
    public void onButtonClickS4 (View Midden_Amerika) {
        if (Midden_Amerika.getId() == R.id.Bdisplay4) {
            Intent S4 = new Intent(second.this, midden_amerika_screen.class);
            startActivity(S4);
        }
    }
    public void onButtonClickS5 (View Noord_Amerika) {
        if (Noord_Amerika.getId() == R.id.Bdisplay5) {
            Intent S5 = new Intent(second.this, noord_amerika_screen.class);
            startActivity(S5);
        }
    }
    public void onButtonClickS6 (View Oceanië) {
        if (Oceanië.getId() == R.id.Bdisplay6) {
            Intent S6 = new Intent(second.this, oceanie_screen.class);
            startActivity(S6);
        }
    }
    public void onButtonClickS7 (View Zuid_Amerika) {
        if (Zuid_Amerika.getId() == R.id.Bdisplay7) {
            Intent S7 = new Intent(second.this, zuid_amerika_screen.class);
            startActivity(S7);
        }
    }
}

