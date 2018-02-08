package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

import android.support.v7.app.AppCompatActivity;

public class vragenlijst_onderwerp1_niveau3 extends AppCompatActivity {

    // array of questions
    private String textQuestions3 [] = {
            "1. Wat is de hoofdstad van Azerbeidzjan?",
            "2. Wat is de hoofdstad van Georgië?",
            "3. Wat is de hoofdstad van Kazachstan?",
            "4. Wat is de hoofdstad van Mongolië?",
            "5. Wat is de hoofdstad van Noord-Korea?",
            "6. Wat is de hoofdstad van de Verenigde Arabische Emiraten?",
            "7. Wat is de hoofdstad van Andorra?",
            "8. Wat is de hoofdstad van Bulgarije?",
            "9. Wat is de hoofdstad van Estland?",
            "10. Wat is de hoofdstad van Finland?",
            "11. Wat is de hoofdstad van IJsland?",
            "12. Wat is de hoofdstad van Kroatië?",
            "13. Wat is de hoofdstad van Letland?",
            "14. Wat is de hoofdstad van Macedonië?",
            "15. Wat is de hoofdstad van Moldavië?",
            "16. Wat is de hoofdstad van Oekraïne?",
            "17. Wat is de hoofdstad van Roemenië?",
            "18. Wat is de hoofdstad van Servië?",
            "19. Wat is de hoofdstad van Slovenië?",
            "20. Wat is de hoofdstad van Canada?",
            "21. Wat is de hoofdstad van Costa Rica?",
            "22. Wat is de hoofdstad van Brazilië?",
            "23. Wat is de hoofdstad van Colombia?",
            "24. Wat is de hoofdstad van Ecuador?",
            "25. Wat is de hoofdstad van Peru?"
    };

    // array of multiple choices for each question
    private String multipleChoice3 [][] = {
            {"Yevlax", "Sirvan", "Sumqayit", "Bakoe"},
            {"Koetaisi", "Batoemi", "Tbilisi", "Gori"},
            {"Alma-Ata", "Taraz", "Astana", "Ulaanbaatar"},
            {"Erdenet", "Ulaanbaatar", "Ölgi", "Darhan"},
            {"Sinuiju", "Namp'o", "Pyongyang", "Hamhung"},
            {"Dubai", "Fujairah", "Ras Al-Khaimah", "Abu Dhabi"},
            {"La Massana", "Andorra la Vella", "Canillo", "Sant Julià de Lòria"},
            {"Plovdiv", "Varna", "Boergas", "Sofia"},
            {"Narva", "Pärnu", "Tartu", "Tallinn"},
            {"Helsinki", "Turku", "Tampere", "Oulu"},
            {"Reykjavik", "Akureyri", "IJsland-Stad", "Keflavik"},
            {"Split", "Dubrovnik", "Zagreb", "Pula"},
            {"Riga", "Jürmala", "Liepãja", "Daugavpils"},
            {"Ohrid", "Skopje", "Bitola", "Tetovo"},
            {"Chisinau", "Tiraspol", "Balti", "Tighina"},
            {"Kiev", "Lviv", "Odessa", "Charkov"},
            {"Brasov", "Cluj-Napoca", "Sibiu", "Boekarest"},
            {"Belgrado", "Nis", "Novi Sad", "Kragujevac"},
            {"Ljubljana", "Bled", "Koper", "Maribor"},
            {"Toronto", "Montreal", "Vancouver", "Ottawa"},
            {"San José", "Liberia", "Quepos", "Monteverde"},
            {"São Paulo", "Rio de Janeiro", "Salvador", "Brasilia"},
            {"Bogota", "Cartagena", "Medellín", "Cali"},
            {"Cuenca", "Guayaquil", "Quito", "Latacunga"},
            {"Lima", "Cuzco", "Arequipa", "Puno"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers3[] = {"Bakoe", "Tbilisi", "Astana", "Ulaanbaatar", "Pyongyang", "Abu Dhabi", "Andorra la Vella", "Sofia", "Tallinn", "Helsinki","Reykjavik","Zagreb","Riga","Skopje","Chisinau","Kiev","Boekarest","Belgrado","Ljubljana","Ottawa","San José","Brasilia","Bogota","Quito","Lima",};

    // method returns number of questions
    public int getLength3(){
        return textQuestions3.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion3(int a) {
        String question3 = textQuestions3[a];
        return question3;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice3(int index, int num) {
        String choice000 = multipleChoice3[index][num-1];
        return choice000;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer3(int a) {
        String answer3 = mCorrectAnswers3[a];
        return answer3;
    }
}
