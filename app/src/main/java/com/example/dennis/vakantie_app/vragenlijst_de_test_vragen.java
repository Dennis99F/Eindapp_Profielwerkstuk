package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

public class vragenlijst_de_test_vragen  {

    // array of questions
    private String mQuestions100 [] = {
            "1. Heeft u graag een lange of korte reis, of maakt dit niet uit?",
            "2. In welke stad wonen de minste mensen?",
            "3. Hoeveel inwoners heeft Denemarken?",
            "4. Hoeveel inwoners heeft Japan?"
    };

    // array of multiple choices for each question
    private String mChoices100 [][] = {
            {"Lang", "Kort", "Gemiddeld", "Maakt niet uit"},
            {"Rio de janeiro", "Rome", "Kiev", "Stockholm"},
            {"5 miljoen", "6 miljoen", "3 miljoen", "8 miljoen"},
            {"50 miljoen", "110 miljoen", "130 miljoen", "120 miljoen"}
    };
    public int getLength100(){
        return mQuestions100.length;
    }

    public String getQuestion100(int a){
        String question100 = mQuestions100[a];
        return question100;
    }
    public String getChoice100(int a){
        String choice100 = mChoices100[a][0];
        return choice100;
    }
    public String getChoice101(int a){
        String choice101 = mChoices100[a][1];
        return choice101;
    }
    public String getChoice102(int a){
        String choice102 = mChoices100[a][2];
        return choice102;
    }
    public String getChoice103(int a){
        String choice103 = mChoices100[a][3];
        return choice103;
    }
}
