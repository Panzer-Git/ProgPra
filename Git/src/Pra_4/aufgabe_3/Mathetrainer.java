package Pra_4.aufgabe_3;

import java.util.Scanner;

public class Mathetrainer {
    int correctAnswers;

    public static void main(String[] args) {
        Mathetrainer mathetrainer = new Mathetrainer();
        mathetrainer.starte();
    }

    void starte() {
        System.out.println("Start des Mathetrainers");
        while(correctAnswers < 10) {
            if (generiereFrage()) {
                correctAnswers++;
            }
            System.out.println("Korrekte Antworten: " + correctAnswers);
        }
        System.out.println("Ende des Mathetrainers");
    }

    boolean generiereFrage() {
        int zahl1 = generiereZahl();
        int zahl2 = generiereZahl();
        char operator = generiereOperator();
        int correctAnswer;
        if (operator == '+') {
            correctAnswer = zahl1 + zahl2;
        } else if (operator == '-') {
            correctAnswer = zahl1 - zahl2;
        } else if (operator == '*') {
            correctAnswer = zahl1 * zahl2;
        }  else {
            if (zahl2 == 0) {zahl2 += 1;}
            correctAnswer = zahl1 / zahl2;
        }
        System.out.println(zahl1 + " " + operator + " " + zahl2 + "\n=");
        int answer = new Scanner(System.in).nextInt();
        if (answer == correctAnswer) {
            System.out.println("Richtig!");
            return true;
        } else  {
            System.out.println("Leider falsch! Korrektes Ergebnis ist " + correctAnswer);
            return false;
        }
    }

    int generiereZahl() {
        return (int) (Math.random() * 9);
    }

    char generiereOperator() {
        char[] operatoren = {'+', '-', '*', '/'};
        int random = (int) (Math.random() * 4);
        return operatoren[random];
    }
}
