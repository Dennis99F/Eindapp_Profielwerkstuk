package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

public class vragenlijst_de_test_vragen  {

    // array of questions
    private String mQuestions100 [] = {
            "1. Heeft u graag een lange of korte reis, of maakt dit niet uit?",
            "2. Met welk vervoer gaat u het liefst naar uw bestemming?",
            "3. Welke activiteit doet of ziet u het liefst op vakantie?",
            "4. Wat voor soort vakantie had u in gedachten of spreekt u het meest aan?",
            "5. Waar verblijft u het liefst op vakantie?",
            "6. Wat voor soort eten zou u graag eten bij uw bestemming?",
            "7. Welk dier vind u het meest interessant?",
            "8. Waar ziet u uzelf graag rondlopen?"
    };

    // array of multiple choices for each question
    private String mChoices100 [][] = {
            {"Kort", "Lang", "Gemiddeld", "Maakt niet uit"},
            {"Vliegtuig", "Auto", "Trein", "Boot"},
            {"Vechtsport", "Wandelen", "Zwemmen", "Bezienswaardigheden"},
            {"Natuur", "Cultuur", "Sport", "Uitrusten"},
            {"Hotel", "Camping", "Resort", "Backpacking"},
            {"Westers", "Rijsttafel", "Vleesgerecht", "Mee-eten met tradities"},
            {"Olifant", "Slang", "Beer", "Vogel"},
            {"Moderne Stad", "Authentieke Stad", "Traditioneel dorp", "Natuurlandschap"}
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
