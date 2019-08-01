package PapirKamenMakaze;

import java.util.Random;
import java.util.Scanner;

public class KamenPapirMakaze {

    public static void main(String[] args) {
        int pointsHuman = 0;
        int pointsComputer = 0;
        String player = "";
        String computer = "";
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dobrodosli u igru \"Kamen-Papir-Makaze\"");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Moguce opcije su: ");
        System.out.println("1. Kamen\n2. Papir\n3. Makaze");
        System.out.println("Igru u svakom trenutku mozete prekinuti unoseci rec \"kraj\"");
        System.out.println("-----------------------------------------------------------------");
        while ((pointsHuman < 21 || pointsComputer < 21) || (pointsHuman >= 21 && pointsComputer >= 21 && pointsComputer == pointsHuman)) {
            System.out.println("Unesite zeljenu rec: ");
            player = scanner.nextLine();
            if (player.equalsIgnoreCase("kraj")) {
                System.out.println("Igra je zavrsena!!!");
                System.exit(0);
            }
            while (!player.equalsIgnoreCase("papir") && !player.equalsIgnoreCase("kamen") && !player.equalsIgnoreCase("makaze")) {
                System.out.println("Unesite zeljenu rec: ");
                player = scanner.nextLine();
                if (player.equalsIgnoreCase("kraj")) {
                    System.out.println("Igra je zavrsena!!!");
                    System.exit(0);
                }
            }
            int compChoice = rand.nextInt(3);
            switch (compChoice) {
                case 0:
                    computer = "kamen";
                    break;
                case 1:
                    computer = "papir";
                    break;
                case 2:
                    computer = "makaze";
                    break;
            }

            System.out.println("Racunar je izabrao: " + computer);

            if (player.equals(computer)) {
                pointsHuman++;
                pointsComputer++;
            } else if (player.equalsIgnoreCase("kamen") && computer.equalsIgnoreCase("makaze")) {
                pointsHuman = pointsHuman + 2;
            } else if (player.equalsIgnoreCase("kamen") && computer.equalsIgnoreCase("papir")) {
                pointsComputer = pointsComputer + 2;
            } else if (player.equalsIgnoreCase("papir") && computer.equalsIgnoreCase("kamen")) {
                pointsHuman = pointsHuman + 2;
            } else if (player.equalsIgnoreCase("papir") && computer.equalsIgnoreCase("makaze")) {
                pointsComputer = pointsComputer + 2;
            } else if (player.equalsIgnoreCase("makaze") && computer.equalsIgnoreCase("kamen")) {
                pointsComputer = pointsComputer + 2;
            } else {
                pointsHuman = pointsHuman + 2;
            }

            isWinnerValid(pointsHuman,pointsComputer);
        }
    }

    public static boolean isParametersEnteredCorrectly(String playerChoice, int computerChoice) {
        int pointsHuman = 0;
        int pointsComputer = 0;
        String player = playerChoice;
        String computer = "";
        System.out.println("Dobrodosli u igru \"Kamen-Papir-Makaze\"");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Moguce opcije su: ");
        System.out.println("1. Kamen\n2. Papir\n3. Makaze");
        System.out.println("Igru u svakom trenutku mozete prekinuti unoseci rec \"kraj\"");
        System.out.println("-----------------------------------------------------------------");
        while ((pointsHuman < 21 || pointsComputer < 21) || (pointsHuman >= 21 && pointsComputer >= 21 && pointsComputer == pointsHuman)) {
            if (player.equalsIgnoreCase("kraj")) {
                System.out.println("Igra je zavrsena!!!");
                System.exit(0);
                return true;
            }
            while (!player.equalsIgnoreCase("papir") && !player.equalsIgnoreCase("kamen") && !player.equalsIgnoreCase("makaze")) {
                if (player.equalsIgnoreCase("kraj")) {
                    System.out.println("Igra je zavrsena!!!");
                    System.exit(0);
                    return true;
                }
                return false;
            }
            int compChoice = computerChoice;
            switch (compChoice) {
                case 0:
                    computer = "kamen";
                    break;
                case 1:
                    computer = "papir";
                    break;
                case 2:
                    computer = "makaze";
                    break;
            }

            if (player.equals(computer)) {
                pointsHuman++;
                pointsComputer++;
                System.out.println("Covek bira: " + player);
                System.out.println("Masina bira: " + computer);
                System.out.println("Trenutni broj poena: ");
                System.out.println("Covek: " + pointsHuman);
                System.out.println("Masina: " + pointsComputer);
                return false;
            } else if (player.equalsIgnoreCase("kamen") && computer.equalsIgnoreCase("makaze")) {
                pointsHuman = pointsHuman + 2;
                System.out.println("Covek bira: " + player);
                System.out.println("Masina bira: " + computer);
                System.out.println("Trenutni broj poena: ");
                System.out.println("Covek: " + pointsHuman);
                System.out.println("Masina: " + pointsComputer);
                return true;
            } else if (player.equalsIgnoreCase("kamen") && computer.equalsIgnoreCase("papir")) {
                pointsComputer = pointsComputer + 2;
                System.out.println("Covek bira: " + player);
                System.out.println("Masina bira: " + computer);
                System.out.println("Trenutni broj poena: ");
                System.out.println("Covek: " + pointsHuman);
                System.out.println("Masina: " + pointsComputer);
                return false;
            } else if (player.equalsIgnoreCase("papir") && computer.equalsIgnoreCase("kamen")) {
                pointsHuman = pointsHuman + 2;
                System.out.println("Covek bira: " + player);
                System.out.println("Masina bira: " + computer);
                System.out.println("Trenutni broj poena: ");
                System.out.println("Covek: " + pointsHuman);
                System.out.println("Masina: " + pointsComputer);
                return true;
            } else if (player.equalsIgnoreCase("papir") && computer.equalsIgnoreCase("makaze")) {
                pointsComputer = pointsComputer + 2;
                System.out.println("Covek bira: " + player);
                System.out.println("Masina bira: " + computer);
                System.out.println("Trenutni broj poena: ");
                System.out.println("Covek: " + pointsHuman);
                System.out.println("Masina: " + pointsComputer);
                return false;
            } else if (player.equalsIgnoreCase("makaze") && computer.equalsIgnoreCase("kamen")) {
                pointsComputer = pointsComputer + 2;
                System.out.println("Covek bira: " + player);
                System.out.println("Masina bira: " + computer);
                System.out.println("Trenutni broj poena: ");
                System.out.println("Covek: " + pointsHuman);
                System.out.println("Masina: " + pointsComputer);
                return false;
            } else {
                pointsHuman = pointsHuman + 2;
                System.out.println("Covek bira: " + player);
                System.out.println("Masina bira: " + computer);
                System.out.println("Trenutni broj poena: ");
                System.out.println("Covek: " + pointsHuman);
                System.out.println("Masina: " + pointsComputer);
                return true;
            }
        }
        return false;
    }

    public static boolean isWinnerValid(int pointsHuman, int pointsComputer) {
        System.out.println("Trenutni broj poena: ");
        System.out.println("Covek: " + pointsHuman);
        System.out.println("Masina: " + pointsComputer);
        System.out.println("-----------------------------------------------------------------");
        if (pointsComputer != pointsHuman && (pointsHuman >= 21 || pointsComputer >= 21)) {
            if (pointsComputer > pointsHuman) {
                System.out.println("Pobednik je kompijuter.");
                return false;
            } else {
                System.out.println("Cestitamo, vi ste pobedili.");
                return true;
            }
        }
        return false;
    }
}
