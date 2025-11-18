package Pra_5.aufgabe_1;

public class Spielekonsole {
    String name;
    int controllerAnzahl;

    Spielekonsole(String name, int controllerAnzahl) {
        this.name = name;
        if (controllerAnzahl < 0) {
            controllerAnzahl = -1 *  controllerAnzahl;
        }
        this.setName(name);
        this.setControllerAnzahl(controllerAnzahl);
        switch(this.controllerAnzahl) {
            case 0:
                System.out.println("Die Konsole: " + this.name + " hat keine Kontroller");
                break;
            case 1:
                System.out.println("Die Konsole: " + this.name + " hat nur einen Kontroller");
                break;
            default:
                System.out.println("Die Konsole: " + this.name + " hat mehr als einen Controller, nämlich: " + this.controllerAnzahl);
                break;
        }
    }

    public static void main(String[] args) {
        Spielekonsole spielekonsole = new Spielekonsole("MelllllineKonsole", 0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getControllerAnzahl() {
        return this.controllerAnzahl;
    }

    public void setControllerAnzahl(int controllerAnzahl) {
        this.controllerAnzahl = controllerAnzahl;
    }
}
