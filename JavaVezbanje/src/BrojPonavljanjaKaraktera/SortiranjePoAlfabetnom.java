package BrojPonavljanjaKaraktera;

import java.util.Comparator;

public class SortiranjePoAlfabetnom implements Comparator<Karakteri> {

    @Override
    public int compare(Karakteri o1, Karakteri o2) {
        return o1.getKarakter() - o2.getKarakter();
    }
}
