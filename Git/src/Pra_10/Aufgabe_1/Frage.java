package Pra_10.Aufgabe_1;

abstract class Frage {
    String text; // Fragetext
    int punkte; // zu erreichende Punktzahl
    String korrekt;
    Frage(String text, int punkte, String korrekt) {
        this.text = text;
        this.punkte = punkte;
        this.korrekt = korrekt;
    }
    // Frage auf den Bildschirm ausgeben
    void frageStellen() {
        IO.println(this.text);
    }
    // Frage beantworten durch Prüfling, Antwort auswerten
// und Punkte vergeben
    abstract void frageBeantworten(Pruefling person);
    int getPunkte() {
        return this.punkte;
    }
}