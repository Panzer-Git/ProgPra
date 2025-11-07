public class SchnickSchnackSchnuck {
    public static void main(String[] args) {
        SchnickSchnackSchnuck spiel = new SchnickSchnackSchnuck();
        spiel.starte();
    }

    int spielerPunkte = 0;
    int computerPunkte = 0;

    public void starte() {
        while (spielerPunkte < 10 && computerPunkte < 10) {
            runde currentRunde = new runde();
            char gewinner = currentRunde.ergebnis();
            if (gewinner == 's') {
                spielerPunkte++;
            }   else if (gewinner == 'c'){
                computerPunkte++;
            }
            System.out.println("Spielstand: Computer = " + computerPunkte + "; Mensch = " + spielerPunkte);
            System.out.println("...");
        }
        if (spielerPunkte == 10) {
            System.out.println("Spielende: Spieler hat gewonnen");
        }   else {
            System.out.println("Spielende: Computer hat gewonnen");
        }
    }
}
