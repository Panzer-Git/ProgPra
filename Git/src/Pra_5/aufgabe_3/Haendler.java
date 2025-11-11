package Pra_5.aufgabe_3;

public class Haendler {
    double Preis;
    double Einnahmen;

    public Haendler(Double Preis) {
        this.Preis = Preis;
    }

    public void kaufen(int Anzahl) {
        this.Einnahmen = Anzahl * this.Preis;
    }

    public double liefereEinnahmen() {
        return this.Einnahmen;
    }
}
