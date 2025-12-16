package Pra_10.Aufgabe_3;

public class Car {
    private int laenge;
    private int kapazitaet;
    private Car next;

    int getLaenge() {
        return this.laenge;
    }
    void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    int getKapazitaet() {
        return this.kapazitaet;
    }

    void setKapazitaet(int typ) {
        this.kapazitaet = typ;
    }

    Car getNext() {
        return this.next;
    }

    void setNext(Car first) {
        this.next = first;
    }
}
