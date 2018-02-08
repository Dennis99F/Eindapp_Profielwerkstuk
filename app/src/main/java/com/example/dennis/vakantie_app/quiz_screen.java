package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 13-9-2017.
 */

public class quiz_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_screen);
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
    public void onButtonClickQ1 (View Quiz1) {
        if (Quiz1.getId() == R.id.DisplayQ1) {
            Intent Q1 = new Intent(quiz_screen.this, onderwerp1.class);
            startActivity(Q1);
        }
    }
    public void onButtonClickQ2 (View Quiz2) {
        if (Quiz2.getId() == R.id.DisplayQ2) {
            Intent Q2 = new Intent(quiz_screen.this, onderwerp2.class);
            startActivity(Q2);
        }
    }
    public void onButtonClickQ3 (View Quiz3) {
        if (Quiz3.getId() == R.id.DisplayQ3) {
            Intent Q3 = new Intent(quiz_screen.this, onderwerp3.class);
            startActivity(Q3);
        }
    }
}
