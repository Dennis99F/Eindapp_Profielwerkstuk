package com.example.dennis.vakantie_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class de_test_vragen extends AppCompatActivity {

    private vragenlijst_de_test_vragen mQuestionLibrary100 = new vragenlijst_de_test_vragen();

    private TextView mScoreView100;
    private TextView mQuestionView100;
    private Button mButtonChoice100;
    private Button mButtonChoice101;
    private Button mButtonChoice102;
    private Button mButtonChoice103;

    public Pair<Integer, String> Egypte = new Pair<>(0, "Egypte");
    public Pair<Integer, String> Marokko = new Pair<>(0, "Marokko");
    public Pair<Integer, String> Tanzania = new Pair<>(0, "Tanzania");
    public Pair<Integer, String> Zuid_Afrika = new Pair<>(0, "Zuid-Afrika");
    public Pair<Integer, String> China = new Pair<>(0, "China");
    public Pair<Integer, String> Indonesië = new Pair<>(0, "Indonesië");
    public Pair<Integer, String> Japan = new Pair<>(0, "Japan");
    public Pair<Integer, String> Thailand = new Pair<>(0, "Thailand");
    public Pair<Integer, String> Duitsland = new Pair<>(0, "Duitsland");
    public Pair<Integer, String> Engeland = new Pair<>(0, "Engeland");
    public Pair<Integer, String> Frankrijk = new Pair<>(0, "Frankrijk");
    public Pair<Integer, String> Griekenland = new Pair<>(0, "Griekenland");
    public Pair<Integer, String> Italië = new Pair<>(0, "Italië");
    public Pair<Integer, String> Kroatië = new Pair<>(0, "Kroatië");
    public Pair<Integer, String> Nederland = new Pair<>(0, "Nederland");
    public Pair<Integer, String> Oostenrijk = new Pair<>(0, "Oostenrijk");
    public Pair<Integer, String> Spanje = new Pair<>(0, "Spanje");
    public Pair<Integer, String> Zweden = new Pair<>(0, "Zweden");
    public Pair<Integer, String> Costa_Rica = new Pair<>(0, "Costa Rica");
    public Pair<Integer, String> Curacao = new Pair<>(0, "Curacao");
    public Pair<Integer, String> Canada = new Pair<>(0, "Canada");
    public Pair<Integer, String> VS = new Pair<>(0, "VS");
    public Pair<Integer, String> Australië = new Pair<>(0, "Australië");
    public Pair<Integer, String> Nieuw_Zeeland = new Pair<>(0, "Nieuw-Zeeland");
    public Pair<Integer, String> Argentinië = new Pair<>(0, "Argentinië");
    public Pair<Integer, String> Brazilië = new Pair<>(0, "Brazilië");
    public Pair<Integer, String> Chili = new Pair<>(0, "Chili");
    public Pair<Integer, String> Vakantiebestemming = new Pair<>(0,"Vakantiebestemming");


    private int mScoreEgypte = 0;
    private int mScoreMarokko = 0;
    private int mScoreTanzania = 0;
    private int mScoreZuid_Afrika = 0;
    private int mScoreChina = 0;
    private int mScoreIndonesië = 0;
    private int mScoreJapan = 0;
    private int mScoreThailand = 0;
    private int mScoreDuitsland = 0;
    private int mScoreEngeland = 0;
    private int mScoreFrankrijk = 0;
    private int mScoreGriekenland = 0;
    private int mScoreItalië = 0;
    private int mScoreKroatië = 0;
    private int mScoreNederland = 0;
    private int mScoreOostenrijk = 0;
    private int mScoreSpanje = 0;
    private int mScoreZweden = 0;
    private int mScoreCostaRica = 0;
    private int mScoreCuracao = 0;
    private int mScoreCanada = 0;
    private int mScoreVS = 0;
    private int mScoreAustralië = 0;
    private int mScoreNieuw_Zeeland = 0;
    private int mScoreArgentinië = 0;
    private int mScoreBrazilië = 0;
    private int mScoreChili = 0;

    private int mQuestionNumber100 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.de_test_vragen);

        mQuestionView100 = (TextView)findViewById(R.id.question100);
        mButtonChoice100 = (Button)findViewById(R.id.choice100);
        mButtonChoice101 = (Button)findViewById(R.id.choice101);
        mButtonChoice102 = (Button)findViewById(R.id.choice102);
        mButtonChoice103 = (Button)findViewById(R.id.choice103);

        updateQuestion100();

        //Start of Button Listener for Button1
        mButtonChoice100.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice100.getText() == "Kort"){

                    Duitsland = verhoogscore(Duitsland);
                    Engeland = verhoogscore(Engeland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Italië = verhoogscore(Italië);
                    Kroatië = verhoogscore(Kroatië);
                    Nederland = verhoogscore(Nederland);
                    Oostenrijk = verhoogscore(Oostenrijk);
                    Spanje = verhoogscore(Spanje);

                    mScoreDuitsland++;
                    mScoreEngeland++;
                    mScoreFrankrijk++;
                    mScoreItalië++;
                    mScoreKroatië++;
                    mScoreNederland++;
                    mScoreOostenrijk++;
                    mScoreSpanje++;
                    updateQuestion100();


                }else if (mButtonChoice100.getText() == "Vliegtuig"){
                    Egypte = verhoogscore(Egypte);
                    Marokko = verhoogscore(Marokko);
                    Tanzania = verhoogscore(Tanzania);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    China = verhoogscore(China);
                    Indonesië = verhoogscore(Indonesië);
                    Japan = verhoogscore(Japan);
                    Thailand = verhoogscore(Thailand);
                    Griekenland = verhoogscore(Griekenland);
                    Spanje = verhoogscore(Spanje);
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Curacao = verhoogscore(Curacao);
                    Canada = verhoogscore(Canada);
                    VS = verhoogscore(VS);
                    Australië = verhoogscore(Australië);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Argentinië = verhoogscore(Argentinië);
                    Brazilië = verhoogscore(Brazilië);
                    Chili = verhoogscore(Chili);

                    mScoreEgypte++;
                    mScoreMarokko++;
                    mScoreTanzania++;
                    mScoreZuid_Afrika++;
                    mScoreChina++;
                    mScoreIndonesië++;
                    mScoreJapan++;
                    mScoreThailand++;
                    mScoreGriekenland++;
                    mScoreSpanje++;
                    mScoreCostaRica++;
                    mScoreCuracao++;
                    mScoreCanada++;
                    mScoreVS++;
                    mScoreAustralië++;
                    mScoreNieuw_Zeeland++;
                    mScoreArgentinië++;
                    mScoreBrazilië++;
                    mScoreChili++;
                    updateQuestion100();

                }else if (mButtonChoice100.getText() =="Vechtsport"){
                    China = verhoogscore(China);
                    Thailand = verhoogscore(Thailand);
                    VS = verhoogscore(VS);
                    Japan = verhoogscore(Japan);
                    Engeland = verhoogscore(Engeland);
                    Spanje = verhoogscore(Spanje);

                    mScoreChina++;
                    mScoreThailand++;
                    mScoreVS++;
                    mScoreJapan++;
                    mScoreEngeland++;
                    mScoreSpanje++;
                    updateQuestion100();

                }else if (mButtonChoice100.getText() =="Natuur"){
                    Tanzania = verhoogscore(Tanzania);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    China = verhoogscore(China);
                    Indonesië = verhoogscore(Indonesië);
                    Thailand = verhoogscore(Thailand);
                    Griekenland = verhoogscore(Griekenland);
                    Oostenrijk = verhoogscore(Oostenrijk);
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Canada = verhoogscore(Canada);
                    VS = verhoogscore(VS);
                    Australië = verhoogscore(Australië);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Brazilië = verhoogscore(Brazilië);


                    mScoreTanzania++;
                    mScoreZuid_Afrika++;
                    mScoreChina++;
                    mScoreIndonesië++;
                    mScoreThailand++;
                    mScoreGriekenland++;
                    mScoreOostenrijk++;
                    mScoreCostaRica++;
                    mScoreCanada++;
                    mScoreVS++;
                    mScoreAustralië++;
                    mScoreNieuw_Zeeland++;
                    mScoreBrazilië++;
                    updateQuestion100();

                }else if (mButtonChoice100.getText() =="Hotel"){
                    China = verhoogscore(China);
                    Canada = verhoogscore(Canada);
                    VS = verhoogscore(VS);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Chili = verhoogscore(Chili);
                    Argentinië = verhoogscore(Argentinië);
                    Brazilië = verhoogscore(Brazilië);
                    Oostenrijk = verhoogscore(Oostenrijk);
                    Frankrijk = verhoogscore(Frankrijk);
                    Engeland = verhoogscore(Engeland);
                    Australië = verhoogscore(Australië);
                    Italië = verhoogscore(Italië);

                    mScoreChina++;
                    mScoreChili++;
                    mScoreCanada++;
                    mScoreVS++;
                    mScoreNieuw_Zeeland++;
                    mScoreArgentinië++;
                    mScoreBrazilië++;
                    mScoreOostenrijk++;
                    mScoreFrankrijk++;
                    mScoreEngeland++;
                    mScoreAustralië++;
                    mScoreItalië++;
                    updateQuestion100();

                }else if (mButtonChoice100.getText() =="Westers"){
                    Duitsland = verhoogscore(Duitsland);
                    Engeland = verhoogscore(Engeland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Italië = verhoogscore(Italië);
                    Kroatië = verhoogscore(Kroatië);
                    Nederland = verhoogscore(Nederland);
                    Oostenrijk = verhoogscore(Oostenrijk);
                    Spanje = verhoogscore(Spanje);
                    Zweden = verhoogscore(Zweden);
                    VS = verhoogscore(VS);
                    Australië = verhoogscore(Australië);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Canada = verhoogscore(Canada);
                    Curacao = verhoogscore(Curacao);

                    mScoreDuitsland++;
                    mScoreEngeland++;
                    mScoreFrankrijk++;
                    mScoreItalië++;
                    mScoreKroatië++;
                    mScoreNederland++;
                    mScoreOostenrijk++;
                    mScoreSpanje++;
                    mScoreZweden++;
                    mScoreVS++;
                    mScoreAustralië++;
                    mScoreNieuw_Zeeland++;
                    mScoreCanada++;
                    mScoreCuracao++;
                    updateQuestion100();

                }else if (mButtonChoice100.getText() =="Olifant"){
                    Tanzania = verhoogscore(Tanzania);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    Thailand = verhoogscore(Thailand);

                    mScoreTanzania++;
                    mScoreZuid_Afrika++;
                    mScoreThailand++;
                    updateQuestion100();

                }else if(mButtonChoice100.getText() =="Moderne Stad"){
                    VS = verhoogscore(VS);
                    Japan = verhoogscore(Japan);
                    Canada = verhoogscore(Canada);
                    Nederland = verhoogscore(Nederland);
                    China = verhoogscore(China);
                    Brazilië = verhoogscore(Brazilië);
                    Australië = verhoogscore(Australië);
                    Argentinië = verhoogscore(Argentinië);
                    Duitsland = verhoogscore(Duitsland);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);

                    mScoreVS++;
                    mScoreJapan++;
                    mScoreCanada++;
                    mScoreNederland++;
                    mScoreChina++;
                    mScoreBrazilië++;
                    mScoreAustralië++;
                    mScoreArgentinië++;
                    mScoreDuitsland++;
                    mScoreNieuw_Zeeland++;
                    updateQuestion100();
                }
                else{
                    updateQuestion100();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice101.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice101.getText() == "Lang"){
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    China = verhoogscore(China);
                    Indonesië = verhoogscore(Indonesië);
                    Japan = verhoogscore(Japan);
                    Thailand = verhoogscore(Thailand);
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Curacao = verhoogscore(Curacao);
                    Canada = verhoogscore(Canada);
                    VS = verhoogscore(VS);
                    Australië = verhoogscore(Australië);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Argentinië = verhoogscore(Argentinië);
                    Brazilië = verhoogscore(Brazilië);
                    Chili = verhoogscore(Chili);

                    mScoreZuid_Afrika++;
                    mScoreChina++;
                    mScoreIndonesië++;
                    mScoreJapan++;
                    mScoreThailand++;
                    mScoreCostaRica++;
                    mScoreCuracao++;
                    mScoreCanada++;
                    mScoreVS++;
                    mScoreAustralië++;
                    mScoreNieuw_Zeeland++;
                    mScoreArgentinië++;
                    mScoreBrazilië++;
                    mScoreChili++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText() == "Auto"){
                    Duitsland = verhoogscore(Duitsland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Italië = verhoogscore(Italië);
                    Nederland = verhoogscore(Nederland);
                    Oostenrijk = verhoogscore(Oostenrijk);
                    Zweden = verhoogscore(Zweden);

                    mScoreDuitsland++;
                    mScoreFrankrijk++;
                    mScoreItalië++;
                    mScoreNederland++;
                    mScoreOostenrijk++;
                    mScoreZweden++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText() =="Wandelen"){
                    Nederland = verhoogscore(Nederland);
                    Oostenrijk = verhoogscore(Oostenrijk);
                    Canada = verhoogscore(Canada);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Zweden = verhoogscore(Zweden);
                    Frankrijk = verhoogscore(Frankrijk);
                    Kroatië = verhoogscore(Kroatië);
                    Engeland = verhoogscore(Engeland);
                    Duitsland = verhoogscore(Duitsland);
                    Spanje = verhoogscore(Spanje);

                    mScoreNederland++;
                    mScoreOostenrijk++;
                    mScoreCanada++;
                    mScoreNieuw_Zeeland++;
                    mScoreZweden++;
                    mScoreFrankrijk++;
                    mScoreKroatië++;
                    mScoreEngeland++;
                    mScoreDuitsland++;
                    mScoreSpanje++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText() =="Cultuur"){
                    Egypte = verhoogscore(Egypte);
                    Marokko = verhoogscore(Marokko);
                    China = verhoogscore(China);
                    Japan = verhoogscore(Japan);
                    Argentinië = verhoogscore(Argentinië);
                    Chili = verhoogscore(Chili);
                    Brazilië = verhoogscore(Brazilië);

                    mScoreEgypte++;
                    mScoreMarokko++;
                    mScoreChina++;
                    mScoreJapan++;
                    mScoreArgentinië++;
                    mScoreChili++;
                    mScoreBrazilië++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText()=="Camping"){
                    Duitsland = verhoogscore(Duitsland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Italië = verhoogscore(Italië);
                    Zweden = verhoogscore(Zweden);
                    Oostenrijk = verhoogscore(Oostenrijk);
                    Nederland = verhoogscore(Nederland);
                    Kroatië = verhoogscore(Kroatië);

                    mScoreDuitsland++;
                    mScoreFrankrijk++;
                    mScoreItalië++;
                    mScoreZweden++;
                    mScoreOostenrijk++;
                    mScoreNederland++;
                    mScoreKroatië++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText()=="Rijsttafel"){
                    China = verhoogscore(China);
                    Indonesië = verhoogscore(Indonesië);
                    Thailand = verhoogscore(Thailand);

                    mScoreChina++;
                    mScoreIndonesië++;
                    mScoreThailand++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText()=="Slang"){
                    Egypte = verhoogscore(Egypte);
                    Marokko = verhoogscore(Marokko);
                    China = verhoogscore(China);
                    Thailand = verhoogscore(Thailand);
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Indonesië = verhoogscore(Indonesië);
                    Japan = verhoogscore(Japan);
                    Brazilië = verhoogscore(Brazilië);
                    Chili = verhoogscore(Chili);
                    Australië = verhoogscore(Australië);

                    mScoreEgypte++;
                    mScoreMarokko++;
                    mScoreChina++;
                    mScoreThailand++;
                    mScoreCostaRica++;
                    mScoreIndonesië++;
                    mScoreJapan++;
                    mScoreBrazilië++;
                    mScoreChili++;
                    mScoreAustralië++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText()=="Authentieke Stad"){
                    Duitsland = verhoogscore(Duitsland);
                    Engeland = verhoogscore(Engeland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Italië = verhoogscore(Italië);
                    Kroatië = verhoogscore(Kroatië);
                    Spanje = verhoogscore(Spanje);
                    Zweden = verhoogscore(Zweden);
                    Egypte = verhoogscore(Egypte);
                    Japan = verhoogscore(Japan);
                    Griekenland = verhoogscore(Griekenland);
                    Oostenrijk = verhoogscore(Oostenrijk);

                    mScoreDuitsland++;
                    mScoreEngeland++;
                    mScoreFrankrijk++;
                    mScoreItalië++;
                    mScoreKroatië++;
                    mScoreSpanje++;
                    mScoreZweden++;
                    mScoreEgypte++;
                    mScoreJapan++;
                    mScoreGriekenland++;
                    mScoreOostenrijk++;
                    updateQuestion100();
                }
                else{
                    updateQuestion100();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice102.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice102.getText() == "Gemiddeld") {
                    Egypte = verhoogscore(Egypte);
                    Zweden = verhoogscore(Zweden);
                    Griekenland = verhoogscore(Griekenland);
                    Marokko = verhoogscore(Marokko);
                    Tanzania = verhoogscore(Tanzania);

                    mScoreEgypte++;
                    mScoreZweden++;
                    mScoreGriekenland++;
                    mScoreMarokko++;
                    mScoreTanzania++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Trein") {
                    Duitsland = verhoogscore(Duitsland);
                    Engeland = verhoogscore(Engeland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Nederland = verhoogscore(Nederland);

                    mScoreDuitsland++;
                    mScoreEngeland++;
                    mScoreFrankrijk++;
                    mScoreNederland++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Zwemmen") {
                    Brazilië =  verhoogscore(Brazilië);
                    Thailand = verhoogscore(Thailand);
                    Frankrijk = verhoogscore(Frankrijk);
                    Spanje = verhoogscore(Spanje);
                    Italië = verhoogscore(Italië);
                    Curacao = verhoogscore(Curacao);
                    Griekenland = verhoogscore(Griekenland);

                    mScoreBrazilië++;
                    mScoreThailand++;
                    mScoreFrankrijk++;
                    mScoreSpanje++;
                    mScoreItalië++;
                    mScoreCuracao++;
                    mScoreGriekenland++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Sport") {
                    Duitsland = verhoogscore(Duitsland);
                    Engeland = verhoogscore(Engeland);
                    Nederland = verhoogscore(Nederland);
                    Spanje = verhoogscore(Spanje);
                    Brazilië = verhoogscore(Brazilië);
                    VS = verhoogscore(VS);
                    Canada = verhoogscore(Canada);

                    mScoreDuitsland++;
                    mScoreEngeland++;
                    mScoreNederland++;
                    mScoreSpanje++;
                    mScoreBrazilië++;
                    mScoreVS++;
                    mScoreCanada++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Resort") {
                    Tanzania = verhoogscore(Tanzania);
                    Curacao = verhoogscore(Curacao);
                    Griekenland = verhoogscore(Griekenland);
                    Egypte = verhoogscore(Egypte);
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Indonesië = verhoogscore(Indonesië);
                    Marokko = verhoogscore(Marokko);

                    mScoreTanzania++;
                    mScoreCuracao++;
                    mScoreGriekenland++;
                    mScoreEgypte++;
                    mScoreCostaRica++;
                    mScoreIndonesië++;
                    mScoreMarokko++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Vleesgerecht") {
                    Frankrijk = verhoogscore(Frankrijk);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    Brazilië = verhoogscore(Brazilië);
                    Argentinië = verhoogscore(Argentinië);
                    Griekenland = verhoogscore(Griekenland);

                    mScoreFrankrijk++;
                    mScoreZuid_Afrika++;
                    mScoreBrazilië++;
                    mScoreArgentinië++;
                    mScoreGriekenland++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Beer") {
                    VS = verhoogscore(VS);
                    Canada = verhoogscore(Canada);
                    Zweden = verhoogscore(Zweden);

                    mScoreVS++;
                    mScoreCanada++;
                    mScoreZweden++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Traditioneel dorp"){
                    Marokko = verhoogscore(Marokko);
                    Tanzania = verhoogscore(Tanzania);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    Thailand = verhoogscore(Thailand);
                    Indonesië = verhoogscore(Indonesië);

                    mScoreMarokko++;
                    mScoreTanzania++;
                    mScoreZuid_Afrika++;
                    mScoreThailand++;
                    mScoreIndonesië++;
                    updateQuestion100();

                }else {
                    updateQuestion100();
                }
            }
        });
        //End of Button Listener for Button3

        //Start of Button Listener for Button4
        mButtonChoice103.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice103.getText() == "Maakt niet uit") {
                    Egypte = verhoogscore(Egypte);
                    Marokko = verhoogscore(Marokko);
                    Tanzania = verhoogscore(Tanzania);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    China = verhoogscore(China);
                    Indonesië = verhoogscore(Indonesië);
                    Japan = verhoogscore(Japan);
                    Thailand = verhoogscore(Thailand);
                    Duitsland = verhoogscore(Duitsland);
                    Engeland = verhoogscore(Engeland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Griekenland = verhoogscore(Griekenland);
                    Italië = verhoogscore(Italië);
                    Kroatië = verhoogscore(Kroatië);
                    Nederland = verhoogscore(Nederland);
                    Oostenrijk = verhoogscore(Oostenrijk);
                    Spanje = verhoogscore(Spanje);
                    Zweden = verhoogscore(Zweden);
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Curacao = verhoogscore(Curacao);
                    Canada = verhoogscore(Canada);
                    VS = verhoogscore(VS);
                    Australië = verhoogscore(Australië);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Argentinië = verhoogscore(Argentinië);
                    Brazilië = verhoogscore(Brazilië);
                    Chili = verhoogscore(Chili);

                    mScoreEgypte++;
                    mScoreMarokko++;
                    mScoreTanzania++;
                    mScoreZuid_Afrika++;
                    mScoreChina++;
                    mScoreIndonesië++;
                    mScoreJapan++;
                    mScoreThailand++;
                    mScoreDuitsland++;
                    mScoreEngeland++;
                    mScoreFrankrijk++;
                    mScoreGriekenland++;
                    mScoreItalië++;
                    mScoreKroatië++;
                    mScoreNederland++;
                    mScoreOostenrijk++;
                    mScoreSpanje++;
                    mScoreZweden++;
                    mScoreCostaRica++;
                    mScoreCuracao++;
                    mScoreCanada++;
                    mScoreVS++;
                    mScoreAustralië++;
                    mScoreNieuw_Zeeland++;
                    mScoreArgentinië++;
                    mScoreBrazilië++;
                    mScoreChili++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Boot") {
                    Kroatië = verhoogscore(Kroatië);
                    Italië = verhoogscore(Italië);
                    Curacao = verhoogscore(Curacao);
                    VS = verhoogscore(VS);
                    Engeland = verhoogscore(Engeland);

                    mScoreKroatië++;
                    mScoreItalië++;
                    mScoreCuracao++;
                    mScoreVS++;
                    mScoreEngeland++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Bezienswaardigheden") {
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Egypte = verhoogscore(Egypte);
                    Tanzania = verhoogscore(Tanzania);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    China = verhoogscore(China);
                    Japan = verhoogscore(Japan);
                    Thailand = verhoogscore(Thailand);
                    VS = verhoogscore(VS);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Argentinië = verhoogscore(Argentinië);

                    mScoreCostaRica++;
                    mScoreEgypte++;
                    mScoreTanzania++;
                    mScoreZuid_Afrika++;
                    mScoreChina++;
                    mScoreJapan++;
                    mScoreThailand++;
                    mScoreVS++;
                    mScoreNieuw_Zeeland++;
                    mScoreArgentinië++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Uitrusten") {
                    Duitsland = verhoogscore(Duitsland);
                    Nederland = verhoogscore(Nederland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Griekenland = verhoogscore(Griekenland);
                    Spanje = verhoogscore(Spanje);
                    Italië = verhoogscore(Italië);
                    Kroatië = verhoogscore(Kroatië);

                    mScoreDuitsland++;
                    mScoreNederland++;
                    mScoreFrankrijk++;
                    mScoreGriekenland++;
                    mScoreSpanje++;
                    mScoreItalië++;
                    mScoreKroatië++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Backpacking") {
                    Thailand = verhoogscore(Thailand);
                    Japan = verhoogscore(Japan);
                    VS = verhoogscore(VS);
                    Argentinië = verhoogscore(Argentinië);
                    Chili = verhoogscore(Chili);
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Brazilië = verhoogscore(Brazilië);
                    Indonesië = verhoogscore(Indonesië);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);

                    mScoreThailand++;
                    mScoreJapan++;
                    mScoreVS++;
                    mScoreArgentinië++;
                    mScoreChili++;
                    mScoreCostaRica++;
                    mScoreBrazilië++;
                    mScoreIndonesië++;
                    mScoreZuid_Afrika++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Mee-eten met tradities") {
                    Egypte = verhoogscore(Egypte);
                    Marokko = verhoogscore(Marokko);
                    Tanzania = verhoogscore(Tanzania);
                    Japan = verhoogscore(Japan);
                    Chili = verhoogscore(Chili);
                    China = verhoogscore(China);
                    Costa_Rica = verhoogscore(Costa_Rica);

                    mScoreEgypte++;
                    mScoreMarokko++;
                    mScoreTanzania++;
                    mScoreJapan++;
                    mScoreChili++;
                    mScoreChina++;
                    mScoreCostaRica++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Vogel") {
                    Duitsland = verhoogscore(Duitsland);
                    Frankrijk = verhoogscore(Frankrijk);
                    Kroatië = verhoogscore(Kroatië);
                    Nederland = verhoogscore(Nederland);
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Brazilië = verhoogscore(Brazilië);
                    Nieuw_Zeeland = verhoogscore(Nieuw_Zeeland);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    Curacao = verhoogscore(Curacao);

                    mScoreDuitsland++;
                    mScoreFrankrijk++;
                    mScoreKroatië++;
                    mScoreNederland++;
                    mScoreCostaRica++;
                    mScoreBrazilië++;
                    mScoreNieuw_Zeeland++;
                    mScoreZuid_Afrika++;
                    mScoreCuracao++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Natuurlandschap"){
                    Costa_Rica = verhoogscore(Costa_Rica);
                    Chili = verhoogscore(Chili);
                    Tanzania = verhoogscore(Tanzania);
                    Zuid_Afrika = verhoogscore(Zuid_Afrika);
                    VS = verhoogscore(VS);
                    Indonesië = verhoogscore(Indonesië);
                    Thailand = verhoogscore(Thailand);

                    mScoreCostaRica++;
                    mScoreChili++;
                    mScoreTanzania++;
                    mScoreZuid_Afrika++;
                    mScoreVS++;
                    mScoreIndonesië++;
                    mScoreThailand++;
                    updateQuestion100();
                }else {
                    updateQuestion100();
                }
            }
        });
        //End of Button Listener for Button4
    }

    private Pair<Integer, String> verhoogscore(Pair<Integer, String>land){
        return new Pair<>(land.first + 1, land.second);
    }


    public Pair<Integer, String> HoogsteLand(){
        List<Pair<Integer, String>> alleLanden = new ArrayList<>();

        alleLanden.add(Egypte);
        alleLanden.add(Marokko);
        alleLanden.add(Tanzania);
        alleLanden.add(Zuid_Afrika);
        alleLanden.add(China);
        alleLanden.add(Indonesië);
        alleLanden.add(Japan);
        alleLanden.add(Thailand);
        alleLanden.add(Duitsland);
        alleLanden.add(Engeland);
        alleLanden.add(Frankrijk);
        alleLanden.add(Griekenland);
        alleLanden.add(Italië);
        alleLanden.add(Kroatië);
        alleLanden.add(Nederland);
        alleLanden.add(Oostenrijk);
        alleLanden.add(Spanje);
        alleLanden.add(Zweden);
        alleLanden.add(Costa_Rica);
        alleLanden.add(Curacao);
        alleLanden.add(Canada);
        alleLanden.add(VS);
        alleLanden.add(Australië);
        alleLanden.add(Nieuw_Zeeland);
        alleLanden.add(Argentinië);
        alleLanden.add(Brazilië);
        alleLanden.add(Chili);


        Pair<Integer, String> Hoogste = alleLanden.get(0);

        for (int i =0; i<alleLanden.size(); i++){
            if(Hoogste.first< alleLanden.get(i).first){
                Hoogste = alleLanden.get(i);
            }
        }
        return Hoogste;
    }




    public void updateQuestion100() {
        if(mQuestionNumber100<mQuestionLibrary100.getLength100() ) {
            mQuestionView100.setText(mQuestionLibrary100.getQuestion100(mQuestionNumber100));
            mButtonChoice100.setText(mQuestionLibrary100.getChoice100(mQuestionNumber100));
            mButtonChoice101.setText(mQuestionLibrary100.getChoice101(mQuestionNumber100));
            mButtonChoice102.setText(mQuestionLibrary100.getChoice102(mQuestionNumber100));
            mButtonChoice103.setText(mQuestionLibrary100.getChoice103(mQuestionNumber100));
            mQuestionNumber100++;
        }
            else{
            Toast.makeText(de_test_vragen.this, "Uw favoriete vakantiebestemming is " + HoogsteLand().second + "! De bijbehorende score is " + HoogsteLand().first + ".", Toast.LENGTH_LONG).show();
            Toast.makeText(de_test_vragen.this, "Uw favoriete vakantiebestemming is " + HoogsteLand().second + "! De bijbehorende score is " + HoogsteLand().first + ".", Toast.LENGTH_LONG).show();
                Intent intent300 = new Intent(de_test_vragen.this, favoriete_vakantiebestemming.class);
                intent300.putExtra(Egypte.second, Egypte.first);
                intent300.putExtra(Marokko.second, Marokko.first);
                intent300.putExtra(Tanzania.second, Tanzania.first);
                intent300.putExtra(Zuid_Afrika.second, Zuid_Afrika.first);
                intent300.putExtra(China.second, China.first);
                intent300.putExtra(Indonesië.second, Indonesië.first);
                intent300.putExtra(Japan.second, Japan.first);
                intent300.putExtra(Thailand.second, Thailand.first);
                intent300.putExtra(Duitsland.second, Duitsland.first);
                intent300.putExtra(Engeland.second, Engeland.first);
                intent300.putExtra(Frankrijk.second, Frankrijk.first);
                intent300.putExtra(Griekenland.second, Griekenland.first);
                intent300.putExtra(Italië.second, Italië.first);
                intent300.putExtra(Kroatië.second, Kroatië.first);
                intent300.putExtra(Nederland.second, Nederland.first);
                intent300.putExtra(Oostenrijk.second, Oostenrijk.first);
                intent300.putExtra(Spanje.second, Spanje.first);
                intent300.putExtra(Zweden.second, Zweden.first);
                intent300.putExtra(Costa_Rica.second, Costa_Rica.first);
                intent300.putExtra(Curacao.second, Curacao.first);
                intent300.putExtra(Canada.second, Canada.first);
                intent300.putExtra(VS.second, VS.first);
                intent300.putExtra(Australië.second, Australië.first);
                intent300.putExtra(Nieuw_Zeeland.second, Nieuw_Zeeland.first);
                intent300.putExtra(Argentinië.second, Argentinië.first);
                intent300.putExtra(Brazilië.second, Brazilië.first);
                intent300.putExtra(Chili.second, Chili.first);
                intent300.putExtra(HoogsteLand().second, HoogsteLand().first);
            startActivity(intent300);
            }
        }


}