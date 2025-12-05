public class RundFunkEmpfangsGeraet {
    int lautstaerke;
    boolean eingeschaltet;
    RundFunkEmpfangsGeraet() {
        lautstaerke = 0;
        eingeschaltet = false;
    }

    void volume(int x) {
        if(istAn()) {
            lautstaerke = x;
        }
    }

    void lauter() {
        if(istAn()) {
            lautstaerke++;
        }
    }

    void leiser() {
        if(istAn()) {
            lautstaerke--;
        }
    }

    void an() {
        eingeschaltet = true;
    }

    void aus() {
        eingeschaltet = false;
    }

    boolean istAn() {
        return eingeschaltet;
    }

    @Override
    public String toString() {
        String output = "Rundfunkgeraet mit Lautstaerke: " + lautstaerke + " ist ";
        if(istAn()) {
            output += "eingeschaltet.";
        }else{
            output += "ausgeschaltet.";
        }
        return output;
    }
}
