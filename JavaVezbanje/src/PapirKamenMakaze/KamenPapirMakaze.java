package PapirKamenMakaze;

import java.util.Random;
import java.util.Scanner;

public class KamenPapirMakaze {

    public static void main(String[] args) {
        int poeniCovek = 0;
        int poeniMasina = 0;
        String covek = "";
        String masina = "";

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dobrodosli u igru \"Kamen-Papir-Makaze\"");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Moguce opcije su: ");
        System.out.println("1. Kamen\n2. Papir\n3. Makaze");
        System.out.println("Igru u svakom trenutku mozete prekinuti unoseci rec \"kraj\"");
        System.out.println("-----------------------------------------------------------------");

        while (poeniCovek < 21 || poeniMasina < 21 || (poeniCovek >= 21 && poeniMasina >= 21)) {
            if (poeniMasina >= 21 && poeniMasina > poeniCovek) {
                System.out.println("Pobednik je kompijuter!");
                break;
            } else if (poeniCovek >= 21 && poeniCovek > poeniMasina) {
                System.out.println("Pobednik je covek!");
                break;
            } else {
                System.out.print("Unesite zeljenu rec: ");
                covek = scanner.nextLine();

                if (covek.equalsIgnoreCase("kraj")) {
                    break;
                }
                else if (covek.equalsIgnoreCase("kamen") || covek.equalsIgnoreCase("papir") || covek.equalsIgnoreCase("makaze")) {
                    int compChoice = rand.nextInt(3);
                    switch (compChoice) {
                        case 0:
                            masina = "kamen";
                            break;
                        case 1:
                            masina = "papir";
                            break;
                        case 2:
                            masina = "makaze";
                            break;
                    }

                    System.out.println("Racunar je izabrao: " + masina);

                    if (covek.equalsIgnoreCase(masina)) {
                        poeniCovek++;
                        poeniMasina++;
                    } else if (covek.equalsIgnoreCase("kamen") && masina.equalsIgnoreCase("makaze")) {
                        poeniCovek = poeniCovek + 2;
                    } else if (covek.equalsIgnoreCase("kamen") && masina.equalsIgnoreCase("papir")) {
                        poeniMasina = poeniMasina + 2;
                    } else if (covek.equalsIgnoreCase("papir") && masina.equalsIgnoreCase("kamen")) {
                        poeniCovek = poeniCovek + 2;
                    } else if (covek.equalsIgnoreCase("papir") && masina.equalsIgnoreCase("makaze")) {
                        poeniMasina = poeniMasina + 2;
                    } else if (covek.equalsIgnoreCase("makaze") && masina.equalsIgnoreCase("kamen")) {
                        poeniMasina = poeniMasina + 2;
                    } else {
                        poeniCovek = poeniCovek + 2;
                    }

                    System.out.println("Trenutni broj poena: ");
                    System.out.println("Covek: " + poeniCovek);
                    System.out.println("Masina: " + poeniMasina);
                    System.out.println("-----------------------------------------------------------------");
                }
            }
        }
    }
}
