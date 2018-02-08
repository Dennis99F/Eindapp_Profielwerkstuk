package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Dennis on 24-9-2017.
 */

public class onderwerp3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp3);

        if(getSupportActionBar()!=null)

            // Add back button
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txtScore7 = (TextView) findViewById(R.id.textScore7);
        TextView txtHighScore7 = (TextView) findViewById(R.id.txtHighScore7);

        Intent intent7 = getIntent();
        int score7 = intent7.getIntExtra("score7", 0);

        txtScore7.setText("Your score: " + score7 + " / 15");

        SharedPreferences mypref7 = getPreferences(MODE_PRIVATE);
        int highscore7 = mypref7.getInt("highscore7", 0);
        if (highscore7 >= score7)
            txtHighScore7.setText("High score: " + highscore7 + " / 15");
        else {
            txtHighScore7.setText("New highscore: " + score7 + " / 15");
            SharedPreferences.Editor editor = mypref7.edit();
            editor.putInt("highscore7", score7);
            editor.commit();
        }
        TextView txtScore8 = (TextView) findViewById(R.id.textScore8);
        TextView txtHighScore8 = (TextView) findViewById(R.id.txtHighScore8);

        Intent intent8 = getIntent();
        int score8 = intent8.getIntExtra("score8", 0);

        txtScore8.setText("Your score: " + score8 + " / 15");

        SharedPreferences mypref8 = getPreferences(MODE_PRIVATE);
        int highscore8 = mypref8.getInt("highscore8", 0);
        if (highscore8 >= score8)
            txtHighScore8.setText("High score: " + highscore8 + " / 15");
        else {
            txtHighScore8.setText("New highscore: " + score8 + " / 15");
            SharedPreferences.Editor editor = mypref8.edit();
            editor.putInt("highscore8", score8);
            editor.commit();
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    public void onClick7(View view) {
        Intent intent7 = new Intent(onderwerp3.this, onderwerp3_niveau1.class);
        startActivity(intent7);
    }
    public void onClick8(View view) {
        Intent intent8 = new Intent(onderwerp3.this, onderwerp3_niveau2.class);
        startActivity(intent8);
    }
    public void onButtonClickO3HN1(View Onderwerp3_niveau1) {
        if (Onderwerp3_niveau1.getId() == R.id.Onderwerp3_Hoofdsteden_Niveau1) {
            Intent O3HN1 = new Intent(onderwerp3.this, onderwerp3_niveau1.class);
            startActivity(O3HN1);
        }
    }
    public void onButtonClickO3HN2(View Onderwerp3_niveau2) {
        if (Onderwerp3_niveau2.getId() == R.id.Onderwerp3_Hoofdsteden_Niveau2) {
            Intent O3HN2 = new Intent(onderwerp3.this, onderwerp3_niveau2.class);
            startActivity(O3HN2);
        }
    }
}
