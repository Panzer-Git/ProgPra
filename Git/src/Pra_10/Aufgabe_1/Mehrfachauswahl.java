package Pra_10.Aufgabe_1;

import java.util.Objects;

public class Mehrfachauswahl extends Frage {
    Mehrfachauswahl(String text, int punkte, String korrekt) {
        super(text, punkte, korrekt);
    }

    @Override
    void frageBeantworten(Pruefling person) {
        IO.println(person.getName() + ": ");
        String antwort = IO.readString();
        if (antwort.equals(this.korrekt)) {
            person.gebePunkte(this.punkte);
        }
    }
}
