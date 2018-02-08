package com.example.dennis.vakantie_app;

// This file contains questions from QuestionBank

import android.support.v7.app.AppCompatActivity;

public class vragenlijst_onderwerp1_niveau2 extends AppCompatActivity {

    // array of questions
    private String textQuestions2 [] = {
            "1. Wat is de hoofdstad van Algerije?",
            "2. Wat is de hoofdstad van Egypte?",
            "3. Wat is de hoofdstad van Marokko?",
            "4. Wat is de hoofdstad van Tunesië?",
            "5. Wat is de hoofdstad van Zuid-Afrika?",
            "6. Wat is de hoofdstad van India?",
            "7. Wat is de hoofdstad van Indonesië?",
            "8. Wat is de hoofdstad van Irak?",
            "9. Wat is de hoofdstad van Iran?",
            "10. Wat is de hoofdstad van Israël?",
            "11. Wat is de hoofdstad van Japan?",
            "12. Wat is de hoofdstad van Pakistan?",
            "13. Wat is de hoofdstad van Singapore?",
            "14. Wat is de hoofdstad van Syrië?",
            "15. Wat is de hoofdstad van Thailand?",
            "16. Wat is de hoofdstad van Vietnam?",
            "17. Wat is de hoofdstad van Albanië?",
            "18. Wat is de hoofdstad van Bosnië?",
            "19. Wat is de hoofdstad van Cyprus?",
            "20. Wat is de hoofdstad van Hongarije?",
            "21. Wat is de hoofdstad van Slowakije?",
            "22. Wat is de hoofdstad van Wit-Rusland?",
            "23. Wat is de hoofdstad van Nieuw-Zeeland?",
            "24. Wat is de hoofdstad van Argentinië?",
            "25. Wat is de hoofdstad van Chili?"
    };

    // array of multiple choices for each question
    private String multipleChoice2 [][] = {
            {"Constantine", "Oran", "Algiers", "Algerije-Stad"},
            {"Gizeh", "Caïro", "Luxor", "Marsa Alam"},
            {"Marrakesh", "Rabat", "Casablanca", "Tanger"},
            {"Sousse", "Hammamet", "Kairouan", "Tunis"},
            {"Kaapstad", "Stellenbosch", "Soweto", "Durban"},
            {"Bombay", "New Delhi", "Bangalore", "Calcutta"},
            {"Surabaya", "Jakarta", "Malang", "Bandung"},
            {"Bagdad", "Basra", "Erbil", "Mosoel"},
            {"Shiraz", "Isfahan", "Kashan", "Teheran"},
            {"Jeruzalem", "Haifa", "Akko", "Tel Aviv"},
            {"Kioto", "Osaka", "Tokio", "Shanghai"},
            {"Islamabad", "Karachi", "Multan", "Quetta"},
            {"Surakarta", "Padang", "Denpaser", "Singapore"},
            {"Homs", "Palmyra", "Damascus", "Aleppo"},
            {"Bangkok", "Chiang Mai", "Pattaya", "Kanchanaburi"},
            {"Sa Pa", "Ho Chi Minhstad", "Nha Trang", "Hanoi"},
            {"Tirana", "Berat", "Gjirokastër", "Elbasan"},
            {"Zagreb", "Belgrado", "Sarajevo", "Banja Luka"},
            {"Limasol", "Paphos", "Kreta", "Nicosia"},
            {"Debrecen", "Miskolc", "Boekarest", "Boedapest"},
            {"Nitra", "Poprad", "Ljubljana", "Bratislava"},
            {"Brest", "Vitebsk", "Moskou", "Minsk"},
            {"Queenstown", "Wellington", "Auckland", "Invercargill"},
            {"Salta", "Mendoza", "Buenos Aires", "Rosario"},
            {"Chili-Stad", "Punta Arenas", "Santiago", "Temuco"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers2[] = {"Algiers", "Caïro", "Rabat", "Tunis", "Kaapstad", "New Delhi", "Jakarta", "Bagdad", "Teheran", "Jeruzalem","Tokio","Islamabad","Singapore","Damascus","Bangkok","Hanoi","Tirana","Sarajevo","Nicosia","Boedapest","Bratislava","Minsk","Wellington","Buenos Aires","Santiago",};

    // method returns number of questions
    public int getLength2(){
        return textQuestions2.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion2(int a) {
        String question2 = textQuestions2[a];
        return question2;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice2(int index, int num) {
        String choice00 = multipleChoice2[index][num-1];
        return choice00;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer2(int a) {
        String answer2 = mCorrectAnswers2[a];
        return answer2;
    }
}
