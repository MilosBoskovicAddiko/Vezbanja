package BrojPonavljanjaKaraktera;

import java.util.Comparator;

public class Karakteri{
    private char karakter;
    private int brojPonavljanja;

    public Karakteri(char karakter, int brojPonavljanja) {
        this.karakter = karakter;
        this.brojPonavljanja = brojPonavljanja;
    }

    public char getKarakter() {
        return karakter;
    }

    public int getBrojPonavljanja() {
        return brojPonavljanja;
    }

    public void setKarakter(char karakter) {
        this.karakter = karakter;
    }

    public void setBrojPonavljanja(int brojPonavljanja) {
        this.brojPonavljanja = brojPonavljanja;
    }

    @Override
    public String toString() {
        return "Broj ponavljanja karaktera " + karakter + " iznosi " + brojPonavljanja;
    }
}
