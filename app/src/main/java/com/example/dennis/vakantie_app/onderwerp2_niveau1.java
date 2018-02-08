package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class onderwerp2_niveau1 extends AppCompatActivity {

    private vragenlijst_onderwerp2_niveau1 mQuestionLibrary5= new vragenlijst_onderwerp2_niveau1 ();
    private TextView mScoreView5;   // view for current total score
    private ImageView mQuestionView5;  //current question to answer
    private Button mButtonChoice17; // multiple choice 1 for mQuestionView
    private Button mButtonChoice18; // multiple choice 2 for mQuestionView
    private Button mButtonChoice19; // multiple choice 3 for mQuestionView
    private Button mButtonChoice20; // multiple choice 4 for mQuestionView

    private String mAnswer5;  // correct answer for question in mQuestionView
    private int mScore5 = 0;  // current total score
    private int mQuestionNumber5 = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp2_niveau1);
        // setup screen for the first question with four alternative to answer
        mScoreView5 = (TextView)findViewById(R.id.score5);
        mQuestionView5 = (ImageView)findViewById(R.id.question5);
        mButtonChoice17 = (Button)findViewById(R.id.choice17);
        mButtonChoice18 = (Button)findViewById(R.id.choice18);
        mButtonChoice19 = (Button)findViewById(R.id.choice19);
        mButtonChoice20 = (Button)findViewById(R.id.choice20);
        updateQuestion5();
        // show current total score for the user
        updateScore(mScore5);
    }

    private void updateQuestion5(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber5<mQuestionLibrary5.getLength5() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView5.setImageResource(mQuestionLibrary5.getQuestion5(mQuestionNumber5));
            mButtonChoice17.setText(mQuestionLibrary5.getChoice5(mQuestionNumber5, 1));
            mButtonChoice18.setText(mQuestionLibrary5.getChoice5(mQuestionNumber5, 2));
            mButtonChoice19.setText(mQuestionLibrary5.getChoice5(mQuestionNumber5, 3));
            mButtonChoice20.setText(mQuestionLibrary5.getChoice5(mQuestionNumber5, 4));
            mAnswer5 = mQuestionLibrary5.getCorrectAnswer5(mQuestionNumber5);
            mQuestionNumber5++;
        }
        else {
            Toast.makeText(onderwerp2_niveau1.this, "Dit was de laatste vraag!", Toast.LENGTH_SHORT).show();
            Intent intent5 = new Intent(onderwerp2_niveau1.this, onderwerp2.class);
            intent5.putExtra("score5", mScore5); // pass the current score to the second screen
            startActivity(intent5);
        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView5.setText("" + mScore5+"/"+mQuestionLibrary5.getLength5());
    }

    public void onClick5(View view) {
        //all logic for all answers buttons in one method
        Button answer5 = (Button) view;
        // if the answer is correct, increase the score
        if (answer5.getText() == mAnswer5){
            mScore5 = mScore5 + 1;
            Toast.makeText(onderwerp2_niveau1.this, "Goed!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(onderwerp2_niveau1.this, "Fout!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore(mScore5);
        // once user answer the question, we move on to the next one, if any
        updateQuestion5();
    }
}