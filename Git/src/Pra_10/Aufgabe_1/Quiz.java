package Pra_10.Aufgabe_1;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Frage> quizFragen = new ArrayList<>();
    private ArrayList<Pruefling> prueflinge = new ArrayList<>();

    void start() {
        for (Frage frage : quizFragen) {
            frage.frageStellen();
        }
    }

    void addToFragen(Frage frage) {
        quizFragen.add(frage);
    }
}
