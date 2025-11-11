package Pra_6.aufgabe_1;

import java.util.Scanner;

public class TicTacToe {
    char[][] feld;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.starte();
    }

    TicTacToe() {
        this.feld = new char[][]{{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
    }

    public void starte() {
        System.out.println("Start des TicTacToe-Spiels");
        this.zeigeFeld();
        while (this.checkGewinn() == '-') {
            this.runde();
        }
        System.out.println(this.checkGewinn() + "-Spieler hat gewonnen!");
    }

    public void runde() {
        System.out.println("X-Spieler, wo setzt du dein Zeichen (x,y)?");
        this.setzeZeichen('X');
        this.zeigeFeld();
        System.out.println("O-Spieler, wo setzt du dein Zeichen (x,y)?");
        this.setzeZeichen('O');
        this.zeigeFeld();
    }

    public char checkGewinn() {
        for (int i = 0; i < 3; i++) {
            if (this.feld[i][0] == this.feld[i][1] && (this.feld[i][0] == this.feld[i][2]) && this.feld[i][0] != '-') {
                return this.feld[i][0];
            } else if (this.feld[0][i] == this.feld[1][i] && (this.feld[0][i] == this.feld[2][i]) && this.feld[0][i] != '-') {
                return this.feld[0][i];
            }
        }
        if (this.feld[0][0] == this.feld[1][1] && (this.feld[0][0] == this.feld[2][2]) && this.feld[1][1] != '-') {
            return this.feld[1][1];
        } else if (this.feld[2][0] == this.feld[1][1] && (this.feld[1][1] == this.feld[0][2]) && this.feld[1][1] != '-') {
            return this.feld[1][1];
        } else {
            return '-';
        }
    }

    public void zeigeFeld() {
        System.out.println("Feld des TicTacToe-Spiels:");
        for (int i = 0; i < 3; i++) {
            System.out.println(this.feld[i][0] + " " + this.feld[i][1] + " " +  this.feld[i][2]);
        }
    }

    public void setzeZeichen(char Z) {
        String answer = this.scanner.nextLine();
        int x = Integer.parseInt(answer.split(",")[0]);
        int y = Integer.parseInt(answer.split( ",")[1]);
        this.feld[y][x] = Z;
    }
}
