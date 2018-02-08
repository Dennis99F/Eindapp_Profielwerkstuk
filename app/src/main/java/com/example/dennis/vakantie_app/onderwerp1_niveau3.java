package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class onderwerp1_niveau3 extends AppCompatActivity {

    private vragenlijst_onderwerp1_niveau3 mQuestionLibrary3= new vragenlijst_onderwerp1_niveau3 ();
    private TextView mScoreView3;   // view for current total score
    private TextView mQuestionView3;  //current question to answer
    private Button mButtonChoice9; // multiple choice 1 for mQuestionView
    private Button mButtonChoice10; // multiple choice 2 for mQuestionView
    private Button mButtonChoice11; // multiple choice 3 for mQuestionView
    private Button mButtonChoice12; // multiple choice 4 for mQuestionView

    private String mAnswer3;  // correct answer for question in mQuestionView
    private int mScore3 = 0;  // current total score
    private int mQuestionNumber3 = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp1_niveau3);
        // setup screen for the first question with four alternative to answer
        mScoreView3 = (TextView)findViewById(R.id.score3);
        mQuestionView3 = (TextView)findViewById(R.id.question3);
        mButtonChoice9 = (Button)findViewById(R.id.choice9);
        mButtonChoice10 = (Button)findViewById(R.id.choice10);
        mButtonChoice11 = (Button)findViewById(R.id.choice11);
        mButtonChoice12 = (Button)findViewById(R.id.choice12);
        updateQuestion3();
        // show current total score for the user
        updateScore(mScore3);
    }

    private void updateQuestion3(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber3<mQuestionLibrary3.getLength3() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView3.setText(mQuestionLibrary3.getQuestion3(mQuestionNumber3));
            mButtonChoice9.setText(mQuestionLibrary3.getChoice3(mQuestionNumber3, 1));
            mButtonChoice10.setText(mQuestionLibrary3.getChoice3(mQuestionNumber3, 2));
            mButtonChoice11.setText(mQuestionLibrary3.getChoice3(mQuestionNumber3, 3));
            mButtonChoice12.setText(mQuestionLibrary3.getChoice3(mQuestionNumber3, 4));
            mAnswer3 = mQuestionLibrary3.getCorrectAnswer3(mQuestionNumber3);
            mQuestionNumber3++;
        }
        else {
            Toast.makeText(onderwerp1_niveau3.this, "Dit was de laatste vraag!", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(onderwerp1_niveau3.this, onderwerp1.class);
            intent3.putExtra("score3", mScore3); // pass the current score to the second screen
            startActivity(intent3);
        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView3.setText("" + mScore3+"/"+mQuestionLibrary3.getLength3());
    }

    public void onClick3(View view) {
        //all logic for all answers buttons in one method
        Button answer3 = (Button) view;
        // if the answer is correct, increase the score
        if (answer3.getText() == mAnswer3){
            mScore3 = mScore3 + 1;
            Toast.makeText(onderwerp1_niveau3.this, "Goed!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(onderwerp1_niveau3.this, "Fout!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore(mScore3);
        // once user answer the question, we move on to the next one, if any
        updateQuestion3();
    }
}