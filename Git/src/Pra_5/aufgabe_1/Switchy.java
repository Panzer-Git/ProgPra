package Pra_5.aufgabe_1;

public class Switchy {
    public static void main(String[] args) {
        Switchy s = new Switchy();
        s.machWas();
    }

    public void machWas() {
        EinUndAusgabe IO = new EinUndAusgabe();
        int zahl = IO.leseInteger();
        switch (zahl) {
            case 5, 6:
                System.out.println("ja");
                break;
            case 4:
                System.out.println("weiss nicht");
                break;
            case -1, 0, 1:
                System.out.println("nein");
                break;
            default:
                System.out.println("vielleicht");
                break;
        }
    }
}
