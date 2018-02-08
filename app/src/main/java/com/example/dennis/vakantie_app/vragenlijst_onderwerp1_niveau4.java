package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

import android.support.v7.app.AppCompatActivity;

public class vragenlijst_onderwerp1_niveau4 extends AppCompatActivity {

    // array of questions
    private String textQuestions4 [] = {
            "1. Wat is de hoofdstad van Angola?",
            "2. Wat is de hoofdstad van Benin?",
            "3. Wat is de hoofdstad van Djibouti?",
            "4. Wat is de hoofdstad van Ethiopië?",
            "5. Wat is de hoofdstad van Ivoorkust?",
            "6. Wat is de hoofdstad van Kameroen?",
            "7. Wat is de hoofdstad van Libië?",
            "8. Wat is de hoofdstad van Niger?",
            "9. Wat is de hoofdstad van Nigeria?",
            "10. Wat is de hoofdstad van Tanzania?",
            "11. Wat is de hoofdstad van Kosovo?",
            "12. Wat is de hoofdstad van Liechtenstein?",
            "13. Wat is de hoofdstad van Litouwen?",
            "14. Wat is de hoofdstad van Malta?",
            "15. Wat is de hoofdstad van Monaco?",
            "16. Wat is de hoofdstad van Montenegro?",
            "17. Wat is de hoofdstad van San Marino?",
            "18. Wat is de hoofdstad van Vaticaanstad?",
            "19. Wat is de hoofdstad van Cuba?",
            "20. Wat is de hoofdstad van El Salvador?",
            "21. Wat is de hoofdstad van Haïti?",
            "22. Wat is de hoofdstad van Panama?",
            "23. Wat is de hoofdstad van Bolivia?",
            "24. Wat is de hoofdstad van Paraguay?",
            "25. Wat is de hoofdstad van Suriname?"
    };

    // array of multiple choices for each question
    private String multipleChoice4 [][] = {
            {"Lobito", "Luanda", "Lubango", "Soyo"},
            {"Porto-Novo", "Cotonou", "Ouidah", "Parakou"},
            {"Djibouti", "Paramaribo", "Obock", "Tadjourah"},
            {"Dire Dawa", "Gondar", "Addis Abeba", "Harar"},
            {"Drogba", "Yamoussoukro", "Daloa", "Toure"},
            {"Douala", "Yaoundé", "Maorua", "Onana"},
            {"Benghazi", "Misratah", "Tripoli", "Ra's Lanoef"},
            {"Lagos", "Niamey", "Abuja", "Zinder"},
            {"Lagos", "Abuja", "Port Harcourt", "Ibadan"},
            {"Dar es Salaam", "Dodoma", "Mwanza", "Zanzibar"},
            {"Istog", "Pejë", "Pristina", "Gjilan"},
            {"Schaan", "Bern", "Schellenberg", "Vaduz"},
            {"Vilnius", "Kaunas", "Trakai", "Palanga"},
            {"Valletta", "Mdina", "San Giljan", "Sliema"},
            {"Monaco", "Lyon", "Lille", "Turijn"},
            {"Kotor", "Budva", "Podgorica", "Cetinje"},
            {"Rimini", "Borgo Maggiore", "San Marino", "Acquaviva"},
            {"San Marino", "Vaticaanstad", "Turijn", "Breda"},
            {"Trinidad", "Santiago de Cuba", "Cuba-Stad", "Havana"},
            {"Apopa", "San Salvador", "Soyapango", "Mejicanos"},
            {"Port-au-Prince", "Gonaïves", "Jacmel", "Port-de-Paix"},
            {"Boquete", "Colón", "Panama-Stad", "Tocumen"},
            {"La Paz", "Sucre", "Potosí", "Coffee"},
            {"Asuncion", "Encarnación", "San Lorenzo", "San Antonio"},
            {"Buenos Aires", "Montevideo", "New Amsterdam", "Paramaribo"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers4[] = {"Luanda", "Porto-Novo", "Djibouti", "Addis Abeba", "Yamoussoukro", "Yaoundé", "Tripoli", "Niamey", "Abuja", "Dodoma", "Pristina","Vaduz", "Vilnius", "Valletta", "Monaco", "Podgorica", "San Marino","Vaticaanstad","Havana","San Salvador","Port-au-Prince","Panama-Stad","Sucre","Asuncion","Paramaribo"};

    // method returns number of questions
    public int getLength4(){
        return textQuestions4.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion4(int a) {
        String question4 = textQuestions4[a];
        return question4;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice4(int index, int num) {
        String choice0000 = multipleChoice4[index][num-1];
        return choice0000;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer4(int a) {
        String answer4 = mCorrectAnswers4[a];
        return answer4;
    }
}
