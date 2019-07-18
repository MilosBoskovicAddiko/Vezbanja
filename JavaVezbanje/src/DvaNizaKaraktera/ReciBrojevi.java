package DvaNizaKaraktera;

import java.lang.reflect.Array;
import java.util.Scanner;

//TODO - resi problem sa zarezom

public class ReciBrojevi {
    public static void main(String[] args) {
        System.out.print("Unesite prvi niz karaktera: ");
        Scanner sc = new Scanner(System.in);
        String unos1 = sc.nextLine();
        System.out.print("Unesite drugi niz karaktera: ");
        String unos2 = sc.nextLine();

        String[] noviNiz1 = unos1.replaceAll("[^a-zA-Z ]", " ").trim().split("\\s+");
        String[] noviNiz2 = unos2.replaceAll("[^0-9 ]", " ").trim().split("\\s+");

        String[] konacniNiz = new String[noviNiz1.length + noviNiz2.length];

        System.out.print("Elementi konacnog niza su: ");
        for (int i = 0; i < konacniNiz.length; i++) {
            konacniNiz[i] = i <= noviNiz1.length - 1 ? noviNiz1[i] : noviNiz2[i - noviNiz1.length];
            System.out.print(konacniNiz[i] + (i == konacniNiz.length - 1 ? "" : ", "));
        }
    }
}
