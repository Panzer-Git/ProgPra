import java.util.Scanner;

public class runde {
    static int rundenZahl = 0;
    static String[] symbole = {"Schere", "Stein", "Papier", "Brunnen"};

    public char ergebnis() {
        rundenZahl++;
        String computerSymbol = symbole[(int)(Math.random()*4)];
        System.out.println("Spielrunde " + rundenZahl + ":");
        System.out.println("Symbol eingeben (Brunnen, Schere, Stein, Papier):");
        String spielerSymbol = new Scanner(System.in).nextLine();
        if (    (spielerSymbol.equals("Schere") && computerSymbol.equals("Papier"))
                ||
                (spielerSymbol.equals("Papier") && computerSymbol.equals("Brunnen"))
                ||
                (spielerSymbol.equals("Stein") && computerSymbol.equals("Schere"))
                ||
                (spielerSymbol.equals("Brunnen") && computerSymbol.equals("Stein"))
        ) {
            System.out.println("Computer: " + computerSymbol + "; Mensch: " + spielerSymbol + " -> Spieler gewinnt");
            return 's';
        } else if (spielerSymbol.equals(computerSymbol)) {
            System.out.println("Computer: " + computerSymbol + "; Mensch: " + spielerSymbol + " -> Pattsituation");
            return 'p';
        } else {
            System.out.println("Computer: " + computerSymbol + "; Mensch: " + spielerSymbol + " -> Computer gewinnt");
            return 'c';
        }
    }
}
