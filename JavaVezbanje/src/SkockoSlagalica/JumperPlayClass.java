package SkockoSlagalica;

import java.util.Arrays;
import java.util.Scanner;

public class JumperPlayClass {

    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Jumper!!!");
        System.out.println("You have 6 tries to guess the right combination");
        System.out.println("Your possible choices are: \n1. SKOCKO\n2. ZVEZDA\n3. KARO\n4. PIK\n5. HERC\n6. TREF");

        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < player.getPlayersCombination().length;) {
                System.out.print("Enter your choice: ");
                String input = scanner.nextLine();
                if (isInputValid(input)) {
                    int choice = Integer.parseInt(input);
                    player.getPlayersCombination()[j] = setChoices(choice);
                    j++;
                }
                // ovde ide logika koja proverava da li smo poedili ili ne
            }
            printGuess(player.getPlayersCombination());
            if (isHumanWinner(player.getPlayersCombination(), player.getComputerChoice())) {
                player.setPoints(setPoints(i));
                System.out.println("Congratulations, You earned " + player.getPoints() + "points!!!");
                break;
            }

            break;
        }

    }

    enum PossibleChoices {
        SKOCKO(1),
        ZVEZDA(2),
        KARO(3),
        PIK(4),
        HERC(5),
        TREF(6);

        private final int id;

        PossibleChoices(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    /**
     * Helper method that checks if the game is over.
     *
     * @param humanGuess     Player's combination
     * @param computerChoice Computer's randomly generated combination
     * @return <code>true</code> if two arrays are completely same (same values are on same positions).
     * Otherwise, <code>false</code>
     */
    private static boolean isHumanWinner(PossibleChoices[] humanGuess, PossibleChoices[] computerChoice) {
        return Arrays.equals(humanGuess, computerChoice);
    }

    /**
     * Method checks if input is valid
     *
     * @param input String entered in console
     * @return <code>true</code> if input converted into char array has length of 1, which basically means that entered input is just one character,
     * that character is a digit in range between 1-6 (including both)
     */
    private static boolean isInputValid(String input) {
        char[] choice = input.toCharArray();
        return choice.length == 1 && Character.isDigit(choice[0]) && Character.getNumericValue(choice[0]) >= 1 && Character.getNumericValue(choice[0]) <= 6;
    }

    /**
     * Method that set player choices for specific try
     *
     * @param choice integer in range of 1-6 which represent sign that player has chosen
     * @return <code>enum PossibleChoices</code>
     */
    private static PossibleChoices setChoices(int choice) {
        switch (choice) {
            case 1:
                return PossibleChoices.SKOCKO;
            case 2:
                return PossibleChoices.ZVEZDA;
            case 3:
                return PossibleChoices.KARO;
            case 4:
                return PossibleChoices.PIK;
            case 5:
                return PossibleChoices.HERC;
            case 6:
                return PossibleChoices.TREF;
            default:
                return PossibleChoices.SKOCKO;
        }
    }

    /** Method prints current player's combination
     *
     * @param playerCombination - player's combination
     */
    private static void printGuess(PossibleChoices[] playerCombination) {
        System.out.println("----------------------------------------------------------");
        System.out.print("Your combination is: ");
        for (int i = 0; i < playerCombination.length; i++) {
            System.out.print(playerCombination[i] + (!(i == playerCombination.length-1) ? ", " : "\n"));
        }
        System.out.println("----------------------------------------------------------");
    }

    /**
     * Method that gives points to a player, depending of in which of six tries player guessed correct combination
     *
     * @param guessCounter current loop counter. It can be in range 1-6
     * @return number of earned points. <code>20</code> points if you guessed correct combination in first try,
     * <code>15</code> points in second/third try, <code>10</code> points in fourth/fifth try, and finaly <code>5</code>
     * points in last try.
     */
    private static int setPoints(int guessCounter) {
        switch (guessCounter) {
            case 1:
                return 20;
            case 2:
            case 3:
                return 15;
            case 4:
            case 5:
                return 10;
            case 6:
                return 5;
            default:
                return -1;
        }
    }


}
