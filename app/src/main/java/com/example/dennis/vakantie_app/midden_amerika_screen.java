package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Dennis on 9-9-2017.
 */

public class midden_amerika_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midden_amerika_screen);
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
    public void onButtonClickM1(View Costa_Rica) {
        if (Costa_Rica.getId() == R.id.DisplayM1) {
            Intent M1 = new Intent(midden_amerika_screen.this, costa_rica.class);
            startActivity(M1);
        }
    }

    public void onButtonClickM2(View Curacao) {
        if (Curacao.getId() == R.id.DisplayM2) {
            Intent M2 = new Intent(midden_amerika_screen.this, curacao.class);
            startActivity(M2);
        }
    }
}