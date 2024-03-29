package SkockoSlagalicaVerzija3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JumperPlayVer3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final int NUMBEROFGUESSES = 6;
    public static final int NUMBEROFSIGNS = 4;
    public static final ArrayList choices = new ArrayList(Arrays.asList("1", "2", "3", "4", "5", "6"));
    public static final int[] points = {20, 15, 15, 10, 10, 5};

    public enum PossibleChoices {
        SKOCKO(1),
        ZVEZDA(2),
        KARO(3),
        PIK(4),
        HERC(5),
        TREF(6),
        UNKNOWN(7);

        private final int id;

        PossibleChoices(int id) {
            this.id = id;
        }

        public static PossibleChoices getById(int id) {
            for (PossibleChoices p : values()) {
                if (p.id == id) {
                    return p;
                }
            }
            return SKOCKO;
        }
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
                        playersCombination[j] = PossibleChoices.getById(Integer.parseInt(input));
                        j++;
                    }
                }

                printSeparatorLine();
                System.out.print("Your combination is: ");
                printCombination(playersCombination);
                System.out.print("Computer's combination was: ");
                printCombination(computersCombination);

                if (isCombinationCorrect(playersCombination, computersCombination)) {
                    System.out.println("Congratulations, You earned " + points[i] + " points!!!");
                    System.out.print("Computer's combination was: ");
                    printCombination(computersCombination);
                    break;
                }

                int numOfRedCircles = onCorrectPosition(playersCombination, computersCombination);
                int numOfYellowCircles = wellGuessed(playersCombination, computersCombination) - numOfRedCircles;
                int missedSigns = NUMBEROFSIGNS - numOfRedCircles - numOfYellowCircles;
                for (int j = 0; j < numOfRedCircles; j++) {
                    System.out.print(ANSI_RED + "O" + ANSI_RESET + " ");
                }
                for (int j = 0; j < numOfYellowCircles; j++) {
                    System.out.print(ANSI_YELLOW + "O" + ANSI_RESET + " ");
                }
                for (int j = 0; j < missedSigns; j++) {
                    System.out.print("O ");
                }
                System.out.println();
                printSeparatorLine();
            }

            if (!isCombinationCorrect(playersCombination, computersCombination)) {
                System.out.println("Sorry, You lose!!!");
                System.out.print("Computer's combination was: ");
                printCombination(computersCombination);
            }

            System.out.print("Do You want to play again? Y (to play again) ? ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.toUpperCase().equals("Y");
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
                    playersCombination[j] = PossibleChoices.UNKNOWN;
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

    private static void printSeparatorLine() {
        System.out.println("----------------------------------------------------------");
    }

    public static void printCombination(PossibleChoices[] playerCombination) {
        for (int i = 0; i < NUMBEROFSIGNS; i++) {
            System.out.print(playerCombination[i] + (i != playerCombination.length - 1 ? ", " : "\n"));
        }
        printSeparatorLine();
    }
}
