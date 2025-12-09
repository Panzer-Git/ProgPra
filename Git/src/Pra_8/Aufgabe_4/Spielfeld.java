package Pra_8.Aufgabe_4;

import java.util.HashMap;
import java.util.Scanner;

public class Spielfeld {
    HashMap<Character, Auto> feld = new HashMap();
    Scanner input;

    public Spielfeld(String construction) {
        input = new Scanner(System.in);
        HashMap<Character, Auto> vorfeld = new HashMap();
        String used = "";
        for (int i = 0; i < construction.length(); i++) {
            int[] strPos = iPos(i);
            if (construction.charAt(i) != '_') {
                if (!this.feld.containsKey(construction.charAt(i))) {
                    int[][] tpos = {{strPos[0], strPos[1]},{},{}};
                    vorfeld.put(construction.charAt(i), new Auto(tpos,construction.charAt(i)));
                    used += construction.charAt(i);
                } else {
                    this.feld.get(construction.charAt(i)).addToPos(strPos);
                }
            }
            i++;
        }
        this.feld = vorfeld;
        System.out.println(used);
        System.out.println(feldStatus());
    }

    public void printFeld() {
        char[][] vorfeld = this.feldStatus();
        for (char c : this.feld.keySet()) {
            vorfeld = this.feld.get(c).setzeDich(vorfeld);
        }
        String resultString = "";
        for (int i = 0; i < 6; i++) {
            resultString += "+---+---+---+---+---+\n";
            for (int j = 0; j < 6; j++) {
                resultString += "|" + vorfeld[i][j] + " ";
            }
            resultString += "|\n";
        }
        resultString += "+---+---+---+---+---+\n";
        System.out.println(resultString);
    }

    public char[][] feldStatus() {
        char[][] vorfeld = {{'_','_','_','_','_','_'},{'_','_','_','_','_','_'},{'_','_','_','_','_','_'},{'_','_','_','_','_','_'},{'_','_','_','_','_','_'},{'_','_','_','_','_','_'}};
        for (char c : this.feld.keySet()) {
            vorfeld = this.feld.get(c).setzeDich(vorfeld);
        }
        return vorfeld;
    }
    public boolean checkGewinn() {
        return this.feld.get('*').checkGewinn();
    }

    public void zug() {
        System.out.println("Wahl eines Autos (Zeichen angeben):");
        char inputChar = input.nextLine().charAt(0);
        System.out.println("Richtung (l = links, r = rechts, u = hoch, d = runter, q = zurück):");
        char inputChar2 = input.nextLine().charAt(0);
        if (!this.feld.get(inputChar).move(inputChar2)) {
            this.zug();
        }
        Auto.ganzFeld = this.feldStatus();
    }

    public int[] iPos(int i) {
        int[] strPos = new int[2];
        if (i > 5) {
            strPos[0] = 1;
        } else if (i > 11) {
            strPos[0] = 2;
        } else if (i > 17) {
            strPos[0] = 3;
        } else if (i > 23) {
            strPos[0] = 4;
        }
        strPos[1] = i - strPos[0]*5;
        return strPos;
    }
}
