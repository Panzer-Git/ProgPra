package Pra_10.Aufgabe_1;

public class Pruefung {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.start();
    }

    Frage frageErzeugen(String text, int punkte) {
        Mehrfachauswahl frage = new Mehrfachauswahl(text, punkte);
        return frage;
    }
}
