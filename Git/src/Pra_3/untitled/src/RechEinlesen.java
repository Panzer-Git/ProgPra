package Pra_3.untitled.src;

public class RechEinlesen {
    void einlesen() {
        EinUndAusgabe einUndAusgabe = new EinUndAusgabe();
        System.out.println("Anzahl Downloads (>=0): ");
        int eingabe = einUndAusgabe.leseInteger();
        int price;
        if (eingabe <= 5) {
            price = 0;
        } else if (eingabe <= 35) {
            price = (eingabe - 5) * 20;
        } else {
            price = (eingabe - 35) * 15 + 30 * 20;
        }
        double gebuehr = price;
        gebuehr /= 100;
        System.out.println("Gebuehren = " + gebuehr + " EURO");
    }
}
