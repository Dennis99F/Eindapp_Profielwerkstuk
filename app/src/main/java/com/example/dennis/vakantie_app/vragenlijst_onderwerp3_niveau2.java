package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

import android.support.v7.app.AppCompatActivity;

public class vragenlijst_onderwerp3_niveau2 extends AppCompatActivity {

    // array of questions
    private String textQuestions8 [] = {
            "1. Welke stad heeft de meeste inwoners?",
            "2. In welke stad wonen de minste mensen?",
            "3. Hoeveel inwoners heeft Denemarken?",
            "4. Hoeveel inwoners heeft Japan?",
            "5. Hoeveel inwoners heeft Portugal?",
            "6. Hoeveel inwoners heeft Turkije?",
            "7. Welk land heeft de minste inwoners?",
            "8. Welk land heeft meer inwoners dan Colombia?",
            "9. Hoeveel inwoners heeft Paraguay?",
            "10. Hoeveel inwoners heeft Zuid-Afrika?",
            "11. Welke religie heeft meeste aanhangers?",
            "12. Op welk Indonesisch eiland wonen de meeste mensen?",
            "13. Welk werelddeel heeft de meeste inwoners?",
            "14. Hoeveel inwoners heeft Sudan?",
            "15. Hoeveel inwoners heeft het Vaticaan?"
    };

    // array of multiple choices for each question
    private String multipleChoice8 [][] = {
            {"Breda", "Amsterdam", "Rotterdam", "Den Haag"},
            {"Rio de janeiro", "Rome", "Kiev", "Stockholm"},
            {"5 miljoen", "6 miljoen", "3 miljoen", "8 miljoen"},
            {"50 miljoen", "110 miljoen", "130 miljoen", "120 miljoen"},
            {"11 miljoen", "9 miljoen", "13 miljoen", "10 miljoen"},
            {"90 miljoen", "70 miljoen", "80 miljoen", "75 miljoen"},
            {"Oostenrijk", "Tsjechie", "Hongarije", "Nederland"},
            {"Argentinie ", "Turkije", "Uruguay", "Australie"},
            {"9 miljoen", "11 miljoen", "8 miljoen", "7 miljoen"},
            {"40 miljoen", "45 miljoen", "50 miljoen", "55 miljoen"},
            {"Jodendom", "Islam", "Christendom", "Hindoeïsme"},
            {"Bali", "Lombok", "Sumatra", "Java"},
            {"Afrika", "Amerika", "Oceanië", "Azië"},
            {"30 miljoen ", "35 miljoen", "40 miljoen", "45 miljoen"},
            {"120", "341", "564,5", "451"},

            };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers8[] = {"Amsterdam","Stockholm", "8 miljoen","120 miljoen","10 miljoen","90 miljoen","Oostenrijk","Turkije","7 miljoen","50 miljoen","Islam", "Java", "Azië", "40 miljoen", "451"};

    // method returns number of questions
    public int getLength8(){
        return textQuestions8.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion8(int a) {
        String question8 = textQuestions8[a];
        return question8;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice8(int index, int num) {
        String choice00000000 = multipleChoice8[index][num-1];
        return choice00000000;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer8(int a) {
        String answer8= mCorrectAnswers8[a];
        return answer8;
    }
}
