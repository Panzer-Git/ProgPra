package Pra_10.Aufgabe_1;

import java.util.ArrayList;

public class Pruefung {
    public static void main(String[] args) {
        Pruefling p1 = new Pruefling("Marius");
        Pruefling p2 = new Pruefling("Fabian");
        ArrayList<Pruefling> pListe = new ArrayList<>();
        pListe.add(p1);
        pListe.add(p2);

        Quiz quiz = new Quiz(pListe);
        quiz.addToFragen(Pruefung.frageErzeugen("Frage1: (Mehrfachaushwahl) \n1, 2 oder 3*",1, "3",'M'));

        quiz.start();
    }

    static Frage frageErzeugen(String text, int punkte, String korrekt, char typ) {
        return switch (typ) {
            case 'M' -> new Mehrfachauswahl(text, punkte, korrekt);
            case 'L' -> new Lueckenfrage(text, punkte, korrekt);
            case 'Z' -> new Zahlenfolgenerweiterungen(text, punkte, korrekt);
            case 'O' -> new Ordnungfrage(text, punkte, korrekt);
            default -> null;
        };
    }
}
