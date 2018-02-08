package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

import android.support.v7.app.AppCompatActivity;

public class vragenlijst_onderwerp1_niveau1 extends AppCompatActivity {

    // array of questions
    private String textQuestions [] = {
            "1. Wat is de hoofdstad van China?",
            "2. Wat is de hoofdstad van Zuid-Korea?",
            "3. Wat is de hoofdstad van België?",
            "4. Wat is de hoofdstad van Denemarken?",
            "5. Wat is de hoofdstad van Duitsland?",
            "6. Wat is de hoofdstad van Frankrijk?",
            "7. Wat is de hoofdstad van Griekenland?",
            "8. Wat is de hoofdstad van Ierland?",
            "9. Wat is de hoofdstad van Italië?",
            "10. Wat is de hoofdstad van Luxemburg?",
            "11. Wat is de hoofdstad van Nederland?",
            "12. Wat is de hoofdstad van Noorwegen?",
            "13. Wat is de hoofdstad van Oostenrijk?",
            "14. Wat is de hoofdstad van Polen?",
            "15. Wat is de hoofdstad van Portugal?",
            "16. Wat is de hoofdstad van Rusland?",
            "17. Wat is de hoofdstad van Spanje?",
            "18. Wat is de hoofdstad van Tsjechië?",
            "19. Wat is de hoofdstad van Turkije?",
            "20. Wat is de hoofdstad van het Verenigd Koninkrijk?",
            "21. Wat is de hoofdstad van Zweden?",
            "22. Wat is de hoofdstad van Zwitserland?",
            "23. Wat is de hoofdstad van Mexico?",
            "24. Wat is de hoofdstad van de Verenigde Staten?",
            "25. Wat is de hoofdstad van Australië?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Shanghai", "Hong Kong", "Peking", "Guangzhou"},
            {"Seoel", "Busan", "Gyeongju", "Incheon"},
            {"Gent", "Leuven", "Antwerpen", "Brussel"},
            {"Kopenhagen", "Oslo", "Stockholm", "Helsinki"},
            {"Berlijn", "München", "Keulen", "Hamburg"},
            {"Bordeaux", "Lille", "Lyon", "Parijs"},
            {"Thessaloniki", "Rodos", "Athene", "Tirana"},
            {"Dublin", "Cork", "Belfast", "Galway"},
            {"Florence", "Venetië", "Milaan", "Rome"},
            {"Clervaux", "Echternach", "Vianden", "Luxemburg"},
            {"Amsterdam", "Rotterdam", "Den Haag", "Utrecht"},
            {"Bergen", "Oslo", "Trondheim", "Stavanger"},
            {"Innsbruck", "Graz", "Salzburg", "Wenen"},
            {"Krakau", "Warschau", "Gdansk", "Wroclaw"},
            {"Porto", "Lissabon", "Coimbra", "Sintra"},
            {"Jekaterinenburg", "Moskou", "Sint-Petersburg", "Vladivostok"},
            {"Madrid", "Valencia", "Barcelona", "Sevilla"},
            {"Brno", "Praag", "Pilsen", "Cesky Krumlov"},
            {"Istanboel", "Antalya", "Alanya", "Ankara"},
            {"Londen", "Manchester", "Birmingham", "Liverpool"},
            {"Göteborg", "Helsingborg", "Malmö", "Stockholm"},
            {"Zürich", "Bern", "Genève", "Luzern"},
            {"Guadalajara", "Puebla", "Cancun", "Mexico-Stad"},
            {"New York", "Los Angeles", "San Francisco", "Washington D.C."},
            {"Adelaide", "Melbourne", "Sydney", "Canberra"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"Peking", "Seoel", "Brussel", "Kopenhagen", "Berlijn", "Parijs", "Athene", "Dublin", "Rome", "Luxemburg","Amsterdam","Oslo","Wenen","Warschau","Lissabon","Moskou","Madrid","Praag","Ankara","Londen","Stockholm","Bern","Mexico-Stad","Washington D.C.","Canberra",};

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}