package Factoriel;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class FactorielExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some integer: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            long fact = factoriel(number);
            System.out.println(number + "! = " + fact);

        } catch (NumberFormatException nfe) {
            System.out.println("Your input is not valid!!!" + nfe.getMessage());
        }
    }

    public static long factoriel(int number) {
        long result = 1;
        if (number < 0){
            for (int i = -number; i >= 1; i--) {
                result = result * i;
            }
            return -result;
        }
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }

    @Test
    public void Test(){
        assertEquals(-120l,factoriel(-5));
        assertEquals(-1l,factoriel(-1));
        assertEquals(1l,factoriel(0));
        assertEquals(1l,factoriel(1));
        assertEquals(7034535277573963776l, factoriel(25));
    }
}
