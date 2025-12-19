package Probeklausur.Aufgabe_3;

public class test {
    public static void main(String[] args) {
        int[][] m = {   {7,4,2,2},
                        {6,3,2,7},
                        {1,9,0,5}} ;
        int zahl = 5;
        EinUndAusgabe ea = new EinUndAusgabe();
        int w = ea.leseInteger();
        System.out.println(m[m[1][w]][m[w][2]]);

        while (f(zahl) > 0) {
            zahl--;
            System.out.print(zahl);
        }
    }

    static int f(int zahl) {
        zahl--;
        return zahl;
    }

}
