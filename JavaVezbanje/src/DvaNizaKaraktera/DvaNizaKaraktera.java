package DvaNizaKaraktera;

import java.util.Scanner;

//TODO - resi problem sa zarezom

public class DvaNizaKaraktera {
    public static void main(String[] args) {
        System.out.print("Unesite prvi niz karaktera: ");
        Scanner sc = new Scanner(System.in);
        String unos1 = sc.nextLine();
        System.out.print("Unesite drugi niz karaktera: ");
        String unos2 = sc.nextLine();

        String[] slova = unos1.replaceAll("[^a-zA-Z]", "").split("(?!^)");
        String[] cifre = unos2.replaceAll("[^0-9]", "").split("(?!^)");
        String[] konacniNiz = new String[slova.length + cifre.length];

        System.out.print("Elementi niza su: ");
        for (int i = 0; i < konacniNiz.length; i++) {
            konacniNiz[i] = i < slova.length ? slova[i] : cifre[i - slova.length];
            System.out.print(konacniNiz[i] + ((i == konacniNiz.length - 1) ? "" : ", "));
        }
    }
}
