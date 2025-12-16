package Pra_10.Aufgabe_1;

public class Pruefling {
    int punkte = 0;
    String name;

    Pruefling(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void gebePunkte(int punkte) {
        this.punkte += punkte;
    }

    int getPunkte() {
        return this.punkte;
    }
}
