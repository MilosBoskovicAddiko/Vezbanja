package Factoriel;

import java.util.Scanner;

public class FactorielExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some integer: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            if (number >= 0) {
                long fact = factoriel(number);
                System.out.println(number + "! = " + fact);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Your input is not valid!!!" + nfe.getMessage());
        }
    }

    public static long factoriel(int number) {
        long result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }


}
