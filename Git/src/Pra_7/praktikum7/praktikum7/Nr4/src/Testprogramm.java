public class Testprogramm {
    public static void main(String[] args) {
        RundFunkEmpfangsGeraet geraet = new RundFunkEmpfangsGeraet();
        Radio radio = new Radio();
        Fernseher fernseher = new Fernseher();

        System.out.println("Test für ein Geraet");
        geraet.lauter();
        System.out.println(geraet);
        geraet.an();
        geraet.lauter();
        System.out.println(geraet);
        geraet.volume(50);
        System.out.println(geraet);
        geraet.aus();
        System.out.println(geraet);

        System.out.println("Test für ein Radio");
        radio.an();
        System.out.println(radio);
        radio.waehleSender(67.69);
        System.out.println(radio);
        radio.lauter();
        System.out.println(radio);
        radio.aus();
        System.out.println(radio);

        System.out.println("Test für ein Fernseher");
        fernseher.an();
        System.out.println(fernseher);
        fernseher.waehleKanal(13);
        System.out.println(fernseher);
        fernseher.lauter();
        System.out.println(fernseher);
        fernseher.aus();
        System.out.println(fernseher);


    }

}
