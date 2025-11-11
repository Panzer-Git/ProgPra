package Pra_5.aufgabe_3;

public class Shop {
    public static void main(String[] args) {
        EinUndAusgabe ea = new EinUndAusgabe();
        System.out.print("Buchpreis: ");
        double buchPreis = ea.leseDouble();
        System.out.print("DVD-Preis:" );
        double dvdPreis = ea.leseDouble();
        Haendler buchHaendler = new Haendler(buchPreis);
        Haendler dvdHaendler = new Haendler(dvdPreis);
        char weiter = 0;
        do {
            System.out.print("Buch oder DVD kaufen (b/d)?");
            char auswahl = ea.leseString().charAt(0);
            System.out.print("Anzahl Produkte");
            int anzahl = ea.leseInteger();
            if (auswahl == 'b') {
                buchHaendler.kaufen(anzahl);
            } else {
                dvdHaendler.kaufen(anzahl);
            }
            System.out.print("weiter einkaufen(j/n): ");
            weiter = ea.leseString().charAt(0);
        } while (weiter == 'j');
        double einnamen = buchHaendler.liefereEinnahmen();
        System.out.println("Einnahmen des Buchhaendlers = " + einnamen);
        einnamen = dvdHaendler.liefereEinnahmen();
        System.out.println("Einnahmen des DVD-Haendlers = " + einnamen);
    }
}