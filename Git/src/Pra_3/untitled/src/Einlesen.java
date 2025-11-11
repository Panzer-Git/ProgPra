package Pra_3.untitled.src;

public class Einlesen {
    void starte() {
        EinUndAusgabe einundausgabe = new EinUndAusgabe();
        System.out.println("Vorname: ");
        String eingabe1 = einundausgabe.leseString();
        System.out.println("Nachname: ");
        String eingabe2 = einundausgabe.leseString();
        System.out.println("Hallo " + eingabe1 + " " + eingabe2 + ".");

        System.out.println("Geburtsdatum Tag: ");
        int eingabe3 = einundausgabe.leseInteger();
        System.out.println("Geburtsdatum Monat: ");
        int eingabe4 = einundausgabe.leseInteger();
        System.out.println("Geburtsdatum Jahr: ");
        int eingabe5 = einundausgabe.leseInteger();
        System.out.println("Hallo " + eingabe1 + " , Du bist am " + eingabe3 + "." + eingabe4 + "." + eingabe5 + " geboren.");
    }
}
