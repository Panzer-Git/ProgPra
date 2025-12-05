public class Radio extends RundFunkEmpfangsGeraet{
    double frequenz;
    public Radio()
    {
        frequenz=87.5;
    }
    void waehleSender(double newFrequenz){
        if(this.istAn()){
            this.frequenz = newFrequenz;
        }
    }
    @Override
    public String toString() {
        String output = "Radio mit Lautstaerke: " + lautstaerke + " hat die Frequenz: " + frequenz + " MHz und ist ";
        if(istAn()) {
            output += "eingeschaltet.";
        }else{
            output += "ausgeschaltet.";
        }
        return output;
    }
}
