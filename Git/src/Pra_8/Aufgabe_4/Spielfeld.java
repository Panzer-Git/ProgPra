package Pra_8.Aufgabe_4;

public class Spielfeld {
    Auto[] feld;

    public void printFeld() {
        String[][] vorfeld = new String[5][5];
        for (Auto a : this.feld) {
            vorfeld = a.setzeDich(vorfeld);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("+---+---+---+---+---+");
            for (int j = 0; j < 5; j++) {
                System.out.print("|" + vorfeld[i][j] + " ");
            }
        }
    }

}
