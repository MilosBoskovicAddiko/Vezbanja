package JavaRegexPatterni.ReceniceKojeSadrzeUnetuRec;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StampajReceniceKojeSadrzeUnetuRec {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Hello everybody! My name is Milos Boskovic and recently, I've started to work for one of the best banks in a region, Addiko Bank.");
        strings.add("I'm trying to become a good programmer or as good as it possible.");
        strings.add("Everybody here, colleagues, my boss Miki, menthor Vlada and the rest of crew are good and funny people and it's a pleasure to work in such enviroment like this one.");
        strings.add("And that's pretty much all I can say about them and my position right now.");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i) + (i == strings.size() - 1 ? "\n -------------------------------------------------------------" : ""));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word you want to find in the text: \n");
        String enteredWord = sc.nextLine();

        Pattern pattern = Pattern.compile(enteredWord);

        for (int i = 0; i < strings.size(); i++) {
            Matcher matcher = pattern.matcher(strings.get(i));
            if (matcher.find()) {
                System.out.print(strings.get(i) + "\n -------------------------------------------------------------\n");
            }
        }
    }
}
