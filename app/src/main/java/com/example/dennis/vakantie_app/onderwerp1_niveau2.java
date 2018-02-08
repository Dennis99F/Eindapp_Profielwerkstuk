package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class onderwerp1_niveau2 extends AppCompatActivity {

    private vragenlijst_onderwerp1_niveau2 mQuestionLibrary2 = new vragenlijst_onderwerp1_niveau2 ();
    private TextView mScoreView2;   // view for current total score
    private TextView mQuestionView2;  //current question to answer
    private Button mButtonChoice5; // multiple choice 1 for mQuestionView
    private Button mButtonChoice6; // multiple choice 2 for mQuestionView
    private Button mButtonChoice7; // multiple choice 3 for mQuestionView
    private Button mButtonChoice8; // multiple choice 4 for mQuestionView

    private String mAnswer2;  // correct answer for question in mQuestionView
    private int mScore2 = 0;  // current total score
    private int mQuestionNumber2 = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp1_niveau2);
        // setup screen for the first question with four alternative to answer
        mScoreView2 = (TextView)findViewById(R.id.score2);
        mQuestionView2 = (TextView)findViewById(R.id.question2);
        mButtonChoice5 = (Button)findViewById(R.id.choice5);
        mButtonChoice6 = (Button)findViewById(R.id.choice6);
        mButtonChoice7 = (Button)findViewById(R.id.choice7);
        mButtonChoice8 = (Button)findViewById(R.id.choice8);
        updateQuestion2();
        // show current total score for the user
        updateScore(mScore2);
    }

    private void updateQuestion2(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber2<mQuestionLibrary2.getLength2() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView2.setText(mQuestionLibrary2.getQuestion2(mQuestionNumber2));
            mButtonChoice5.setText(mQuestionLibrary2.getChoice2(mQuestionNumber2, 1));
            mButtonChoice6.setText(mQuestionLibrary2.getChoice2(mQuestionNumber2, 2));
            mButtonChoice7.setText(mQuestionLibrary2.getChoice2(mQuestionNumber2, 3));
            mButtonChoice8.setText(mQuestionLibrary2.getChoice2(mQuestionNumber2, 4));
            mAnswer2 = mQuestionLibrary2.getCorrectAnswer2(mQuestionNumber2);
            mQuestionNumber2++;
        }
        else {
            Toast.makeText(onderwerp1_niveau2.this, "Dit was de laatste vraag!", Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(onderwerp1_niveau2.this, onderwerp1.class);
            intent2.putExtra("score2", mScore2); // pass the current score to the second screen
            startActivity(intent2);
        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView2.setText("" + mScore2+"/"+mQuestionLibrary2.getLength2());
    }

    public void onClick2(View view) {
        //all logic for all answers buttons in one method
        Button answer2 = (Button) view;
        // if the answer is correct, increase the score
        if (answer2.getText() == mAnswer2){
            mScore2 = mScore2 + 1;
            Toast.makeText(onderwerp1_niveau2.this, "Goed!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(onderwerp1_niveau2.this, "Fout!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore(mScore2);
        // once user answer the question, we move on to the next one, if any
        updateQuestion2();
    }
}