package Factoriel;

import java.util.Scanner;

public class FactorielExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.print("Enter some integer: ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                long fact = factoriel(number);
                System.out.println(number + "! = " + fact);
                flag = false;

            } catch (NumberFormatException nfe) {
                System.out.println("Your input is not valid!!!" + nfe.getMessage());
            }
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
