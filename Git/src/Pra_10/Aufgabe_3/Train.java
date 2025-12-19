package Pra_10.Aufgabe_3;

public class Train {
    private final Locomotive anchor;

    Train(Locomotive locomotive) {
        this.anchor = locomotive;
    }

    void add(Car car) {
        if (this.getAnchor().getFirst() != null) {
            this.getLastCar().setNext(car);
        } else {
            this.getAnchor().setFirst(car);
        }
    }

    void print() {
        String resultString = "Der Zug besteht aus einer " + this.getAnchor();
        Car currentCar = this.getAnchor().getFirst();
        while (currentCar != null) {
            resultString = resultString.concat(" gefolgt von: \n" + currentCar);
            currentCar = currentCar.getNext();
        }
        System.out.println(resultString);
    }

    int getPassengers() {
        int passengerCount = 0;
        Car currentCar = this.getAnchor().getFirst();
        while (currentCar != null) {
            passengerCount += currentCar.getKapazitaet();
            currentCar = currentCar.getNext();
        }
        return passengerCount;
    }

    int getLength() {
        int length = this.getAnchor().getLaenge();
        Car currentCar = this.getAnchor().getFirst();
        while (currentCar != null) {
            length += currentCar.getLaenge();
            currentCar = currentCar.getNext();
        }
        return length;
    }

    Car removeFirst() {
        Car tmp = this.getAnchor().getFirst();
        this.getAnchor().setFirst(tmp.getNext());
        return tmp;
    }

    void relink(Train train) {
        while (train.getAnchor().getFirst() != null) {
            train.print();
            System.out.println();
            this.print();
            System.out.println();
            this.add(train.removeFirst());
        }
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

    Locomotive getAnchor() {
        return this.anchor;
    }
}
