package BrojPonavljanjaKaraktera;

import java.util.Comparator;

public class SortiranjePoBrojuPonavljanja implements Comparator<Karakteri> {
    @Override
    public int compare(Karakteri o1, Karakteri o2) {
        return o2.getBrojPonavljanja()-o1.getBrojPonavljanja();
    }
}
