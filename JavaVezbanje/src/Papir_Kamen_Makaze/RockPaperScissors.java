package Papir_Kamen_Makaze;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

    public enum PossibleChoices {
        ROCK(1),
        PAPER(2),
        SCISSORS(3),
        EXIT(4);

        private final int id;

        PossibleChoices(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public boolean isRock() {
            if (this.equals(ROCK)) {
                return true;
            }
            return false;
        }

        public boolean isPaper() {
            if (this.equals(PAPER)) {
                return true;
            }
            return false;
        }

        public boolean isScissors() {
            if (this.equals(SCISSORS)) {
                return true;
            }
            return false;
        }

        public boolean isExit() {
            if (this.equals(EXIT)) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Player human = new Player();
        Player computer = new Player();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Welcome to \"Rock-Paper-Scissors\"");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Possible options are: ");
        System.out.println("1. Rock\n2. Paper\n3. Scissors\n4. Exit");
        System.out.println("-----------------------------------------------------------------");

        while (notAnEndOrTieBreak(human.getNumOfPoints(), computer.getNumOfPoints())) {
            System.out.print("Enter Your choice: ");
            String input = scanner.nextLine();
            if (isInputValid(input)) {
                int humansChoice = Integer.parseInt(input);
                human.setChoice(setChoice(humansChoice));
                if (PossibleChoices.EXIT.equals(human.getChoice())) {
                    System.out.println("GAME OVER!!!");
                    System.out.println("-----------------------------------------------------------------");
                    break;
                }

                int computersChoice = random.nextInt(3) + 1;
                computer.setChoice(setChoice(computersChoice));

                System.out.println("Human has choosen: " + human.getChoice());
                System.out.println("Computer has choosen: " + computer.getChoice());

                gettingPoints(human, computer);

                System.out.println("Number of points: ");
                System.out.println("Human: " + human.getNumOfPoints());
                System.out.println("Computer: " + computer.getNumOfPoints());
                System.out.println("-----------------------------------------------------------------");
            } else {
                System.out.println("You've entered invalid input!");
            }
            if (isEnd(human.getNumOfPoints(), computer.getNumOfPoints())) {
                System.out.println("GAME OVER!!!");
                System.out.println("-----------------------------------------------------------------");
                break;
            }
        }
    }

    private static void gettingPoints(Player human, Player computer) {
        switch (computer.getChoice()) {
            case ROCK:
                humansChoices(human, computer);
                break;
            case PAPER:
                humansChoices(human, computer);
                break;
            case SCISSORS:
                humansChoices(human, computer);
                break;
        }
    }

    private static void humansChoices(Player human, Player computer) {
        switch (human.getChoice()) {
            case PAPER:
                if (computer.getChoice().isRock()) {
                    human.setNumOfPoints(human.getNumOfPoints() + 2);
                } else if (computer.getChoice().isScissors()) {
                    computer.setNumOfPoints(computer.getNumOfPoints() + 2);
                } else {
                    human.setNumOfPoints(human.getNumOfPoints() + 1);
                    computer.setNumOfPoints(computer.getNumOfPoints() + 1);
                }
            break;
            case SCISSORS:
                if (computer.getChoice().isRock()) {
                    computer.setNumOfPoints(computer.getNumOfPoints() + 2);
                } else if (computer.getChoice().isPaper()) {
                    human.setNumOfPoints(human.getNumOfPoints() + 2);
                } else {
                    human.setNumOfPoints(human.getNumOfPoints() + 1);
                    computer.setNumOfPoints(computer.getNumOfPoints() + 1);
                }
                break;
            case ROCK:
                if (computer.getChoice().isPaper()) {
                    computer.setNumOfPoints(computer.getNumOfPoints() + 2);
                } else if (computer.getChoice().isScissors()) {
                    human.setNumOfPoints(human.getNumOfPoints() + 2);
                } else {
                    human.setNumOfPoints(human.getNumOfPoints() + 1);
                    computer.setNumOfPoints(computer.getNumOfPoints() + 1);
                }
        }
    }

    public static boolean notAnEndOrTieBreak(int humansPoints, int computersPoints) {
        if ((humansPoints >= 21 && computersPoints >= 21 && humansPoints == computersPoints) || humansPoints < 21 || computersPoints < 21) {
            return true;
        }
        return false;
    }

    public static boolean isEnd(int humansPoints, int computersPoints) {
        if (humansPoints >= 21 && humansPoints > computersPoints) {
            System.out.println("Human is the winner!");
            return true;
        } else if (computersPoints >= 21 && computersPoints > humansPoints) {
            System.out.println("Computer is the winner!");
            return true;
        }
        return false;
    }

    public static boolean isInputValid(String input) {
        char[] choice = input.toCharArray();
        if (choice.length == 1 && Character.isDigit(choice[0]) && Character.getNumericValue(choice[0]) >= 0 && Character.getNumericValue(choice[0]) <= 4) {
            return true;
        }
        return false;
    }

    public static PossibleChoices setChoice(int i) {
        switch (i) {
            case 1:
                return PossibleChoices.ROCK;
            case 2:
                return PossibleChoices.PAPER;
            case 3:
                return PossibleChoices.SCISSORS;
            case 4:
                return PossibleChoices.EXIT;
            default:
                return PossibleChoices.EXIT;
        }
    }
}
