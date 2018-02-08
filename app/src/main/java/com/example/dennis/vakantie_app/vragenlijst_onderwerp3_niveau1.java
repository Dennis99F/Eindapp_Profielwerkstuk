package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

import android.support.v7.app.AppCompatActivity;

public class vragenlijst_onderwerp3_niveau1 extends AppCompatActivity {

    // array of questions
    private String textQuestions7 [] = {
            "1. Hoeveel inwoners heeft Nederland?",
            "2. Hoeveel inwoners heeft Duitsland?",
            "3. Hoeveel inwoners heeft Frankrijk?",
            "4. Hoeveel inwoners heeft Belgie?",
            "5. Wat is de grootste stad ter wereld qua inwoners?",
            "6. Hoeveel inwoners heeft het Verenigd Koninkrijk?",
            "7. Welk land heeft de meeste inwoners?",
            "8. Hoeveel inwoners heeft De Verenigde Staten?",
            "9. Hoeveel inwoners heeft China?",
            "10. Wat is de grootste stad van de Verenigde Staten?",
            "11. Welk land heeft de meeste inwoners?",
            "12. Hoeveel inwoners heeft Polen?",
            "13. Hoeveel inwoners heeft Rusland?",
            "14. In welke stad wonen de meeste mensen?",
            "15. Hoeveel inwoners heeft Italie?"
    };

    // array of multiple choices for each question
    private String multipleChoice7 [][] = {
            {"14 miljoen", "16 miljoen", "17 miljoen", "20 miljoen"},
            {"66 miljoen", "42 miljoen", "67 miljoen", "83 miljoen"},
            {"10 miljoen", "125 miljoen", "70 miljoen", "75 miljoen"},
            {"8 miljoen", "9 miljoen", "11 miljoen", "17 miljoen"},
            {"Mexico city", "Jakarta", "seoul", "Tokyo"},
            {"70 miljoen", "30 miljoen", "45 miljoen", "23 miljoen"},
            {"India", "China", "Rusland", "De Verenigde Staten"},
            {"450 miljoen", "1,2 miljard", "270 miljoen", "320 miljoen"},
            {"1,2 miljard", "3 miljard", "1,4 miljard", "1,3 miljard"},
            {"Washington", "Los Angeles", "New York", "Chicago"},
            {"Rusland", "India", "Brazilië", "Mexico"},
            {"35 miljoen", "38 miljoen", "40 miljoen", "45 miljoen"},
            {"150 miljoen", "130 miljoen", "80 miljoen", "140 miljoen"},
            {"Parijs", "Londen", "Moskou", "Berlijn"},
            {"50 miljoen", "55 miljoen", "35 miljoen", "60 miljoen"}
            };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers7[] = {"17 miljoen", "83 miljoen", "70 miljoen", "11 miljoen", "Tokyo", "70 miljoen", "China", "320 miljoen", "1,4 miljard", "New York", "India","40 miljoen", "140 miljoen", "Moskou", "60 miljoen"};

    // method returns number of questions
    public int getLength7(){
        return textQuestions7.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion7(int a) {
        String question7 = textQuestions7[a];
        return question7;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice7(int index, int num) {
        String choice0000000 = multipleChoice7[index][num-1];
        return choice0000000;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer7(int a) {
        String answer7= mCorrectAnswers7[a];
        return answer7;
    }
}
