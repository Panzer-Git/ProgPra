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

    public Auto(int[][] pos, boolean isvertical, char name) {
        this.pos = pos;
        this.isVertical = isvertical;
        this.name = name;
        this.laenge = pos.length;
    }




}
