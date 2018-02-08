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

public class onderwerp1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp1);

        if(getSupportActionBar()!=null)

            // Add back button
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.txtHighScore);

        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("Your score: " + score + " / 25");

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore", 0);
        if (highscore >= score)
            txtHighScore.setText("High score: " + highscore + " / 25");
        else {
            txtHighScore.setText("New highscore: " + score + " / 25");
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
        TextView txtScore2 = (TextView) findViewById(R.id.textScore2);
        TextView txtHighScore2 = (TextView) findViewById(R.id.txtHighScore2);

        Intent intent2 = getIntent();
        int score2 = intent2.getIntExtra("score2", 0);

        txtScore2.setText("Your score: " + score2 + " / 25");

        SharedPreferences mypref2 = getPreferences(MODE_PRIVATE);
        int highscore2 = mypref2.getInt("highscore2", 0);
        if (highscore2 >= score2)
            txtHighScore2.setText("High score: " + highscore2 + " / 25");
        else {
            txtHighScore2.setText("New highscore: " + score2 + " / 25");
            SharedPreferences.Editor editor = mypref2.edit();
            editor.putInt("highscore2", score2);
            editor.commit();
        }
        TextView txtScore3 = (TextView) findViewById(R.id.textScore3);
        TextView txtHighScore3 = (TextView) findViewById(R.id.txtHighScore3);

        Intent intent3 = getIntent();
        int score3 = intent3.getIntExtra("score3", 0);

        txtScore3.setText("Your score: " + score3 + " / 25");

        SharedPreferences mypref3 = getPreferences(MODE_PRIVATE);
        int highscore3 = mypref3.getInt("highscore3", 0);
        if (highscore3 >= score3)
            txtHighScore3.setText("High score: " + highscore3 + " / 25");
        else {
            txtHighScore3.setText("New highscore: " + score3 + " / 25");
            SharedPreferences.Editor editor = mypref3.edit();
            editor.putInt("highscore3", score3);
            editor.commit();
        }
        TextView txtScore4 = (TextView) findViewById(R.id.textScore4);
        TextView txtHighScore4 = (TextView) findViewById(R.id.txtHighScore4);

        Intent intent4 = getIntent();
        int score4 = intent4.getIntExtra("score4", 0);

        txtScore4.setText("Your score: " + score4 + " / 25");

        SharedPreferences mypref4 = getPreferences(MODE_PRIVATE);
        int highscore4 = mypref4.getInt("highscore4", 0);
        if (highscore4 >= score4)
            txtHighScore4.setText("High score: " + highscore4 + " / 25");
        else {
            txtHighScore4.setText("New highscore: " + score4 + " / 25");
            SharedPreferences.Editor editor = mypref4.edit();
            editor.putInt("highscore4", score4);
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
    public void onClick(View view) {
        Intent intent = new Intent(onderwerp1.this, onderwerp1_niveau1.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent2 = new Intent(onderwerp1.this, onderwerp1_niveau2.class);
        startActivity(intent2);
    }
    public void onClick3(View view) {
        Intent intent3 = new Intent(onderwerp1.this, onderwerp1_niveau3.class);
        startActivity(intent3);
    }
    public void onClick4(View view) {
        Intent intent4 = new Intent(onderwerp1.this, onderwerp1_niveau4.class);
        startActivity(intent4);
    }

    public void onButtonClickO1HN1(View Onderwerp1_niveau1) {
        if (Onderwerp1_niveau1.getId() == R.id.Onderwerp1_Hoofdsteden_Niveau1) {
            Intent O1HN1 = new Intent(onderwerp1.this, onderwerp1_niveau1.class);
            startActivity(O1HN1);
        }
    }
    public void onButtonClickO1HN2(View Onderwerp1_niveau2) {
        if (Onderwerp1_niveau2.getId() == R.id.Onderwerp1_Hoofdsteden_Niveau2) {
            Intent O1HN2 = new Intent(onderwerp1.this, onderwerp1_niveau2.class);
            startActivity(O1HN2);
        }
    }
    public void onButtonClickO1HN3(View Onderwerp1_niveau3) {
        if (Onderwerp1_niveau3.getId() == R.id.Onderwerp1_Hoofdsteden_Niveau3) {
            Intent O1HN3 = new Intent(onderwerp1.this, onderwerp1_niveau3.class);
            startActivity(O1HN3);
        }
    }
    public void onButtonClickO1HN4(View Onderwerp1_niveau4) {
        if (Onderwerp1_niveau4.getId() == R.id.Onderwerp1_Hoofdsteden_Niveau4) {
            Intent O1HN4 = new Intent(onderwerp1.this, onderwerp1_niveau4.class);
            startActivity(O1HN4);
        }
    }
}
