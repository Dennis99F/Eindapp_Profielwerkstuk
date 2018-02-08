package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

import android.support.v7.app.AppCompatActivity;

public class vragenlijst_onderwerp2_niveau1 extends AppCompatActivity {

    // array of questions
    private Integer textQuestions5 [] = {
            R.drawable.argentinie_vlag_900_600,
            R.drawable.nederland_vlag_900_600,
            R.drawable.frankrijk_vlag_900_600,
            R.drawable.brazilie_vlag_900_600,
            R.drawable.china_vlag_900_600,
            R.drawable.egypte_vlag_900_600,
            R.drawable.griekenland_vlag_900_600,
            R.drawable.japan_vlag_900_600,
            R.drawable.italie_vlag_900_600,
            R.drawable.australie_vlag_900_600
    };

    // array of multiple choices for each question
    private String multipleChoice5 [][] = {
            {"Argentinië", "Nederland", "Brazilië", "Spanje"},
            {"België", "Duitsland", "Nederland", "Denemarken"},
            {"Monaco", "Liechtenstein", "Engeland", "Frankrijk"},
            {"Uruguay", "Suriname", "Chili", "Brazilië"},
            {"Mongolië", "Rusland", "Zuid-Korea", "China"},
            {"Libië", "Saudi-Arabië", "Egypte", "Tsjaad"},
            {"Macedonië", "Georgië", "Frankrijk", "Griekenland"},
            {"Zuid-Korea", "Noord-Korea", "Indonesië", "Japan"},
            {"Kroatië", "Hongarije", "Tsjechië", "Italië"},
            {"Nieuw-Zeeland", "Australië", "Engeland", "Verenigde Staten"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers5[] = {"Argentinië", "Nederland", "Frankrijk", "Brazilië", "China", "Egypte", "Griekenland", "Japan", "Italië", "Australië"};

    // method returns number of questions
    public int getLength5(){
        return textQuestions5.length;
    }

    // method returns question from array textQuestions[] based on array index
    public Integer getQuestion5(int a) {
        Integer question5 = textQuestions5[a];
        return question5;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice5(int index, int num) {
        String choice00000 = multipleChoice5[index][num-1];
        return choice00000;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer5(int a) {
        String answer5= mCorrectAnswers5[a];
        return answer5;
    }
}
