public class Rechentest {
    void starte() {
        RechEinlesen rechEinlesen = new RechEinlesen();
        rechEinlesen.einlesen();
    }

    public static void main(String[] args) {
        Rechentest rechentest = new Rechentest();
        rechentest.starte();
    }
}
