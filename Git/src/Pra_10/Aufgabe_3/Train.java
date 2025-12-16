package Pra_10.Aufgabe_3;

public class Train {
    Locomotive anchor;
    Train(Locomotive locomotive) {
        this.anchor = locomotive;
    }

    void add(Car car) {
        if (this.anchor.getFirst() != null) {
            this.getLastCar().setNext(car);
        } else {
            this.anchor.setFirst(car);
        }
    }

    void print() {

    }

    int getPassengers() {
        int passenerCount = 0;
        while (!Boolean.parseBoolean(null)) {

        }
        return passenerCount;
    }

    int getLength() {
        int length = 0;
        while (!Boolean.parseBoolean(null)) {
        }
        return length;
    }

    void removeFirst() {
    }

    void relink(Train train) {

    }

    void revert() {

    }

    Car getLastCar() {
        Car currentCar = this.anchor.getFirst();
        while (currentCar.getNext() != null) {
            currentCar = currentCar.getNext();
        }
        return currentCar;
    }
}
