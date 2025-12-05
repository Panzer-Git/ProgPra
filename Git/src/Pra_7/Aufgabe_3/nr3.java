package Pra_7.Aufgabe_3;

class Grossvater {
    int x = 3;
    int y = -4;

}
class Vater extends Grossvater {
    float x = 4.5F;
    int z;
    public Vater(int z) {
        this.z = z;
    }



}
class Sohn extends Vater {
    long a;
    double x = -18.5;
    public Sohn(long a) {
        super(5);
        this.a = a;
    }

}

class Enkel extends Sohn {
    public Enkel(long a) {
        super(a);
    }
    public static void main(String[] args){
        Enkel erwin = new Enkel(1);
        System.out.println(erwin.erwinRechner());
    }

    public double erwinRechner(){
        double ergebnis = 0;
        ergebnis += this.a;
        ergebnis += this.x;
        ergebnis += ((Vater)this).x;
        ergebnis += this.z;
        ergebnis += this.y;
        ergebnis += ((Grossvater)this).x;
        return ergebnis;
    }
}
