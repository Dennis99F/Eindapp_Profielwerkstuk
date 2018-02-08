package com.example.dennis.vakantie_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class onderwerp2_niveau2 extends AppCompatActivity {

    private vragenlijst_onderwerp2_niveau2 mQuestionLibrary6= new vragenlijst_onderwerp2_niveau2 ();
    private TextView mScoreView6;   // view for current total score
    private ImageView mQuestionView6;  //current question to answer
    private Button mButtonChoice21; // multiple choice 1 for mQuestionView
    private Button mButtonChoice22; // multiple choice 2 for mQuestionView
    private Button mButtonChoice23; // multiple choice 3 for mQuestionView
    private Button mButtonChoice24; // multiple choice 4 for mQuestionView

    private String mAnswer6;  // correct answer for question in mQuestionView
    private int mScore6 = 0;  // current total score
    private int mQuestionNumber6 = 0; // current question number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onderwerp2_niveau2);
        // setup screen for the first question with four alternative to answer
        mScoreView6 = (TextView)findViewById(R.id.score6);
        mQuestionView6 = (ImageView)findViewById(R.id.question6);
        mButtonChoice21 = (Button)findViewById(R.id.choice21);
        mButtonChoice22 = (Button)findViewById(R.id.choice22);
        mButtonChoice23 = (Button)findViewById(R.id.choice23);
        mButtonChoice24 = (Button)findViewById(R.id.choice24);
        updateQuestion6();
        // show current total score for the user
        updateScore(mScore6);
    }

    private void updateQuestion6(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber6<mQuestionLibrary6.getLength6() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView6.setImageResource(mQuestionLibrary6.getQuestion6(mQuestionNumber6));
            mButtonChoice21.setText(mQuestionLibrary6.getChoice6(mQuestionNumber6, 1));
            mButtonChoice22.setText(mQuestionLibrary6.getChoice6(mQuestionNumber6, 2));
            mButtonChoice23.setText(mQuestionLibrary6.getChoice6(mQuestionNumber6, 3));
            mButtonChoice24.setText(mQuestionLibrary6.getChoice6(mQuestionNumber6, 4));
            mAnswer6 = mQuestionLibrary6.getCorrectAnswer6(mQuestionNumber6);
            mQuestionNumber6++;
        }
        else {
            Toast.makeText(onderwerp2_niveau2.this, "Dit was de laatste vraag!", Toast.LENGTH_SHORT).show();
            Intent intent6 = new Intent(onderwerp2_niveau2.this, onderwerp2.class);
            intent6.putExtra("score6", mScore6); // pass the current score to the second screen
            startActivity(intent6);
        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView6.setText("" + mScore6+"/"+mQuestionLibrary6.getLength6());
    }

    public void onClick6(View view) {
        //all logic for all answers buttons in one method
        Button answer6 = (Button) view;
        // if the answer is correct, increase the score
        if (answer6.getText() == mAnswer6){
            mScore6 = mScore6 + 1;
            Toast.makeText(onderwerp2_niveau2.this, "Goed!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(onderwerp2_niveau2.this, "Fout!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore(mScore6);
        // once user answer the question, we move on to the next one, if any
        updateQuestion6();
    }
}