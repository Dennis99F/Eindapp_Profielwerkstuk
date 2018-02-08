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

public class onderwerp2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp2);

        if(getSupportActionBar()!=null)

            // Add back button
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txtScore5 = (TextView) findViewById(R.id.textScore5);
        TextView txtHighScore5 = (TextView) findViewById(R.id.txtHighScore5);

        Intent intent5 = getIntent();
        int score5 = intent5.getIntExtra("score5", 0);

        txtScore5.setText("Your score: " + score5 + " / 10");

        SharedPreferences mypref5 = getPreferences(MODE_PRIVATE);
        int highscore5 = mypref5.getInt("highscore5", 0);
        if (highscore5 >= score5)
            txtHighScore5.setText("High score: " + highscore5 + " / 10");
        else {
            txtHighScore5.setText("New highscore: " + score5 + " / 10");
            SharedPreferences.Editor editor = mypref5.edit();
            editor.putInt("highscore5", score5);
            editor.commit();
        }
        TextView txtScore6 = (TextView) findViewById(R.id.textScore6);
        TextView txtHighScore6 = (TextView) findViewById(R.id.txtHighScore6);

        Intent intent6 = getIntent();
        int score6 = intent6.getIntExtra("score6", 0);

        txtScore6.setText("Your score: " + score6 + " / 10");

        SharedPreferences mypref6 = getPreferences(MODE_PRIVATE);
        int highscore6 = mypref6.getInt("highscore6", 0);
        if (highscore6 >= score6)
            txtHighScore6.setText("High score: " + highscore6 + " / 10");
        else {
            txtHighScore6.setText("New highscore: " + score6 + " / 10");
            SharedPreferences.Editor editor = mypref6.edit();
            editor.putInt("highscore6", score6);
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
    public void onClick5(View view) {
        Intent intent5 = new Intent(onderwerp2.this, onderwerp2_niveau1.class);
        startActivity(intent5);
    }
    public void onClick6(View view) {
        Intent intent6 = new Intent(onderwerp2.this, onderwerp2_niveau2.class);
        startActivity(intent6);
    }
    public void onButtonClickO2HN1(View Onderwerp2_niveau1) {
        if (Onderwerp2_niveau1.getId() == R.id.Onderwerp2_Hoofdsteden_Niveau1) {
            Intent O2HN1 = new Intent(onderwerp2.this, onderwerp2_niveau1.class);
            startActivity(O2HN1);
        }
    }
    public void onButtonClickO2HN2(View Onderwerp2_niveau2) {
        if (Onderwerp2_niveau2.getId() == R.id.Onderwerp2_Hoofdsteden_Niveau2) {
            Intent O2HN2 = new Intent(onderwerp2.this, onderwerp2_niveau2.class);
            startActivity(O2HN2);
        }
    }
}
