package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

import android.support.v7.app.AppCompatActivity;

public class vragenlijst_onderwerp2_niveau2 extends AppCompatActivity {

    // array of questions
    private Integer textQuestions6 [] = {
            R.drawable.chili_vlag_900_600,
            R.drawable.costa_rica_vlag_900_600,
            R.drawable.curacao_vlag_900_600,
            R.drawable.indonesie_vlag_900_600,
            R.drawable.kroatie_vlag_900_600,
            R.drawable.oostenrijk_vlag_900_600,
            R.drawable.spanje_vlag_900_600,
            R.drawable.tanzania_vlag_900_600,
            R.drawable.thailand_vlag_900_600,
            R.drawable.vs_vlag_900_600
    };

    // array of multiple choices for each question
    private String multipleChoice6 [][] = {
            {"Paraguay", "Panama", "Canada", "Chili"},
            {"VS", "Costa Rica", "Argentinië", "Guam"},
            {"Curacao", "Costa Rica", "India", "Mongolië"},
            {"Monaco", "Rusland", "Indonesië", "San Marino"},
            {"Bosnië", "Kroatië", "Servië", "Slovenië"},
            {"Denemarken", "Slowakije", "Zweden", "Oostenrijk"},
            {"Turkije", "Catalonië", "Spanje", "Portugal"},
            {"Zuid-Afrika", "Angola", "Namibië", "Tanzania"},
            {"Taiwan", "Nepal", "Bangladesh", "Thailand"},
            {"Canada", "VS", "Mexico", "Maleisië"}

    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers6[] = {"Chili", "Costa Rica", "Curacao", "Indonesië", "Kroatië", "Oostenrijk", "Spanje", "Tanzania", "Thailand", "VS"};

    // method returns number of questions
    public int getLength6(){
        return textQuestions6.length;
    }

    // method returns question from array textQuestions[] based on array index
    public Integer getQuestion6(int a) {
        Integer question6 = textQuestions6[a];
        return question6;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice6(int index, int num) {
        String choice000000 = multipleChoice6[index][num-1];
        return choice000000;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer6(int a) {
        String answer6= mCorrectAnswers6[a];
        return answer6;
    }
}
