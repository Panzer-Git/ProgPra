package Pra_7.Aufgabe_2;

public class Testprogramm {
    public static void main(String[] args) {
        Person p1 = new Person("Marius","Panzer");
        Person p2 = new Person("Fabian","Schade");
        Person p3 = new Person("Albert","Einstein");

        Menge menge1 = new Menge();

        menge1.add(p1);
        menge1.add(p2);

        System.out.println(menge1.checkInMenge(p1));
        System.out.println(menge1.checkInMenge(p3));

        Menge menge2 = new Menge(menge1);

        System.out.println(menge2.equals(menge1));

        menge1.add(p3);
        menge2.add(new Person("Leo", "Keppler"));

        System.out.println(menge1.equals(menge2));

        System.out.println(menge1);

        System.out.println(menge2);

        System.out.println(menge1.intersectionWith(menge2));
        System.out.println(menge1.unificationWith(menge2));
        System.out.println(menge1.differenceWith(menge2));
    }
}
