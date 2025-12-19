package Pra_10.Aufgabe_3;

public class Locomotive {
    private int laenge;
    private int typ;
    private Car first;

    Locomotive(int laenge, int typ) {
        this.laenge = laenge;
        this.typ = typ;
    }

    int getLaenge() {
        return this.laenge;
    }
    void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    int getTyp() {
        return this.typ;
    }

    void setTyp(int typ) {
        this.typ = typ;
    }

    Car getFirst() {
        return this.first;
    }

    void setFirst(Car first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "Lokomotive mit Länge: " + this.getLaenge() + " vom Typ: " + this.getTyp();
    }
}
