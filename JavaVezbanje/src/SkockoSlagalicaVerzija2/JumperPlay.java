package SkockoSlagalicaVerzija2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JumperPlay {
    public static final int NUMBEROFGUESSES = 6;
    public static final int NUMBEROFSIGNS = 4;
    public static final ArrayList choices = new ArrayList(Arrays.asList("1", "2", "3", "4", "5", "6"));
    public static final int[] points = {20, 15, 15, 10, 10, 5};

    public enum PossibleChoices {
        SKOCKO,
        ZVEZDA,
        KARO,
        PIK,
        HERC,
        TREF
    }

    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            Scanner scanner = new Scanner(System.in);
            PossibleChoices[] playersCombination = new PossibleChoices[4];
            PossibleChoices[] computersCombination = generateComputersCombination();

            System.out.println("Welcome to the Jumper!!!");
            System.out.println("You have 6 tries to guess the right combination");
            System.out.println("Your possible choices are: \n1. SKOCKO\n2. ZVEZDA\n3. KARO\n4. PIK\n5. HERC\n6. TREF");
            printSeparatorLine();

            for (int i = 0; i < NUMBEROFGUESSES; i++) {
                for (int j = 0; j < NUMBEROFSIGNS; ) {
                    System.out.print("Enter your choice: ");
                    String input = scanner.nextLine();
                    if (isInputValid(input)) {
                        playersCombination[j] = setChoices(Integer.parseInt(input));
                        j++;
                    }
                }

                printSeparatorLine();
                System.out.print("Your combination is: ");
                printCombination(playersCombination);

                if (isCombinationCorrect(playersCombination, computersCombination)) {
                    int points = setPoints(i);
                    System.out.println("Congratulations, You earned " + points + " points!!!");
                    System.out.print("Computer's combination was: ");
                    printCombination(computersCombination);
                    break;
                }

                int onCorrectPosition = onCorrectPosition(playersCombination, computersCombination);
                int onIncorrectPosition = wellGuessed(playersCombination, computersCombination) - onCorrectPosition;
                System.out.println("You have " + onCorrectPosition + " signs on correct position!");
                System.out.println("You have " + onIncorrectPosition + " signs on incorrect position!");
                printSeparatorLine();
            }

            if (!isCombinationCorrect(playersCombination, computersCombination)) {
                System.out.println("Sorry, You lose!!!");
                System.out.print("Computer's combination was: ");
                printCombination(computersCombination);
            }

            System.out.print("Do You want to play again? Y (to play again) ? ");
            String playAgainInput = scanner.nextLine();
            switch (playAgainInput) {
                case "y":
                case "Y":
                    break;
                default:
                    playAgain = false;
                    break;
            }
        }
    }

    private static PossibleChoices[] generateComputersCombination() {
        PossibleChoices[] computersCombination = new PossibleChoices[4];
        Random random = new Random();
        for (int i = 0; i < computersCombination.length; i++) {
            int choice = random.nextInt(6);
            computersCombination[i] = PossibleChoices.values()[choice];
        }
        return computersCombination;
    }

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

    public static int onCorrectPosition(PossibleChoices[] playersCombination, PossibleChoices[] computersCombination) {
        int onCorrectPosition = 0;
        for (int i = 0; i < NUMBEROFSIGNS; i++) {
            if (computersCombination[i].equals(playersCombination[i])) {
                onCorrectPosition++;
            }
        }
        return onCorrectPosition;
    }

    public static boolean isCombinationCorrect(PossibleChoices[] humanGuess, PossibleChoices[] computerChoice) {
        return Arrays.equals(humanGuess, computerChoice);
    }

    public static boolean isInputValid(String input) {
        return choices.contains(input);
    }

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

    private static void printSeparatorLine() {
        System.out.println("----------------------------------------------------------");
    }

    public static void printCombination(PossibleChoices[] playerCombination) {
        for (int i = 0; i < NUMBEROFSIGNS; i++) {
            System.out.print(playerCombination[i] + (i != playerCombination.length - 1 ? ", " : "\n"));
        }
        printSeparatorLine();
    }

    public static int setPoints(int guessCounter) {
        return points[guessCounter];
    }
}
