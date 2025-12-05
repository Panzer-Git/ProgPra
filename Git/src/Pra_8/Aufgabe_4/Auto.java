package Pra_8.Aufgabe_4;

public class Auto {
    int laenge;
    int[][] pos;
    boolean isVertical;
    char name;

    public char[][] setzeDich(char[][] vorfeld) {
        char[][] resultfeld = new char[5][5];
        resultfeld[pos[0][0]][pos[0][1]] = name;
        resultfeld[pos[1][0]][pos[1][1]] = name;
        if (this.laenge == 3) {
            resultfeld[pos[2][0]][pos[2][1]] = name;
        }
        return resultfeld;
    }

    public Auto(int[][] pos, char name) {
        this.pos = pos;
        if (pos[0][0] == pos[1][0]) {
            this.isVertical = true;
        } else {
            this.isVertical = false;
        }
        this.name = name;
        this.laenge = pos.length;
    }

    public boolean checkGewinn() {
        if (this.pos[0][1] == 5 || this.pos[1][1] == 5 || this.pos[2][1] == 5) {
            return true;
        }
        return false;
    }

    public void addToPos(int[] pos) {
        int[][] tmp = {{},{},{}};
        tmp[0] = this.pos[0];
        if (!(this.pos[1] == null)) {
            tmp[1] = this.pos[1];
        } else if (!(this.pos[2] == null)){
            this.pos[2] = pos;
        }
    }

    public void updateLaenge() {

    }
}
