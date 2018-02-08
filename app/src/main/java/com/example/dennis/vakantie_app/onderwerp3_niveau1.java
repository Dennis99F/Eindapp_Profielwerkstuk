package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class onderwerp3_niveau1 extends AppCompatActivity {

    private vragenlijst_onderwerp3_niveau1 mQuestionLibrary7= new vragenlijst_onderwerp3_niveau1 ();
    private TextView mScoreView7;   // view for current total score
    private TextView mQuestionView7;  //current question to answer
    private Button mButtonChoice25; // multiple choice 1 for mQuestionView
    private Button mButtonChoice26; // multiple choice 2 for mQuestionView
    private Button mButtonChoice27; // multiple choice 3 for mQuestionView
    private Button mButtonChoice28; // multiple choice 4 for mQuestionView

    private String mAnswer7;  // correct answer for question in mQuestionView
    private int mScore7 = 0;  // current total score
    private int mQuestionNumber7 = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp3_niveau1);
        // setup screen for the first question with four alternative to answer
        mScoreView7 = (TextView)findViewById(R.id.score7);
        mQuestionView7 = (TextView)findViewById(R.id.question7);
        mButtonChoice25 = (Button)findViewById(R.id.choice25);
        mButtonChoice26 = (Button)findViewById(R.id.choice26);
        mButtonChoice27 = (Button)findViewById(R.id.choice27);
        mButtonChoice28 = (Button)findViewById(R.id.choice28);
        updateQuestion7();
        // show current total score for the user
        updateScore(mScore7);
    }

    private void updateQuestion7(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber7<mQuestionLibrary7.getLength7() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView7.setText(mQuestionLibrary7.getQuestion7(mQuestionNumber7));
            mButtonChoice25.setText(mQuestionLibrary7.getChoice7(mQuestionNumber7, 1));
            mButtonChoice26.setText(mQuestionLibrary7.getChoice7(mQuestionNumber7, 2));
            mButtonChoice27.setText(mQuestionLibrary7.getChoice7(mQuestionNumber7, 3));
            mButtonChoice28.setText(mQuestionLibrary7.getChoice7(mQuestionNumber7, 4));
            mAnswer7 = mQuestionLibrary7.getCorrectAnswer7(mQuestionNumber7);
            mQuestionNumber7++;
        }
        else {
            Toast.makeText(onderwerp3_niveau1.this, "Dit was de laatste vraag!", Toast.LENGTH_SHORT).show();
            Intent intent7 = new Intent(onderwerp3_niveau1.this, onderwerp3.class);
            intent7.putExtra("score7", mScore7); // pass the current score to the second screen
            startActivity(intent7);
        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView7.setText("" + mScore7+"/"+mQuestionLibrary7.getLength7());
    }

    public void onClick7(View view) {
        //all logic for all answers buttons in one method
        Button answer7 = (Button) view;
        // if the answer is correct, increase the score
        if (answer7.getText() == mAnswer7){
            mScore7 = mScore7 + 1;
            Toast.makeText(onderwerp3_niveau1.this, "Goed!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(onderwerp3_niveau1.this, "Fout!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore(mScore7);
        // once user answer the question, we move on to the next one, if any
        updateQuestion7();
    }
}