package com.example.dennis.vakantie_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class de_test_vragen extends AppCompatActivity {

    private vragenlijst_de_test_vragen mQuestionLibrary100 = new vragenlijst_de_test_vragen();

    private TextView mScoreView100;
    private TextView mQuestionView100;
    private Button mButtonChoice100;
    private Button mButtonChoice101;
    private Button mButtonChoice102;
    private Button mButtonChoice103;

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
                    mScoreChina++;
                    mScoreThailand++;
                    mScoreVS++;
                    mScoreJapan++;
                    mScoreEngeland++;
                    mScoreSpanje++;
                    updateQuestion100();

                }else if (mButtonChoice100.getText() =="Natuur"){
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
                    mScoreChili++;
                    mScoreCanada++;
                    mScoreVS++;
                    mScoreNieuw_Zeeland++;
                    mScoreChili++;
                    mScoreArgentinië++;
                    mScoreBrazilië++;
                    mScoreOostenrijk++;
                    mScoreFrankrijk++;
                    mScoreEngeland++;
                    mScoreAustralië++;
                    mScoreItalië++;
                    updateQuestion100();

                }else if (mButtonChoice100.getText() =="Westers"){
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
                    mScoreTanzania++;
                    mScoreZuid_Afrika++;
                    mScoreThailand++;
                    updateQuestion100();

                }else if(mButtonChoice100.getText() =="Moderne Stad"){
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
                    mScoreDuitsland++;
                    mScoreFrankrijk++;
                    mScoreItalië++;
                    mScoreNederland++;
                    mScoreOostenrijk++;
                    mScoreZweden++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText() =="Wandelen"){
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
                    mScoreEgypte++;
                    mScoreMarokko++;
                    mScoreChina++;
                    mScoreJapan++;
                    mScoreArgentinië++;
                    mScoreChili++;
                    mScoreBrazilië++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText()=="Camping"){
                    mScoreDuitsland++;
                    mScoreFrankrijk++;
                    mScoreItalië++;
                    mScoreZweden++;
                    mScoreOostenrijk++;
                    mScoreNederland++;
                    mScoreKroatië++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText()=="Rijsttafel"){
                    mScoreChina++;
                    mScoreIndonesië++;
                    mScoreThailand++;
                    updateQuestion100();

                }else if(mButtonChoice101.getText()=="Slang"){
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
                    mScoreEgypte++;
                    mScoreZweden++;
                    mScoreGriekenland++;
                    mScoreMarokko++;
                    mScoreTanzania++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Trein") {
                    mScoreDuitsland++;
                    mScoreEngeland++;
                    mScoreFrankrijk++;
                    mScoreNederland++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Zwemmen") {
                    mScoreBrazilië++;
                    mScoreThailand++;
                    mScoreFrankrijk++;
                    mScoreSpanje++;
                    mScoreItalië++;
                    mScoreCuracao++;
                    mScoreGriekenland++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Sport") {
                    mScoreDuitsland++;
                    mScoreEngeland++;
                    mScoreNederland++;
                    mScoreSpanje++;
                    mScoreBrazilië++;
                    mScoreVS++;
                    mScoreCanada++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Resort") {
                    mScoreTanzania++;
                    mScoreCuracao++;
                    mScoreGriekenland++;
                    mScoreEgypte++;
                    mScoreCostaRica++;
                    mScoreIndonesië++;
                    mScoreMarokko++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Vleesgerecht") {
                    mScoreFrankrijk++;
                    mScoreZuid_Afrika++;
                    mScoreBrazilië++;
                    mScoreArgentinië++;
                    mScoreGriekenland++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Beer") {
                    mScoreVS++;
                    mScoreCanada++;
                    mScoreZweden++;
                    updateQuestion100();

                }else if(mButtonChoice102.getText()=="Traditioneel dorp"){
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
                    mScoreKroatië++;
                    mScoreItalië++;
                    mScoreCuracao++;
                    mScoreVS++;
                    mScoreEngeland++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Bezienswaardigheden") {
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
                    mScoreDuitsland++;
                    mScoreNederland++;
                    mScoreFrankrijk++;
                    mScoreGriekenland++;
                    mScoreSpanje++;
                    mScoreItalië++;
                    mScoreKroatië++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Backpacking") {
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
                    mScoreEgypte++;
                    mScoreMarokko++;
                    mScoreTanzania++;
                    mScoreJapan++;
                    mScoreChili++;
                    mScoreChina++;
                    mScoreCostaRica++;
                    updateQuestion100();

                }else if(mButtonChoice103.getText()=="Vogel") {
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


    private void updateQuestion100() {
        if(mQuestionNumber100<mQuestionLibrary100.getLength100() ) {
            mQuestionView100.setText(mQuestionLibrary100.getQuestion100(mQuestionNumber100));
            mButtonChoice100.setText(mQuestionLibrary100.getChoice100(mQuestionNumber100));
            mButtonChoice101.setText(mQuestionLibrary100.getChoice101(mQuestionNumber100));
            mButtonChoice102.setText(mQuestionLibrary100.getChoice102(mQuestionNumber100));
            mButtonChoice103.setText(mQuestionLibrary100.getChoice103(mQuestionNumber100));
            mQuestionNumber100++;
        }
            else{
                Intent intent300 = new Intent(de_test_vragen.this, favoriete_vakantiebestemming.class);
                intent300.putExtra("mScoreEgypte", mScoreEgypte);
                intent300.putExtra("mScoreMarokko", mScoreMarokko);
                intent300.putExtra("mScoreTanzania", mScoreTanzania);
                intent300.putExtra("mScoreZuid_Afrika", mScoreZuid_Afrika);
                intent300.putExtra("mScoreChina", mScoreChina);
                intent300.putExtra("mScoreIndonesië", mScoreIndonesië);
                intent300.putExtra("mScoreJapan", mScoreJapan);
                intent300.putExtra("mScoreThailand", mScoreThailand);
                intent300.putExtra("mScoreDuitsland", mScoreDuitsland);
                intent300.putExtra("mScoreEngeland", mScoreEngeland);
                intent300.putExtra("mScoreFrankrijk", mScoreFrankrijk);
                intent300.putExtra("mScoreGriekenland", mScoreGriekenland);
                intent300.putExtra("mScoreItalië", mScoreItalië);
                intent300.putExtra("mScoreKroatië", mScoreKroatië);
                intent300.putExtra("mScoreNederland", mScoreNederland);
                intent300.putExtra("mScoreOostenrijk", mScoreOostenrijk);
                intent300.putExtra("mScoreSpanje", mScoreSpanje);
                intent300.putExtra("mScoreZweden", mScoreZweden);
                intent300.putExtra("mScoreCostaRica", mScoreCostaRica);
                intent300.putExtra("mScoreCuracao", mScoreCuracao);
                intent300.putExtra("mScoreCanada", mScoreCanada);
                intent300.putExtra("mScoreVS", mScoreVS);
                intent300.putExtra("mScoreAustralië", mScoreAustralië);
                intent300.putExtra("mScoreNieuw_Zeeland", mScoreNieuw_Zeeland);
                intent300.putExtra("mScoreArgentinië", mScoreArgentinië);
                intent300.putExtra("mScoreBrazilië", mScoreBrazilië);
                intent300.putExtra("mScoreChili", mScoreChili);
            startActivity(intent300);
            }
        }

}