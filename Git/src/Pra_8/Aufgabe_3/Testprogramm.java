package Pra_8.Aufgabe_3;

public class Testprogramm {
    public static void main(String[] args) {
        Konto k1 = new Konto();
        Konto k2 = k1.cloneKonto();
        k2 = new Konto(k1);

        k1.payIn(5000);

        System.out.println(k1.getKontostand());
        System.out.println(k2.getKontostand());

        k2.payIn(3000);

        System.out.println(k1.getKontostand());
        System.out.println(k2.getKontostand());

        k1.transfer(k2, 5000);

        System.out.println(k1.getKontostand());
        System.out.println(k2.getKontostand());

        k1.payIn(15000);

        System.out.println(k1.getKontostand());

        k1.payOut(17000);

        System.out.println(k1.getKontostand());

        k1.payOut(17000);

        System.out.println(k1.getKontostand());

        k2.transfer(k1, 3000);

        System.out.println(k1.getKontostand());
        System.out.println(k2.getKontostand());
    }
}
