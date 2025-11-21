package Pra_6.aufgabe_2;

public class Plaettchen {
    String Farbe;

    Plaettchen(String Farbe) {
        this.Farbe = Farbe;
    }

    public char getFarbChar() {
        if (this.getFarbe().equals("grün")) { return 'g'; }
        else if (this.getFarbe().equals("blau")) { return 'b'; }
        { return '-'; }
    }

    public String getFarbe() {
        return this.Farbe;
    }
}
