package BrojPonavljanjaKaraktera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BrojPonavljanjaKaraktera {
    public static void main(String[] args) {
        System.out.print("Unesite niz karaktera i slova: ");
        Scanner sc = new Scanner(System.in);
        String unos = sc.nextLine();
        while (unos.isEmpty()) {
            System.out.println("Uneli ste prazan niz!!!");
            System.out.print("Unesite niz slova i brojeva: ");
            sc = new Scanner(System.in);
            unos = sc.nextLine();
        }

        ArrayList<Karakteri> karakteriSlova = new ArrayList<>();

        for (int i = 0; i < unos.length(); i++) {
            if (unos.length() >= 1) {
                char trenutniKarakter = unos.charAt(i);

                if (Character.isLetter(trenutniKarakter) || Character.isDigit(trenutniKarakter)) {
                    if (karakteriSlova.isEmpty()) {
                        karakteriSlova.add(new Karakteri(trenutniKarakter, 1));
                    } else {
                        boolean sadrzi = false;
                        for (Karakteri k : karakteriSlova) {
                            if (k.getKarakter() == trenutniKarakter) {
                                k.setBrojPonavljanja(k.getBrojPonavljanja() + 1);
                                sadrzi = true;
                            }
                        }
                        if (!sadrzi) {
                            karakteriSlova.add(new Karakteri(trenutniKarakter, 1));
                        }
                    }
                }
            }
        }

        Collections.sort(karakteriSlova, new SortiranjePoAlfabetnom());

        for (int i = 0; i < karakteriSlova.size(); i++) {
            System.out.println(karakteriSlova.get(i).toString());
        }

        System.out.println("------------------------------------------------");
        Collections.sort(karakteriSlova, new SortiranjePoBrojuPonavljanja());

        for (int i = 0; i < karakteriSlova.size(); i++) {
            System.out.println(karakteriSlova.get(i).toString());
        }

    }
}
