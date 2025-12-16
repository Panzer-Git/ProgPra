package Probeklausur.Aufgabe_2;

public class GartenzaunTransposition {
    static char[] verschluesseln(char[] klartext) {
        String c1 ="";
        String c2 ="";
        for (int i = 0; i < klartext.length; i++) {
            if (i % 2 == 0) {
                c1 += klartext[i] + "";
            } else {
                c2 += klartext[i] + "";
            }
        }
        return (c1 += c2).toCharArray();
    }
    static char[] entschluesseln (char[] geheimtext) {
        String c1 ="";
        String c2 ="";
        String klar = "";
        for (int i = 0; i < (geheimtext.length/2); i++) {
            c1 += geheimtext[i] + "";
        }
        for (int i = (int) (geheimtext.length/2); i < geheimtext.length; i++) {
            c2 += geheimtext[i] + "";
        }
        for (int i = 0; i < c1.length(); i++) {
            klar += c1.charAt(i);
            if (i < c2.length()) {
                klar += c2.charAt(i);
            }
        }
        return klar.toCharArray();
    }
}
