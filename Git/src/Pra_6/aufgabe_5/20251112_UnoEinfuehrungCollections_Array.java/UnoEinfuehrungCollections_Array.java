// Beispielprogramm für ein Uno-Spiel
// Thema war eine Anregung aus dem Auditorium.
// Besonderheit: mehrere Klassen in 1 Datei, eine davon ist public. Dient lediglich dazu, nicht immer zw. Fenstern wechseln zu müssen.
// Schreiben Sie bitte 1 Klasse je Datei, wenn sie selbst programmieren.

// Wie sind wir vorgegangen:
// Aufgabenstellung Uno (nicht mehr)
// Wir haben überlegt, welche Klassen wir benötigen
// Wir haben dann überlegt, welche Objektvariablen für welche Klasse sinnvoll sind.
// Nun haben wir begonnen, funktionalität hinzuzufügen.

import java.util.ArrayList;

public class UnoEinfuehrungCollections_Array {
    public static void main(String[] args) {
        int[] intArray = new int[5];  // immer erst Objekt erzeugen
        intArray[4] = 1;
        intArray[0] = 2;
        intArray[2] = 3;
        int vierteZahl = intArray[3];
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        for (int i:intArray){ // forEach-Schleife, vollständer Durchlauf durch Collection, hier Array
            System.out.println(i);
        }
        int i = 5;
        Spielen s = new Spielen();
        s.spielen();

/*        // dies ist noch nicht das fertige Spiel. Wir können die Funktionalität einzelner Klassen "testen" und einzelne Methoden. Das ist ein Vorteil der Objektorientierung.
        // Wir sprechen manchmal auch von Seggregation of Concerns (Aufteilung der Verantwortlichkeiten.)
        Spielkarte blau3 = new Spielkarte(3, "blau");
        Spielkarte blau4 = new Spielkarte(4, "blau");
        Hand hand = new Hand();
        hand.karteHinzu(blau3);
        hand.karteHinzu(blau4);
        hand.ausgeben();
        hand.karteWeg(blau4);
        System.out.println("   ");
        hand.ausgeben(); */
    }
}

class Spielen{
    Spieler[]  spieler=new Spieler[4];
    // Reserviert Speicherplatz, um auf 4 Spieler referenzieren zu können. Hierzu später mehr
    // es ist nicht schlimm, wenn sie dies noch nicht verstehen.
    // Es handelt sich um eine Collection, die eine statische Anzahl an Elementen (Spieler-Objekten) referenzieren kann.

    public void spielen(){
        Spielkarte[] spielkartenDeck=new Spielkarte[120];
        /*for(Spielkarte spielkarte: spielkartenDeck){  // blöde Idee zur Initialisierung
            spielkarte = new Spielkarte(1,"blau");

        }*/
/*        for(int i=0;i<spielkartenDeck.length;i++){
            Spielkarte temp =   new Spielkarte(1, "blau");
            if(i==0){
                spielkartenDeck[i]=temp;
            }
            else {
                for (int j = 0; j < i; j++) {
                    if (temp.equals(spielkartenDeck[j])) {
                        return;
                    } else {
                        spielkartenDeck[i] = temp;

                    }
                }
            }
        }


 */
        erzeugeKartenEinerFarbe(spielkartenDeck,"blau",0,30);
        erzeugeKartenEinerFarbe(spielkartenDeck,"grün",30,30);
        erzeugeKartenEinerFarbe(spielkartenDeck,"gelb",60,30);
        erzeugeKartenEinerFarbe(spielkartenDeck,"rot",90,30);


        int[] ticTacToe = new int[9];
        int[][] ticTacToe2 = new int[3][3];
        ticTacToe2[0][0] = 0;
        ticTacToe2[0][1] = 1;
        ticTacToe2[2][2] = 0;
        ticTacToe2[1][1] = 1;
        ticTacToe2[2][1] = 0;



        /*
        for(int i=0;i<spielkartenDeck.length&&i<30;i++){
            spielkartenDeck[i] = new Spielkarte(i+1, "blau");

        }

        for(int i=30;i<spielkartenDeck.length&&i<60;i++){
            spielkartenDeck[i] = new Spielkarte(i+1, "gelb");

        }

        for(int i=60;i<spielkartenDeck.length&&i<90;i++){
            spielkartenDeck[i] = new Spielkarte(i+1, "grün");

        }

        for(int i=90;i<spielkartenDeck.length;i++){
            spielkartenDeck[i] = new Spielkarte(i+1, "blau");

        }  */



        for (Spielkarte s: spielkartenDeck){
            System.out.println(s.getFarbe() + " " + s.getZahl());
        }

    }

    void erzeugeKartenEinerFarbe(Spielkarte[] spielkarten, String farbe, int startIndex, int anzahl){
        for(int i=startIndex;i<spielkarten.length&& i <startIndex+anzahl;i++){
            spielkarten[i] = new Spielkarte(i+1, farbe);

        }


    }
}




class Spielkarte{
    int zahl; // Objektvariable, globale Variable bzgl. Klasse Spielkarte, Instanzvariable
    String farbe;

    Spielkarte(int zahl, String farbe){ // voll qualifizierter Konstruktor (es sind für alle Objektvariablen Parameter vorgesehen)
        this.zahl=zahl;this.farbe=farbe;
    }

    String getFarbe(){ // liefert den Wert der Objektvariable Farbe zurück "Getter"
        return this.farbe;
    }
    int getZahl(){
        return this.zahl;
    }

    public boolean equals(Spielkarte obj) {
        return this.zahl==obj.zahl && this.farbe.equals(obj.farbe);
    }

    // Die Klasse hat KEINE set-Methoden, da sich weder Farbe noch Zahl einer Spielkarte über die Zeit verändern kann
}

class Spieler{
    int siege;
    boolean isRaus = false; // zu Beginn spielen alle mit
    String name;
    Hand hand; // am Anfang hat man noch keine Hand

    Spieler(String name,int siege){ // Konstruktor zur partiellen Initialisierung der Objektvariablen
                                    // Zu Beginn haben die spieler noch keine Hand
        this.name=name;this.siege=siege;
    }

}

// Klasse zur Verwaltung von Spielkarten, kann z.B. für die Spieler verwendet werden.
class Hand{
    ArrayList<Spielkarte> gehalteneKarten =new ArrayList<>(); // Während ein Array (s.o.) nur eine feste anzahl an Elementen referenzieren kann, kann eine ArrayList eine beliebige Anzahl an Referenzen verwalten
    // <Spielkarte> signalisiert, dass nur Objekte vom Typ Spielkarte referenziert werden können.
    // Der Konstruktoraufruf sorgt lediglich dafür, dass wir die Variable gehalteneKarten initialisieren (wäre sonst null)
    // Wenn Sie das noch nicht verstehen => nicht schlimm ;-) Wir behandeln das Thema Collections noch ausführlich.


    void karteHinzu(Spielkarte spielkarte){
        gehalteneKarten.add(spielkarte); // wir sehen hier einen Aufruf einer Methode , um eine Referenz auf eine Spielkarte zur Sammlung von Referenzen (hier: ArrayList) hinzuzufügen, später mehr
    }

    void karteWeg(Spielkarte spielkarte){ // wir sehen hier einen Aufruf einer Methode , um eine Referenz auf eine Spielkarte aus der Sammlung von Referenzen (hier: ArrayList) zu entfernen, später mehr
        gehalteneKarten.remove(spielkarte);
    }

    void ausgeben(){
        System.out.println("Du hast" + gehalteneKarten.size());
        for (Spielkarte spielkarte : gehalteneKarten) { // Teaser: ForEach-Schleife ... kommt später

        }
        for (int i = 0; i < gehalteneKarten.size(); i++) { // Schleife, um auf jede einzelne Karte der Hand zuzugreifen ... kommt später genauer
            Spielkarte spielkarte = gehalteneKarten.get(i); // liefert mir die i. Spielkarte der Hand
            System.out.println(spielkarte.getFarbe() + " " +  spielkarte.getZahl()); // gibt Farbe und Zahl der Spielkarte aus, indem die get-Methoden von Spielkarte genutzt werden.
        }
    }
}