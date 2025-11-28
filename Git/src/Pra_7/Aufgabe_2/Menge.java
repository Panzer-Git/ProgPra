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

    public boolean equalsi(Menge menge) {
        for (Person p1 : menge.getMenge()) {
            for (Person p2 : this.getMenge()) {
                if (!p1.equals(p2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void add(Person p) {
        if (!this.checkInMenge(p)) {
            this.set.add(p);
        }
    }

    public void remove(Person p) {
        this.set.remove(p);
    }

    public boolean checkInMenge(Person person) {
        for (Person p : this.set) {
            if (p.equals(person)) {
                return true;
            }
        }
        return false;
    }

    public Menge intersectionWith(Menge menge) {
        Menge resultMenge = new Menge();
        for (Person p : menge.getMenge()) {
            if (this.checkInMenge(p)) {
                resultMenge.add(p);
            }
        }
        return resultMenge;
    }

    public Menge unificationWith(Menge menge) {
        Menge resultMenge = new Menge(menge);
        for (Person p : this.getMenge()) {
            resultMenge.add(p);
        }
        return resultMenge;
    }

    public Menge differenceWith(Menge sub) {
        Menge resultMenge = new Menge();
        resultMenge.set = new ArrayList<Person>(this.getMenge());
        for (Person subP : sub.getMenge()) {
            if (resultMenge.checkInMenge(subP)) {
                resultMenge.remove(subP);
            }
        }
        return resultMenge;
    }

    @Override
    public String toString() {
        String result = "";
        for (Person p : this.set) {
            result = result + p.getVorname() + ", " + p.getNachname() + ";\n";
        };
        return "Menge Content:\n" + result;
    }
}
