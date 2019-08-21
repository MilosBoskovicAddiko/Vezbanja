package Lekcija_23_Anotacije_Refleksija.SuppressWarningDemo;

import java.util.Random;

public class SuppressWarningDemo {

    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        Random r = new Random();
        int salaryBonus = r.nextInt(4) + 1;
        int bonus;
        // Ocitavanje granicne vrednosti za platu osobe iz nekog izvora podatka

        switch (salaryBonus) {
            case 1:
                bonus = 1000;
                System.out.println("Giving bonus " + bonus);
                break;
            case 2:
                bonus = 2000;
                System.out.println("Giving bonus " + bonus);
                break;
            case 3:
                bonus = 6000;
                System.out.println("Giving bonus " + bonus);
            case 4:
                bonus = 10000;
                System.out.println("Giving bonus " + bonus);
                break;
            default:
                // pogresan platni razred
                System.out.println("Invalid salary band!");
        }
    }
}
