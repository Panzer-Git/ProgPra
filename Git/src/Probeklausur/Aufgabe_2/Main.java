package Probeklausur.Aufgabe_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(GartenzaunTransposition.verschluesseln("Gartenzaun".toCharArray()));
        System.out.println(GartenzaunTransposition.entschluesseln(GartenzaunTransposition.verschluesseln("Gartenzaun".toCharArray())));
    }
}
