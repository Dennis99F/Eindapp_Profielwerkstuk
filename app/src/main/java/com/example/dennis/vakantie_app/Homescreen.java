package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class Homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
    }

    public void onButtonClickVB (View Vakantiebestemmingen) {
        if (Vakantiebestemmingen.getId() == R.id.Wdisplay) {
            Intent Vb = new Intent(Homescreen.this, second.class);
            startActivity(Vb);
        }
    }
    public void onButtonClickVB2 (View De_Test) {
        if (De_Test.getId() == R.id.Wdisplay2) {
            Intent Vb2 = new Intent(Homescreen.this, de_test_screen.class);
            startActivity(Vb2);
        }
    }
    public void onButtonClickVB3 (View Quiz) {
        if (Quiz.getId() == R.id.Wdisplay3) {
            Intent Vb3 = new Intent(Homescreen.this, quiz_screen.class);
            startActivity(Vb3);
        }
    }
}
