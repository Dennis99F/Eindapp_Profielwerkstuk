package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 9-9-2017.
 */


public class noord_amerika_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noord_amerika_screen);
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
    public void onButtonClickN1(View Canada) {
        if (Canada.getId() == R.id.DisplayN1) {
            Intent N1 = new Intent(noord_amerika_screen.this, canada.class);
            startActivity(N1);
        }
    }
    public void onButtonClickN2(View Verenigde_Staten) {
        if (Verenigde_Staten.getId() == R.id.DisplayN2) {
            Intent N2 = new Intent(noord_amerika_screen.this, verenigde_staten.class);
            startActivity(N2);
        }
    }
}
