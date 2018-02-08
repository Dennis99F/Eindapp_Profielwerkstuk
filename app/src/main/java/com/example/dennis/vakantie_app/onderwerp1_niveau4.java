package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class onderwerp1_niveau4 extends AppCompatActivity {

    private vragenlijst_onderwerp1_niveau4 mQuestionLibrary4= new vragenlijst_onderwerp1_niveau4 ();
    private TextView mScoreView4;   // view for current total score
    private TextView mQuestionView4;  //current question to answer
    private Button mButtonChoice13; // multiple choice 1 for mQuestionView
    private Button mButtonChoice14; // multiple choice 2 for mQuestionView
    private Button mButtonChoice15; // multiple choice 3 for mQuestionView
    private Button mButtonChoice16; // multiple choice 4 for mQuestionView

    private String mAnswer4;  // correct answer for question in mQuestionView
    private int mScore4 = 0;  // current total score
    private int mQuestionNumber4 = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp1_niveau4);
        // setup screen for the first question with four alternative to answer
        mScoreView4 = (TextView)findViewById(R.id.score4);
        mQuestionView4 = (TextView)findViewById(R.id.question4);
        mButtonChoice13 = (Button)findViewById(R.id.choice13);
        mButtonChoice14 = (Button)findViewById(R.id.choice14);
        mButtonChoice15 = (Button)findViewById(R.id.choice15);
        mButtonChoice16 = (Button)findViewById(R.id.choice16);
        updateQuestion4();
        // show current total score for the user
        updateScore(mScore4);
    }

    private void updateQuestion4(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber4<mQuestionLibrary4.getLength4() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView4.setText(mQuestionLibrary4.getQuestion4(mQuestionNumber4));
            mButtonChoice13.setText(mQuestionLibrary4.getChoice4(mQuestionNumber4, 1));
            mButtonChoice14.setText(mQuestionLibrary4.getChoice4(mQuestionNumber4, 2));
            mButtonChoice15.setText(mQuestionLibrary4.getChoice4(mQuestionNumber4, 3));
            mButtonChoice16.setText(mQuestionLibrary4.getChoice4(mQuestionNumber4, 4));
            mAnswer4 = mQuestionLibrary4.getCorrectAnswer4(mQuestionNumber4);
            mQuestionNumber4++;
        }
        else {
            Toast.makeText(onderwerp1_niveau4.this, "Dit was de laatste vraag!", Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(onderwerp1_niveau4.this, onderwerp1.class);
            intent4.putExtra("score4", mScore4); // pass the current score to the second screen
            startActivity(intent4);
        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView4.setText("" + mScore4+"/"+mQuestionLibrary4.getLength4());
    }

    public void onClick4(View view) {
        //all logic for all answers buttons in one method
        Button answer4 = (Button) view;
        // if the answer is correct, increase the score
        if (answer4.getText() == mAnswer4){
            mScore4 = mScore4 + 1;
            Toast.makeText(onderwerp1_niveau4.this, "Goed!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(onderwerp1_niveau4.this, "Fout!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore(mScore4);
        // once user answer the question, we move on to the next one, if any
        updateQuestion4();
    }
}