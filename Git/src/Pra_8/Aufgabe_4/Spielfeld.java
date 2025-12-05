package Pra_8.Aufgabe_4;

import java.util.HashMap;

public class Spielfeld {
    HashMap<Character, Auto> feld = new HashMap();

    public Spielfeld(String construction) {
        HashMap<Character, Auto> vorfeld = new HashMap();
        String used = "";
        for (int i = 0; i < construction.length(); i++) {
            int[] strPos = iPos(i);
            if (i > 0) {
                if (this.feld.containsKey(construction.charAt(i))) {
                    Auto tmpAuto = this.feld.get(construction.charAt(i));
                    this.feld.get(construction.charAt(i)).addToPos(strPos);
                } else {
                    int[][] pos = {{strPos[0], strPos[1]}};
                    vorfeld.put(construction.charAt(i), new Auto(pos,construction.charAt(i)));
                    used += construction.charAt(i);
                }
            }
            i++;
        }
        this.feld = vorfeld;
    }

    public void printFeld() {
        char[][] vorfeld = new char[6][6];
        for (char c : this.feld.keySet()) {
            vorfeld = this.feld.get(c).setzeDich(vorfeld);
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
        return this.feld.get('*').checkGewinn();
    }

    public void zug() {

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
