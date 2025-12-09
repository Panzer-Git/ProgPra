package Pra_8.Aufgabe_4;

import java.util.Arrays;

public class Auto {
    int laenge;
    int[][] pos;
    boolean isVertical;
    char name;
    static char[][] ganzFeld;

    public char[][] setzeDich(char[][] vorfeld) {
        vorfeld[pos[0][0]][pos[0][1]] = name;
        vorfeld[pos[1][0]][pos[1][1]] = name;
        if (this.laenge == 3) {
            vorfeld[pos[2][0]][pos[2][1]] = name;
        }
        return vorfeld;
    }

    public Auto(int[] firstPos, char name) {
        this.pos = new int[][]{firstPos};
        this.name = name;
        this.laenge = 1;
    }

    public boolean checkGewinn() {
        if (this.laenge == 3) {
            if (this.pos[0][1] == 5 || this.pos[1][1] == 5 || this.pos[2][1] == 5) {
                return true;
            }
        } else {
            if (this.pos[0][1] == 5 || this.pos[1][1] == 5) {
                return true;
            }
        }
        return false;
    }

    public void addToPos(int[] newPos) {
        if (this.laenge == 1) {
            this.pos = new int[][]{this.pos[0], newPos};
            this.laenge = 2;
            this.isVertical = this.pos[0][0] != newPos[0];
        } else if (this.laenge == 2) {
            this.pos = new int[][] {this.pos[0], this.pos[1], newPos};
            this.laenge = 3;
        }
    }

    public boolean move(char move) {
        if (move == 'l' && !this.isVertical && checkFrei('l')) {
            this.pos[0][1] -= 1;
            this.pos[1][1] -= 1;
            if (this.laenge == 3) {
                this.pos[2][1] -= 1;
            }
        } else if (move == 'r' && !this.isVertical && checkFrei('r')) {
            for (int[] i1 : this.pos) {
                i1[1] += 1;
            }
        } else if (move == 'u' && this.isVertical && checkFrei('u')) {
            for (int[] i1 : this.pos) {
                i1[0] -= 1;
            }
        } else if (move == 'd' && this.isVertical && checkFrei('d')) {
            for (int[] i1 : this.pos) {
                i1[0] += 1;
            }
        } else if (move == 'q') {
            return false;
        } else {
            System.out.println("Invalider Zug!");
            return false;
        }
        return true;
    }

    public boolean checkFrei(char move) {
        boolean frei = false;
        switch (move) {
            case 'l':
                if (!this.isVertical) {
                    if (this.pos[0][1] - 1 >= 0) {
                        if (Auto.ganzFeld[this.pos[0][1]][this.pos[0][1] - 1] == '_') {
                            frei = true;
                        }
                    }
                }
                break;
            case 'r':
                if (!this.isVertical) {
                    if (this.laenge == 3) {
                        if (this.pos[2][1] + 1 <= 5) {
                            if (Auto.ganzFeld[this.pos[2][0]][this.pos[2][1] + 1] == '_') {
                                frei = true;
                            }
                        }
                    } else {
                        if (this.pos[1][1] + 1 <= 5) {
                            if (Auto.ganzFeld[this.pos[1][0]][this.pos[1][1] + 1] == '_') {
                                frei = true;
                            }
                        }
                    }
                }
                break;
            case 'u':
                if (this.isVertical) {
                    if (this.pos[0][0] - 1 >= 0) {
                        if (Auto.ganzFeld[this.pos[0][0]-1][this.pos[0][1]] == '_') {
                            frei = true;
                        }
                    }
                }
                break;
            case 'd':
                if (this.isVertical) {
                    if (this.laenge == 3) {
                        if (this.pos[2][0] + 1 <= 5) {
                            if (Auto.ganzFeld[this.pos[2][0] + 1][this.pos[2][1]] == '_') {
                                frei = true;
                            }
                        }
                    } else {
                        if (this.pos[1][0] + 1 <= 5) {
                            if (Auto.ganzFeld[this.pos[1][0] + 1][this.pos[1][1]] == '_') {
                                frei = true;
                            }
                        }
                    }
                }
        }
        return frei;
    }
}
