package Pra_8.Aufgabe_4;

public class Spielfeld {
    Auto[] feld;

    public Spielfeld(String construction) {
        Auto[] resultfeld;
        for (int i = 0; i < construction.length(); i++) {
            if (i > 0) {

            }
            i++;
        }
        this.feld = resultfeld;
    }

    public void printFeld() {
        char[][] vorfeld = new char[5][5];
        for (Auto a : this.feld) {
            vorfeld = a.setzeDich(vorfeld);
        }
        String resultstring = "";
        for (int i = 0; i < 5; i++) {
            resultstring += "+---+---+---+---+---+\n";
            for (int j = 0; j < 5; j++) {
                System.out.print("|" + vorfeld[i][j] + " ");
            }
        }
    }

    public boolean checkGewinn() {

    }
}
