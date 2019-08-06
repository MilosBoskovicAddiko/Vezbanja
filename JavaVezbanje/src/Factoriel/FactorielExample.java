package Factoriel;

import java.util.Scanner;

public class FactorielExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.print("Enter some number: ");
            String input = scanner.nextLine();
            try {
                long number = Long.parseLong(input);
                long fact = factoriel(number);
                System.out.println("Factoriel of " + number + " is " + fact);
                flag = false;

            } catch (NumberFormatException nfe) {
                System.out.println("Your input is not valid!!!" + nfe.getMessage());
            }
        }

    }

    public static long factoriel(long number) {
        long result = 1;
        for (long i = number; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
}
