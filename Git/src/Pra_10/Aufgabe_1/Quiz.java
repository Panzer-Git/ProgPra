package Pra_10.Aufgabe_1;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Frage> quizFragen = new ArrayList<>();
    private ArrayList<Pruefling> prueflinge = new ArrayList<>();

    Quiz(ArrayList<Pruefling> prueflinge) {
        this.prueflinge = prueflinge;
    }

    void start() {
        for (Frage frage : this.quizFragen) {
            frage.frageStellen();
            for (Pruefling pruefling : this.prueflinge) {
                frage.frageBeantworten(pruefling);
            }
        }
        for (Pruefling pruefling : this.prueflinge) {
            System.out.println(pruefling.getName() + ": " + pruefling.getPunkte());
        }
    }

    void addToFragen(Frage frage) {
        this.quizFragen.add(frage);
    }
}
