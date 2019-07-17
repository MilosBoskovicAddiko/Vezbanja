package BrojPonavljanjaKaraktera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Scanner;

public class BrojPonavljanjaKaraktera {
    public static void main(String[] args) {
        System.out.print("Unesite niz karaktera i slova: ");
        Scanner sc = new Scanner(System.in);
        String unos = sc.nextLine();

        String sredjenUnos = unos.replaceAll("[^a-zA-Z]", "") + unos.replaceAll("[^0-9]", "");

        ArrayList<Karakteri> karakteriSlova = new ArrayList<>();

        for (int i = 0; i < sredjenUnos.length(); i++) {
            char trenutniKarakter = sredjenUnos.charAt(i);

            if (karakteriSlova.isEmpty()) {
                karakteriSlova.add(new Karakteri(trenutniKarakter));
            } else {
                boolean sadrzi = false;
                for (Karakteri k : karakteriSlova) {
                    if (k.getKarakter() == trenutniKarakter) {
                        k.setBrojPonavljanja(k.getBrojPonavljanja() + 1);
                        sadrzi = true;
                    }
                }
                if (!sadrzi) {
                    karakteriSlova.add(new Karakteri(trenutniKarakter));
                }
            }
        }

        Collections.sort(karakteriSlova, new SortiranjePoAlfabetnom());

        for (int i = 0; i < karakteriSlova.size(); i++) {
            System.out.println(karakteriSlova.get(i).toString());
        }

        System.out.println("----------------------------------------");
        Collections.sort(karakteriSlova, new SortiranjePoBrojuPonavljanja());

        for (int i = 0; i < karakteriSlova.size(); i++) {
            System.out.println(karakteriSlova.get(i).toString());
        }
    }
}
