package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Dennis on 9-9-2017.
 */

public class favoriete_vakantiebestemming extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int HighestValue = 0;
        int AAP = 0;
        setContentView(R.layout.favoriete_vakantiebestemming);
        if (getSupportActionBar() != null) ;

        TextView txtScoreEgypte = (TextView) findViewById(R.id.textScoreEgypte);
        Intent intent200 = getIntent();
        int mScoreEgypte = intent200.getIntExtra("mScoreEgypte", 0);
        txtScoreEgypte.setText("Egypte: " + mScoreEgypte);

        TextView txtScoreMarokko = (TextView) findViewById(R.id.textScoreMarokko);
        Intent intent201 = getIntent();
        int mScoreMarokko = intent201.getIntExtra("mScoreMarokko", 0);
        txtScoreMarokko.setText("Marokko: " + mScoreMarokko);

        TextView txtScoreTanzania = (TextView) findViewById(R.id.textScoreTanzania);
        Intent intent202 = getIntent();
        int mScoreTanzania = intent202.getIntExtra("mScoreTanzania", 0);
        txtScoreTanzania.setText("Tanzania: " + mScoreTanzania);

        TextView txtScoreZuid_Afrika = (TextView) findViewById(R.id.textScoreZuid_Afrika);
        Intent intent203 = getIntent();
        int mScoreZuid_Afrika = intent203.getIntExtra("mScoreZuid_Afrika", 0);
        txtScoreZuid_Afrika.setText("Zuid-Afrika: " + mScoreZuid_Afrika);

        TextView txtScoreChina = (TextView) findViewById(R.id.textScoreChina);
        Intent intent204 = getIntent();
        int mScoreChina = intent204.getIntExtra("mScoreChina", 0);
        txtScoreChina.setText("China: " + mScoreChina);

        TextView txtScoreIndonesië = (TextView) findViewById(R.id.textScoreIndonesië);
        Intent intent205 = getIntent();
        int mScoreIndonesië = intent205.getIntExtra("mScoreIndonesië", 0);
        txtScoreIndonesië.setText("Indonesië: " + mScoreIndonesië);

        TextView txtScoreJapan = (TextView) findViewById(R.id.textScoreJapan);
        Intent intent206 = getIntent();
        int mScoreJapan = intent206.getIntExtra("mScoreJapan", 0);
        txtScoreJapan.setText("Japan: " + mScoreJapan);

        TextView txtScoreThailand = (TextView) findViewById(R.id.textScoreThailand);
        Intent intent207 = getIntent();
        int mScoreThailand = intent207.getIntExtra("mScoreThailand", 0);
        txtScoreThailand.setText("Thailand: " + mScoreThailand);

        TextView txtScoreDuitsland = (TextView) findViewById(R.id.textScoreDuitsland);
        Intent intent208 = getIntent();
        int mScoreDuitsland = intent208.getIntExtra("mScoreDuitsland", 0);
        txtScoreDuitsland.setText("Duitsland: " + mScoreDuitsland);

        TextView txtScoreEngeland = (TextView) findViewById(R.id.textScoreEngeland);
        Intent intent209 = getIntent();
        int mScoreEngeland = intent209.getIntExtra("mScoreEngeland", 0);
        txtScoreEngeland.setText("Engeland: " + mScoreEngeland);

        TextView txtScoreFrankrijk = (TextView) findViewById(R.id.textScoreFrankrijk);
        Intent intent210 = getIntent();
        int mScoreFrankrijk = intent210.getIntExtra("mScoreFrankrijk", 0);
        txtScoreFrankrijk.setText("Frankrijk: " + mScoreFrankrijk);

        TextView txtScoreGriekenland = (TextView) findViewById(R.id.textScoreGriekenland);
        Intent intent211 = getIntent();
        int mScoreGriekenland = intent211.getIntExtra("mScoreGriekenland", 0);
        txtScoreGriekenland.setText("Griekenland: " + mScoreGriekenland);

        TextView txtScoreItalië = (TextView) findViewById(R.id.textScoreItalië);
        Intent intent212 = getIntent();
        int mScoreItalië = intent212.getIntExtra("mScoreItalië", 0);
        txtScoreItalië.setText("Italië: " + mScoreItalië);

        TextView txtScoreKroatië = (TextView) findViewById(R.id.textScoreKroatië);
        Intent intent213 = getIntent();
        int mScoreKroatië = intent213.getIntExtra("mScoreKroatië", 0);
        txtScoreKroatië.setText("Kroatië: " + mScoreKroatië);

        TextView txtScoreNederland = (TextView) findViewById(R.id.textScoreNederland);
        Intent intent214 = getIntent();
        int mScoreNederland = intent214.getIntExtra("mScoreNederland", 0);
        txtScoreNederland.setText("Nederland: " + mScoreNederland);

        TextView txtScoreOostenrijk = (TextView) findViewById(R.id.textScoreOostenrijk);
        Intent intent215 = getIntent();
        int mScoreOostenrijk = intent215.getIntExtra("mScoreOostenrijk", 0);
        txtScoreOostenrijk.setText("Oostenrijk: " + mScoreOostenrijk);

        TextView txtScoreSpanje = (TextView) findViewById(R.id.textScoreSpanje);
        Intent intent216 = getIntent();
        int mScoreSpanje = intent216.getIntExtra("mScoreSpanje", 0);
        txtScoreSpanje.setText("Spanje: " + mScoreSpanje);

        TextView txtScoreZweden = (TextView) findViewById(R.id.textScoreZweden);
        Intent intent217 = getIntent();
        int mScoreZweden = intent217.getIntExtra("mScoreZweden", 0);
        txtScoreZweden.setText("Zweden: " + mScoreZweden);

        TextView txtScoreCostaRica = (TextView) findViewById(R.id.textScoreCostaRica);
        Intent intent218 = getIntent();
        int mScoreCostaRica = intent218.getIntExtra("mScoreCostaRica", 0);
        txtScoreCostaRica.setText("Costa Rica: " + mScoreCostaRica);

        TextView txtScoreCuracao = (TextView) findViewById(R.id.textScoreCuracao);
        Intent intent219 = getIntent();
        int mScoreCuracao = intent219.getIntExtra("mScoreCuracao", 0);
        txtScoreCuracao.setText("Curacao: " + mScoreCuracao);

        TextView txtScoreCanada = (TextView) findViewById(R.id.textScoreCanada);
        Intent intent220 = getIntent();
        int mScoreCanada = intent220.getIntExtra("mScoreCanada", 0);
        txtScoreCanada.setText("Canada: " + mScoreCanada);

        TextView txtScoreVS = (TextView) findViewById(R.id.textScoreVS);
        Intent intent221 = getIntent();
        int mScoreVS = intent221.getIntExtra("mScoreVS", 0);
        txtScoreVS.setText("VS: " + mScoreVS);

        TextView txtScoreAustralië = (TextView) findViewById(R.id.textScoreAustralië);
        Intent intent222 = getIntent();
        int mScoreAustralië = intent222.getIntExtra("mScoreAustralië", 0);
        txtScoreAustralië.setText("Australië: " + mScoreAustralië);

        TextView txtScoreNieuw_Zeeland = (TextView) findViewById(R.id.textScoreNieuw_Zeeland);
        Intent intent223 = getIntent();
        int mScoreNieuw_Zeeland = intent223.getIntExtra("mScoreNieuw_Zeeland", 0);
        txtScoreNieuw_Zeeland.setText("Nieuw-Zeeland: " + mScoreNieuw_Zeeland);

        TextView txtScoreArgentinië = (TextView) findViewById(R.id.textScoreArgentinië);
        Intent intent224 = getIntent();
        int mScoreArgentinië = intent224.getIntExtra("mScoreArgentinië", 0);
        txtScoreArgentinië.setText("Argentinië: " + mScoreArgentinië);

        TextView txtScoreBrazilië = (TextView) findViewById(R.id.textScoreBrazilië);
        Intent intent225 = getIntent();
        int mScoreBrazilië = intent225.getIntExtra("mScoreBrazilië", 0);
        txtScoreBrazilië.setText("Brazilië: " + mScoreBrazilië);

        TextView txtScoreChili = (TextView) findViewById(R.id.textScoreChili);
        Intent intent226 = getIntent();
        int mScoreChili = intent226.getIntExtra("mScoreChili", 0);
        txtScoreChili.setText("Chili: " + mScoreChili);

        // Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (mScoreCostaRica >= mScoreArgentinië) {
            HighestValue = mScoreCostaRica;
            Toast.makeText(favoriete_vakantiebestemming.this, String.valueOf(HighestValue), Toast.LENGTH_SHORT).show();
        }

    };



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
