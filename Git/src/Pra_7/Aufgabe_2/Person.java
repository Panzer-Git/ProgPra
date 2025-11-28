package Pra_7.Aufgabe_2;

public class Person {
    String Vorname;
    String Nachname;

    Person(String Vorname, String Nachname) {
        setVorname(Vorname);
        setNachname(Nachname);
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

    public boolean equals(Person p) {
        return (this.Vorname.equals(p.getVorname()) && this.Nachname.equals(p.getNachname()));
    }

    @Override
    public String toString() {
        return "Person: " + this.Vorname + ", " + this.Nachname;
    }
}
