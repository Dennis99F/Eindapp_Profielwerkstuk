package com.example.dennis.vakantie_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class de_test_vragen extends AppCompatActivity {

    private vragenlijst_de_test_vragen mQuestionLibrary100 = new vragenlijst_de_test_vragen();

    private TextView mScoreView100;
    private TextView mQuestionView100;
    private Button mButtonChoice100;
    private Button mButtonChoice101;
    private Button mButtonChoice102;
    private Button mButtonChoice103;

    private String mAnswer100;
    private int mScoreNederland = 0;
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

                if (mButtonChoice100.getText() == mAnswer100){

                    updateQuestion100();

                }else {
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

                if (mButtonChoice101.getText() == mAnswer100){
                    mScoreNederland++;
                    updateQuestion100();


                }else {

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

                if (mButtonChoice102.getText() == mAnswer100){
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

                if (mButtonChoice103.getText() == "Maakt niet uit"){
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
            mAnswer100 = mQuestionLibrary100.getChoice100(mQuestionNumber100); ////// Geen idee of dit klopt, want getChoice100 moet waarschijnlijk wat anders zijn.
            mQuestionNumber100++;
        }
            else{
                Toast.makeText(de_test_vragen.this, "Dit was de laatste vraag!", Toast.LENGTH_SHORT).show();
                Intent intent100 = new Intent(de_test_vragen.this, favoriete_vakantiebestemming.class);
                startActivity(intent100);

            }
        }

}