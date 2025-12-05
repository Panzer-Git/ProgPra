package Pra_7.Aufgabe_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanny = new Scanner(System.in);
    boolean neueFragen = true;
    boolean neueTeilnehmer = true;
    List<Integer> answers = new ArrayList<>();
    List<Frage> fragen = new ArrayList<>();
    List<teilnehmer> teilnehmer = new ArrayList<>();

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Umfrage Start");

        while(m.neueFragen){
            System.out.println("geben sie ihre Frage ein");
            m.addFrage();
            System.out.println("noch eine Frage? (n/j)");
            m.neueFragen = m.testIfNEw();
        }

        m.umfrage();

        m.auswerten();
    }

    public void umfrage(){
        System.out.println("Start der Umfrage");

        while(neueTeilnehmer){
            teilnehmer teilnehmer1 = new teilnehmer();
            teilnehmer.add(teilnehmer1);
            System.out.println(fragen.size());
            for(int i = 0; i < fragen.size(); i++){
                System.out.println(fragen.get(i).getFragenText());
                teilnehmer.getLast().answerQuestion(scanny.nextLine());
            }
            System.out.println("noch ein Teilnehmer? (n/j)");
            neueTeilnehmer = testIfNEw();
        }
    }

    public void auswerten(){
        for (teilnehmer teilnehmer1: teilnehmer){
            teilnehmer1.printAll();
        }

        System.out.println("Start der Auswertung");
        int i = 0;
        double ergebnis = 0;
        for(Frage frage : fragen){
            for(int j = 0; j < teilnehmer.size(); j++){
                answers.add(teilnehmer.get(j).getAnswer(i));
            }
            for(int x: answers){
                ergebnis += x;
            }
            ergebnis /= teilnehmer.size();
            ergebnis *= 100;
            i++;
            System.out.println(frage.getFragenText());
            System.out.println("-mit Ja beanwortet: " + ergebnis);
            ergebnis = 100 - ergebnis;
            System.out.println("-mit Nein beantwortet: " + ergebnis);
            ergebnis = 0;
            answers = new ArrayList<>();


        }
    }
    public void addFrage(){
        Frage frage = new Frage(scanny.nextLine());
        fragen.add(frage);
    }


    public boolean testIfNEw(){
        if(scanny.nextLine().equals("n")){
            return  false;
        }else {
            return  true;
        }
    }
}