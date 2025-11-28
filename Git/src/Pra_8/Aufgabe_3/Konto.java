package Pra_8.Aufgabe_3;

public class Konto {
    private int kontostand;
    private int kreditrahmen;

    public Konto() {
        this.kontostand = 0;
        this.kreditrahmen = 0;
    }

    public Konto(Konto copykonto) {
        this.kontostand = copykonto.getKontostand();
        this.kreditrahmen = copykonto.getKreditrahmen();
    }

    public Konto cloneKonto() {
        return this;
    }

    public boolean equals(Konto konto) {
        return this.kontostand == konto.getKontostand();
    }

    public String wortKontostand() {
        return "Kontostand: $" + this.kontostand;
    }

    public int getKontostand() {
        return this.kontostand;
    }

    public int getKreditrahmen() {
        return this.kreditrahmen;
    }

    public void payIn(int betrag) {
        if (betrag > 0) {
            this.kontostand += betrag;
        }
        if (this.kreditrahmen < 3000 && this.kontostand > 10000) {
            this.kreditrahmen = 3000;
        }
    }

    public boolean payOut(int betrag) {
        if  (this.getFullStand() >= betrag && betrag > 0) {
            this.kontostand -= betrag;
            return true;
        }
        return false;
    }

    public void transfer(Konto transferkonto, int betrag) {
        if (this.payOut(betrag)) {
            transferkonto.payIn(betrag);
        }
    }

    public int getFullStand() {
        return this.getKontostand() + this.getKreditrahmen();
    }
}
