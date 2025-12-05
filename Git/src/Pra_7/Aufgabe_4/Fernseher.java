package Pra_7.Aufgabe_4;

public class Fernseher extends RundFunkEmpfangsGeraet {
    int kanal;
    public Fernseher() {
        this.kanal = 1;
    }
    void waehleKanal(int newKanal){
        if(this.istAn()){
            kanal = newKanal;
        }
    }

    @Override
    public String toString() {
        String output = "Radio mit Lautstaerke: " + lautstaerke + " ist auf Kanal: " + kanal + " und ist ";
        if(istAn()) {
            output += "eingeschaltet.";
        }else{
            output += "ausgeschaltet.";
        }
        return output;
    }
}
