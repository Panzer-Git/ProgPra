package Pra_4.aufgabe_3;

public class Mathetrainer {
    int correctAnswers;

    public static void main(String[] args) {
        Mathetrainer mathetrainer = new Mathetrainer();
        mathetrainer.starte();
    }

    void starte() {
        while(correctAnswers < 10) {

        }
    }

    boolean generiereFrage() {
        return false;
    }

    int generiereZahl() {
        return (int) ((Math.random() * 9) + 1);
    }

    char generiereOperator() {
        char[] operatoren = {'+', '-', '*', '/'};
        int random = (int) (Math.random() * 3);
        return operatoren[random];
    }
}
