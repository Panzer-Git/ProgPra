package Pra_10.Aufgabe_3;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(new Locomotive(10,3));
        Car car1 = new Car(10,20);
        train.add(car1);
        train.add(new Car(20, 50));
        train.print();
        System.out.println(train.getPassengers());
        System.out.println(train.getLength());
        System.out.println(train.removeFirst());
        train.print();

        Train train2 = new Train(new Locomotive(15,5));
        train2.add(new Car(14, 30));
        train2.add(new Car(15, 50));
        train2.add(new Car(16, 40));
        train2.print();

        train2.removeFirst();
        train2.print();

        System.out.println("Relink:");
        train.relink(train2);
        train.print();
        train2.print();
    }
}
