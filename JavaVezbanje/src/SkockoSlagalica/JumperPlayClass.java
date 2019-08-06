package SkockoSlagalica;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JumperPlayClass {

    public static final int NUMBEROFGUESSES = 6;
    public static final int NUMBEROFSIGNS = 4;

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        PossibleChoices[] playersCombination = new PossibleChoices[4];
        PossibleChoices[] computersCombination = generateComputersCombination();

        System.out.println("Welcome to the Jumper!!!");
        System.out.println("You have 6 tries to guess the right combination");
        System.out.println("Your possible choices are: \n1. SKOCKO\n2. ZVEZDA\n3. KARO\n4. PIK\n5. HERC\n6. TREF");

        for (int i = 0; i < NUMBEROFGUESSES; i++) {
            for (int j = 0; j < NUMBEROFSIGNS; ) {
                System.out.print("Enter your choice: ");
                String input = scanner.nextLine();
                if (isInputValid(input)) {
                    playersCombination[j] = setChoices(Integer.parseInt(input));
                    j++;
                }
            }
            printGuess(playersCombination);

            if (isCombinationCorrect(playersCombination, computersCombination)) {
                int points = setPoints(i);
                System.out.println("Congratulations, You earned " + points + " points!!!");
                printComputerCombination(computersCombination);
                playAgain(scanner);
                break;
            }

            System.out.println("You have " + onCorrectPosition(playersCombination, computersCombination) + " signs on correct position!");
            System.out.println("Tou have " + wellGuessed(playersCombination, computersCombination) + " well guessed signs!");
            System.out.println("----------------------------------------------------------");
        }
        if (!isCombinationCorrect(playersCombination, computersCombination)) {
            System.out.println("Sorry, You lose!!!");
            printComputerCombination(computersCombination);
            playAgain(scanner);
        }
    }

    /**
     * Method that generates computer's combination
     *
     * @return Return random generated combination
     */
    private static PossibleChoices[] generateComputersCombination() {
        PossibleChoices[] computersCombination = new PossibleChoices[4];
        Random random = new Random();
        for (int i = 0; i < computersCombination.length; i++) {
            int choice = random.nextInt(6);
            computersCombination[i] = PossibleChoices.values()[choice];
        }
        return computersCombination;
    }

    /**
     * Method starts new game if player chosen 'Y' or 'y'.
     *
     * @param scanner Scanner object that asks for input
     */
    public static void playAgain(Scanner scanner) {
        System.out.print("Do You want to play again? Y (to play again) ? ");
        String playAgain = scanner.nextLine();
        System.out.println("----------------------------------------------------------");
        switch (playAgain) {
            case "y":
            case "Y":
                play();
            default:
                break;
        }
    }

    /**
     * Method that checks how many signs player guessed well, no matter on position
     *
     * @param playersCombination Player's combination for current guess
     * @param computersCombination Computer's generated combination
     * @return Number of well guessed signs
     */
    public static int wellGuessed(PossibleChoices[] playersCombination, PossibleChoices[] computersCombination) {
        int guessedWell = 0;
        for (int i = 0; i < NUMBEROFSIGNS; i++) {
            for (int j = 0; j < NUMBEROFSIGNS; j++) {
                if (computersCombination[i] == playersCombination[j]) {
                    guessedWell++;
                    break;
                }
            }
        }
        return guessedWell;
    }

    /**
     * Method that checks how many signs are on correct positions
     *
     * @param playersCombination Player's combination for current guess
     * @param computersCombination Computer's generated combination
     * @return How many signs player guessed on correct position
     */
    public static int onCorrectPosition(PossibleChoices[] playersCombination, PossibleChoices[] computersCombination) {
        int onCorrectPosition = 0;
        for (int i = 0; i < NUMBEROFSIGNS; i++) {
            if (computersCombination[i].equals(playersCombination[i])) {
                onCorrectPosition++;
            }
        }
        return onCorrectPosition;
    }

    /**
     * Helper method that checks if the game is over.
     *
     * @param humanGuess     Player's combination
     * @param computerChoice Computer's randomly generated combination
     * @return <code>true</code> if two arrays are completely same (same values are on same positions).
     * Otherwise, <code>false</code>
     */
    public static boolean isCombinationCorrect(PossibleChoices[] humanGuess, PossibleChoices[] computerChoice) {
        return Arrays.equals(humanGuess, computerChoice);
    }

    /**
     * Method checks if input is valid
     *
     * @param input String entered in console
     * @return <code>true</code> if input converted into char array has length of 1, which basically means that entered input is just one character,
     * that character is a digit in range between 1-6 (including both)
     */
    public static boolean isInputValid(String input) {
        char[] choice = input.toCharArray();
        return choice.length == 1 &&
                Character.isDigit(choice[0]) &&
                Character.getNumericValue(choice[0]) >= 1 &&
                Character.getNumericValue(choice[0]) <= 6;
    }

    /**
     * Method that set player choices for specific try
     *
     * @param choice Integer in range of 1-6 which represent sign that player has chosen
     * @return <code>enum PossibleChoices</code>
     */
    public static PossibleChoices setChoices(int choice) {
        switch (choice) {
            case 1:
            default:
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
        }
    }

    /**
     * Method prints current player's combination
     *
     * @param playerCombination - player's combination
     */
    public static void printGuess(PossibleChoices[] playerCombination) {
        System.out.println("----------------------------------------------------------");
        System.out.print("Your combination is: ");
        for (int i = 0; i < NUMBEROFSIGNS; i++) {
            System.out.print(playerCombination[i] + (i != playerCombination.length - 1 ? ", " : "\n"));
        }
        System.out.println("----------------------------------------------------------");
    }

    /**
     * Method prints current computer's combination
     *
     * @param computerCombination - Computer's combination
     */
    public static void printComputerCombination(PossibleChoices[] computerCombination) {
        System.out.println("----------------------------------------------------------");
        System.out.print("Computer's combination was: ");
        for (int i = 0; i < NUMBEROFSIGNS; i++) {
            System.out.print(computerCombination[i] + (i != computerCombination.length - 1 ? ", " : "\n"));
        }
        System.out.println("----------------------------------------------------------");
    }

    /**
     * Method that gives points to a player, depending of in which of six tries player guessed correct combination
     *
     * @param guessCounter Current loop counter. It can be in range 1-6
     * @return Number of earned points. <code>20</code> points if you guessed correct combination in first try,
     * <code>15</code> points in second/third try, <code>10</code> points in fourth/fifth try, and finaly <code>5</code>
     * points in last try.
     */
    public static int setPoints(int guessCounter) {
        switch (guessCounter) {
            case 0:
                return 20;
            case 1:
            case 2:
                return 15;
            case 3:
            case 4:
                return 10;
            case 5:
                return 5;
            default:
                return -1;
        }
    }
}
