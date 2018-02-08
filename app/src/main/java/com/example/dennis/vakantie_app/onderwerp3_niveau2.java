package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class onderwerp3_niveau2 extends AppCompatActivity {

    private vragenlijst_onderwerp3_niveau2 mQuestionLibrary8= new vragenlijst_onderwerp3_niveau2 ();
    private TextView mScoreView8;   // view for current total score
    private TextView mQuestionView8;  //current question to answer
    private Button mButtonChoice29; // multiple choice 1 for mQuestionView
    private Button mButtonChoice30; // multiple choice 2 for mQuestionView
    private Button mButtonChoice31; // multiple choice 3 for mQuestionView
    private Button mButtonChoice32; // multiple choice 4 for mQuestionView

    private String mAnswer8;  // correct answer for question in mQuestionView
    private int mScore8 = 0;  // current total score
    private int mQuestionNumber8 = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp3_niveau2);
        // setup screen for the first question with four alternative to answer
        mScoreView8 = (TextView)findViewById(R.id.score8);
        mQuestionView8 = (TextView)findViewById(R.id.question8);
        mButtonChoice29 = (Button)findViewById(R.id.choice29);
        mButtonChoice30 = (Button)findViewById(R.id.choice30);
        mButtonChoice31 = (Button)findViewById(R.id.choice31);
        mButtonChoice32 = (Button)findViewById(R.id.choice32);
        updateQuestion8();
        // show current total score for the user
        updateScore(mScore8);
    }

    private void updateQuestion8(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber8<mQuestionLibrary8.getLength8() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView8.setText(mQuestionLibrary8.getQuestion8(mQuestionNumber8));
            mButtonChoice29.setText(mQuestionLibrary8.getChoice8(mQuestionNumber8, 1));
            mButtonChoice30.setText(mQuestionLibrary8.getChoice8(mQuestionNumber8, 2));
            mButtonChoice31.setText(mQuestionLibrary8.getChoice8(mQuestionNumber8, 3));
            mButtonChoice32.setText(mQuestionLibrary8.getChoice8(mQuestionNumber8, 4));
            mAnswer8 = mQuestionLibrary8.getCorrectAnswer8(mQuestionNumber8);
            mQuestionNumber8++;
        }
        else {
            Toast.makeText(onderwerp3_niveau2.this, "Dit was de laatste vraag!", Toast.LENGTH_SHORT).show();
            Intent intent8 = new Intent(onderwerp3_niveau2.this, onderwerp3.class);
            intent8.putExtra("score8", mScore8); // pass the current score to the second screen
            startActivity(intent8);
        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView8.setText("" + mScore8+"/"+mQuestionLibrary8.getLength8());
    }

    public void onClick8(View view) {
        //all logic for all answers buttons in one method
        Button answer8 = (Button) view;
        // if the answer is correct, increase the score
        if (answer8.getText() == mAnswer8){
            mScore8 = mScore8 + 1;
            Toast.makeText(onderwerp3_niveau2.this, "Goed!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(onderwerp3_niveau2.this, "Fout!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore(mScore8);
        // once user answer the question, we move on to the next one, if any
        updateQuestion8();
    }
}