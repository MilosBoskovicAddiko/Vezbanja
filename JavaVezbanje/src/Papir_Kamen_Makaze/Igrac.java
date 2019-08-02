package Papir_Kamen_Makaze;

public class Igrac {
    private String ime;
    private int brojPoena = 0;
    private KamenPapirMakaze.MoguciIzbori izbor;

    public Igrac(String ime) {
        this.ime = ime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public KamenPapirMakaze.MoguciIzbori getIzbor() {
        return izbor;
    }

    public void setIzbor(KamenPapirMakaze.MoguciIzbori izbor) {
        this.izbor = izbor;
    }

    public String getIme() {
        return ime;
    }

    public boolean isKamen() {
        if (this.getIzbor().getI() == 1) {
            return true;
        }
        return false;
    }

    public boolean isPapir() {
        if (this.getIzbor().getI() == 2) {
            return true;
        }
        return false;
    }

    public boolean isMakaze() {
        if (this.getIzbor().getI() == 3) {
            return true;
        }
        return false;
    }

    public boolean isKraj() {
        if (this.getIzbor().getI() == 4) {
            return true;
        }
        return false;
    }
}
