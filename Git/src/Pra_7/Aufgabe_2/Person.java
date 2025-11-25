package Pra_7.Aufgabe_2;

public class Person {
    String Vorname;
    String Nachname;

    Person(String Vorname, String Nachname) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }
}
