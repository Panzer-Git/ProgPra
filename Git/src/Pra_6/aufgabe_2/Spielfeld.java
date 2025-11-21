package Pra_6.aufgabe_2;

public class Spielfeld {
    Plaettchen[][] feld;

    Spielfeld() {
        this.feld = new Plaettchen[][]{{new Plaettchen("leer"), new Plaettchen("leer"), new Plaettchen("leer")},
                {new Plaettchen("leer"), new Plaettchen("leer"), new Plaettchen("leer")},
                {new Plaettchen("leer"), new Plaettchen("leer"), new Plaettchen("leer")}};
    }

    public Plaettchen[][] getFeld() {
        return this.feld;
    }

    public char checkGewinn() {
        for (int i = 0; i < 3; i++) {
            if (!this.getFeld()[i][0].getFarbe().equals("leer") && (this.getFeld()[i][0].getFarbChar() == this.getFeld()[i][1].getFarbChar() && (this.getFeld()[i][0].getFarbChar() == this.getFeld()[i][2].getFarbChar()))) {
                return this.getFeld()[i][0].getFarbChar();
            } else if (!this.getFeld()[0][i].getFarbe().equals("leer") && (this.getFeld()[0][i].getFarbChar() == this.getFeld()[1][i].getFarbChar() && (this.getFeld()[0][i].getFarbChar() == this.getFeld()[2][i].getFarbChar()))) {
                return this.getFeld()[0][i].getFarbChar();
            }
        }
        if (!this.getFeld()[1][1].getFarbe().equals("leer") && (this.getFeld()[0][0].getFarbChar() == this.getFeld()[1][1].getFarbChar() && (this.getFeld()[0][0].getFarbChar() == this.getFeld()[2][2].getFarbChar()))) {
            return this.getFeld()[1][1].getFarbChar();
        } else if (!this.getFeld()[1][1].getFarbe().equals("leer") && (this.getFeld()[2][0].getFarbChar() == this.getFeld()[1][1].getFarbChar() && (this.getFeld()[1][1].getFarbChar() == this.getFeld()[0][2].getFarbChar()))){
            return this.getFeld()[1][1].getFarbChar();
        } else {
            return '-';
        }
    }

    public void legeAb(int x, int y, Plaettchen platte) {
        this.feld[x][y] = platte;
    }
}
