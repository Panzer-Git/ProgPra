package Probeklausur.Aufgabe_5;

public class Methoden {
    public static void main(String[] args) {
        Methoden m = new Methoden();
        System.out.println(m.getbetrag(-3));
        System.out.println(m.getAnzahlZiffern(234));
        System.out.println(m.getZiffernWert(234, 2));
        System.out.println(m.ersetzeZiffer(234, 1, 5));
    }

    int getbetrag(int zahl) {
        if (zahl < 0) {
            zahl = -zahl;
        }
        return zahl;
    }

    int getAnzahlZiffern(int zahl) {
        return (zahl + "").length();
    }

    int getZiffernWert(int zahl, int stelle) {
        return Character.getNumericValue((zahl + "").charAt(stelle));
    }

    int ersetzeZiffer(int zahl, int stelle, int wert) {
        char[] a = (zahl + "").toCharArray();
        a[stelle] = (char) (wert + '0');
        String e = "";
        for (char c : a) {
            e = e.concat(c + "");
        }
        return Integer.parseInt(e);
    }
}
