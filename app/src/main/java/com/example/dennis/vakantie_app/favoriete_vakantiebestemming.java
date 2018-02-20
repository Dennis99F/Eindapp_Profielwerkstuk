package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Dennis on 9-9-2017.
 */


public class favoriete_vakantiebestemming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoriete_vakantiebestemming);
        if (getSupportActionBar() != null) ;

        TextView txtScoreEgypte = (TextView) findViewById(R.id.textScoreEgypte);
        Intent intent200 = getIntent();
        int Egypte = intent200.getIntExtra("Egypte", 0);
        txtScoreEgypte.setText("Egypte: " + Egypte);

        TextView txtScoreMarokko = (TextView) findViewById(R.id.textScoreMarokko);
        Intent intent201 = getIntent();
        int Marokko = intent201.getIntExtra("Marokko", 0);
        txtScoreMarokko.setText("Marokko: " + Marokko);

        TextView txtScoreTanzania = (TextView) findViewById(R.id.textScoreTanzania);
        Intent intent202 = getIntent();
        int Tanzania = intent202.getIntExtra("Tanzania", 0);
        txtScoreTanzania.setText("Tanzania: " + Tanzania);

        TextView txtScoreZuid_Afrika = (TextView) findViewById(R.id.textScoreZuid_Afrika);
        Intent intent203 = getIntent();
        int Zuid_Afrika = intent203.getIntExtra("Zuid-Afrika", 0);
        txtScoreZuid_Afrika.setText("Zuid-Afrika: " + Zuid_Afrika);

        TextView txtScoreChina = (TextView) findViewById(R.id.textScoreChina);
        Intent intent204 = getIntent();
        int China = intent204.getIntExtra("China", 0);
        txtScoreChina.setText("China: " + China);

        TextView txtScoreIndonesië = (TextView) findViewById(R.id.textScoreIndonesië);
        Intent intent205 = getIntent();
        int Indonesië = intent205.getIntExtra("Indonesië", 0);
        txtScoreIndonesië.setText("Indonesië: " + Indonesië);

        TextView txtScoreJapan = (TextView) findViewById(R.id.textScoreJapan);
        Intent intent206 = getIntent();
        int Japan = intent206.getIntExtra("Japan", 0);
        txtScoreJapan.setText("Japan: " + Japan);

        TextView txtScoreThailand = (TextView) findViewById(R.id.textScoreThailand);
        Intent intent207 = getIntent();
        int Thailand = intent207.getIntExtra("Thailand", 0);
        txtScoreThailand.setText("Thailand: " + Thailand);

        TextView txtScoreDuitsland = (TextView) findViewById(R.id.textScoreDuitsland);
        Intent intent208 = getIntent();
        int Duitsland = intent208.getIntExtra("Duitsland", 0);
        txtScoreDuitsland.setText("Duitsland: " + Duitsland);

        TextView txtScoreEngeland = (TextView) findViewById(R.id.textScoreEngeland);
        Intent intent209 = getIntent();
        int Engeland = intent209.getIntExtra("Engeland", 0);
        txtScoreEngeland.setText("Engeland: " + Engeland);

        TextView txtScoreFrankrijk = (TextView) findViewById(R.id.textScoreFrankrijk);
        Intent intent210 = getIntent();
        int Frankrijk = intent210.getIntExtra("Frankrijk", 0);
        txtScoreFrankrijk.setText("Frankrijk: " + Frankrijk);

        TextView txtScoreGriekenland = (TextView) findViewById(R.id.textScoreGriekenland);
        Intent intent211 = getIntent();
        int Griekenland = intent211.getIntExtra("Griekenland", 0);
        txtScoreGriekenland.setText("Griekenland: " + Griekenland);

        TextView txtScoreItalië = (TextView) findViewById(R.id.textScoreItalië);
        Intent intent212 = getIntent();
        int Italië = intent212.getIntExtra("Italië", 0);
        txtScoreItalië.setText("Italië: " + Italië);

        TextView txtScoreKroatië = (TextView) findViewById(R.id.textScoreKroatië);
        Intent intent213 = getIntent();
        int Kroatië = intent213.getIntExtra("Kroatië", 0);
        txtScoreKroatië.setText("Kroatië: " + Kroatië);

        TextView txtScoreNederland = (TextView) findViewById(R.id.textScoreNederland);
        Intent intent214 = getIntent();
        int Nederland = intent214.getIntExtra("Nederland", 0);
        txtScoreNederland.setText("Nederland: " + Nederland);

        TextView txtScoreOostenrijk = (TextView) findViewById(R.id.textScoreOostenrijk);
        Intent intent215 = getIntent();
        int Oostenrijk = intent215.getIntExtra("Oostenrijk", 0);
        txtScoreOostenrijk.setText("Oostenrijk: " + Oostenrijk);

        TextView txtScoreSpanje = (TextView) findViewById(R.id.textScoreSpanje);
        Intent intent216 = getIntent();
        int Spanje = intent216.getIntExtra("Spanje", 0);
        txtScoreSpanje.setText("Spanje: " + Spanje);

        TextView txtScoreZweden = (TextView) findViewById(R.id.textScoreZweden);
        Intent intent217 = getIntent();
        int Zweden = intent217.getIntExtra("Zweden", 0);
        txtScoreZweden.setText("Zweden: " + Zweden);

        TextView txtScoreCostaRica = (TextView) findViewById(R.id.textScoreCostaRica);
        Intent intent218 = getIntent();
        int Costa_Rica = intent218.getIntExtra("Costa Rica", 0);
        txtScoreCostaRica.setText("Costa Rica: " + Costa_Rica);

        TextView txtScoreCuracao = (TextView) findViewById(R.id.textScoreCuracao);
        Intent intent219 = getIntent();
        int Curacao = intent219.getIntExtra("Curacao", 0);
        txtScoreCuracao.setText("Curacao: " + Curacao);

        TextView txtScoreCanada = (TextView) findViewById(R.id.textScoreCanada);
        Intent intent220 = getIntent();
        int Canada = intent220.getIntExtra("Canada", 0);
        txtScoreCanada.setText("Canada: " + Canada);

        TextView txtScoreVS = (TextView) findViewById(R.id.textScoreVS);
        Intent intent221 = getIntent();
        int VS = intent221.getIntExtra("VS", 0);
        txtScoreVS.setText("VS: " + VS);

        TextView txtScoreAustralië = (TextView) findViewById(R.id.textScoreAustralië);
        Intent intent222 = getIntent();
        int Australië = intent222.getIntExtra("Australië", 0);
        txtScoreAustralië.setText("Australië: " + Australië);

        TextView txtScoreNieuw_Zeeland = (TextView) findViewById(R.id.textScoreNieuw_Zeeland);
        Intent intent223 = getIntent();
        int Nieuw_Zeeland = intent223.getIntExtra("Nieuw-Zeeland", 0);
        txtScoreNieuw_Zeeland.setText("Nieuw-Zeeland: " + Nieuw_Zeeland);

        TextView txtScoreArgentinië = (TextView) findViewById(R.id.textScoreArgentinië);
        Intent intent224 = getIntent();
        int Argentinië = intent224.getIntExtra("Argentinië", 0);
        txtScoreArgentinië.setText("Argentinië: " + Argentinië);

        TextView txtScoreBrazilië = (TextView) findViewById(R.id.textScoreBrazilië);
        Intent intent225 = getIntent();
        int Brazilië = intent225.getIntExtra("Brazilië", 0);
        txtScoreBrazilië.setText("Brazilië: " + Brazilië);

        TextView txtScoreChili = (TextView) findViewById(R.id.textScoreChili);
        Intent intent226 = getIntent();
        int Chili = intent226.getIntExtra("Chili", 0);
        txtScoreChili.setText("Chili: " + Chili);


        // Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        }


    public void onButtonClickEindbestemming (View View) {
        if (6 == 6) {
            Intent Terug = new Intent(this, de_test_screen.class);
            startActivity(Terug);
        }
        else{
            Intent Terug = new Intent(this, de_test_screen.class);
            startActivity(Terug);

        }
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
