package Lekcija_13_Lambda_Izrazi;

import java.util.ArrayList;
import java.util.List;

public class ImperativeVsFunctional {

    public static void main(String[] args) {

        List<String> winners = new ArrayList<>();
        winners.add("Mary");
        winners.add("Ringo");
        winners.add("Joe");
        winners.add("Paul");

        // Imperativni stil
        boolean gotRingo = false;
        for (String winner : winners) {
            if ("Ringo".equals(winner)) {
                gotRingo = true;
                System.out.println("Imperativni stil. Ringo je pobednik? " + gotRingo);
                break;
            }
        }

        // Funkcionalni stil
        System.out.println("Funkcionalni stil. Ringo je pobednik? " + winners.contains("Ringo"));
    }
}
