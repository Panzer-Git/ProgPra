package Pra_9.de.hsos.prog1.testat;

import java.util.ArrayList;

public class mariusPanzer {
    Object teacher = "DozentenName";
    static int anzahlObjekte = 0;
    public ArrayList<String> namen = null;

    public static void main(String[] args) {
        Object student = "Marius Panzer";
        mariusPanzer zt = new mariusPanzer();
        System.out.println(zt.getTeacher());
        zt.zahlenRueckwaerts(12);
        System.out.println("ArrayList");
        zt.namen = zt.init();
        zt.ausgeben(zt.namen);
        zt.ausgeben(zt.namen, 2, 9);
    }

    mariusPanzer() {
        anzahlObjekte += 1;
    }

    public Object getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Object teacher) {
        this.teacher = teacher;
    }

    public boolean zahlenRueckwaerts(int i) {
        if (i > 10) {
            for (int it = i; it > 0; it--) {
                if (it % 2 == 0) {
                    System.out.println("durch 2 teilbar");
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> init() {
        String vorname = "Marius";
        String nachname = "Panzer";
        ArrayList<String> liste = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            liste.add(vorname);
        }
        int i = 0;
        while (i < 3) {
            liste.add(nachname);
            i++;
        }
        return liste;
    }

    public void ausgeben(ArrayList<String> strings) {
        if (strings == null) {
            System.out.println("leere Arraylist");
        } else {
            for (String s : strings) {
                System.out.println(s);
            }
        }
    }

    public void ausgeben(ArrayList<String> strings, int min, int max) {
        if (min >= 1 && max <= 10 && min <= max) {
            String ausgabe = "";
            for (String s : strings) {
                ausgabe += s;
            }
            int rando = (int) (Math.random() * (max - min + 1) + min);
            while (rando != min) {
                System.out.println(ausgabe);
                rando = (int) (Math.random() * (max - min + 1) + min);
            }
        }
    }
}
