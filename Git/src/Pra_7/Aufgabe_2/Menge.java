package Pra_7.Aufgabe_2;

import java.util.ArrayList;

public class Menge {
    ArrayList<Person> set;

    public ArrayList<Person> getMenge() {
        return this.set;
    }

    public ArrayList<ArrayList<String>> nameList() {
        ArrayList<ArrayList<String>> namesList = new ArrayList<ArrayList<String>>();
        for (Person p : this.set) {
            ArrayList<String> names = this.nameArray(p);
            namesList.add(names);
        }
        return namesList;
    }

    public ArrayList<String> nameArray(Person p) {
        ArrayList<String> names = new ArrayList<String>();
        names.add(p.getVorname());
        names.add(p.getNachname());
        return names;
    }

    Menge() {
        this.set = new ArrayList<Person>();
    }

    Menge(Menge copymenge) {
        this.set = copymenge.getMenge();
    }

    public boolean equals(Menge menge) {
        ArrayList<ArrayList<String>> namesList = this.nameList();
        for  (Person p : menge.getMenge()) {
            ArrayList<String> names = nameArray(p);

            if (!namesList.contains(names)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInMenge(Person person) {
        for (Person p : this.set) {
            if (p.getVorname().equals(person.getVorname()) && p.getNachname().equals(person.getNachname())) {
                return true;
            }
        }
        return false;
    }
}
