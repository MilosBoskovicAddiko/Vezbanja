package SkockoSlagalicaVerzija2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JumperPlay {
    public static final int NUMBEROFGUESSES = 6;
    public static final int NUMBEROFSIGNS = 4;
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
            System.out.println("Your possible choices are: \n1. SKOCKO\n2. ZVEZDA\n3. KARO\n4. PIK\n5. HERC\n6. TREF\n");

            for (int i = 0; i < NUMBEROFGUESSES; i++) {
                for (int j = 0; j < NUMBEROFSIGNS; ) {
                    System.out.print("Enter your choice: ");
                    String input = scanner.nextLine();
                    if (isInputValid(input)) {
                        playersCombination[j] = setChoices(Integer.parseInt(input));
                        j++;
                    }
                }

                if (isCombinationCorrect(playersCombination, computersCombination)) {
                    int points = setPoints(i);
                    System.out.println("Congratulations, You earned " + points + " points!!!");
                    System.out.print("Computer's combination was: ");
                    printCombination(computersCombination);
                    break;
                }

                System.out.println("You have " + onCorrectPosition(playersCombination, computersCombination) + " signs on correct position!");
                System.out.println("You have " + wellGuessed(playersCombination, computersCombination) + " well guessed signs!");
                System.out.print("Your combination is: ");
                printCombination(playersCombination);

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
        char[] choice = input.toCharArray();
        return choice.length == 1 &&
                Character.isDigit(choice[0]) &&
                Character.getNumericValue(choice[0]) >= 1 &&
                Character.getNumericValue(choice[0]) <= 6;
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

    public static void printCombination(PossibleChoices[] playerCombination) {
        for (int i = 0; i < NUMBEROFSIGNS; i++) {
            System.out.print(playerCombination[i] + (i != playerCombination.length - 1 ? ", " : "\n"));
        }
        System.out.println("----------------------------------------------------------");
    }

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
