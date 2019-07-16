package MikijevZadatak;

import java.util.ArrayList;
import java.util.Scanner;

public class CitanjeSaStandardnogUlaza {
    public static void main(String[] args) {
        System.out.print("Unesite niz slova i brojeva: ");
        Scanner sc = new Scanner(System.in);
        String unos = sc.nextLine();
        while (unos.isEmpty()) {
            System.out.println("Uneli ste prazan niz!!!");
            System.out.print("Unesite niz slova i brojeva: ");
            sc = new Scanner(System.in);
            unos = sc.nextLine();
        }
        String[] izdeljenUnos = unos.split("\\s+");
        ArrayList<Double> brojevi = new ArrayList<>();
        ArrayList<Character> slova = new ArrayList<>();
        for (int i = 0; i < izdeljenUnos.length; i++) {
            String deoUnosa = izdeljenUnos[i];
            try {
                if (deoUnosa.length() >= 1) {
                    double number = Double.parseDouble(deoUnosa);
                    brojevi.add(number);
                }
            } catch (NumberFormatException e) {
                if (deoUnosa.length() == 1 && Character.isLetter(deoUnosa.charAt(0))) {
                    slova.add(deoUnosa.charAt(0));
                } else {
                    System.out.println("Uneli ste pogresan karakter: \"" + izdeljenUnos[i] + "\"");
                }
            }
        }

        slova = CitanjeSaStandardnogUlaza.sortStr(slova);
        brojevi = CitanjeSaStandardnogUlaza.sortNum(brojevi);

        System.out.print("Uneta slova su: ");
        for (int i = 0; i < slova.size(); i++) {
            System.out.print(slova.get(i) + ((i == slova.size() - 1) ? "" : ", "));
        }

        System.out.print("\nUneti brojevi su: ");
        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i) + ((i == brojevi.size() - 1) ? "" : ", "));
        }
    }

    public static ArrayList<Character> sortStr(ArrayList<Character> charList) {
        ArrayList<Character> copyList = new ArrayList<>();
        while (!charList.isEmpty()) {
            int minIndex = charList.indexOf(CitanjeSaStandardnogUlaza.min(charList));
            copyList.add(charList.get(minIndex));
            charList.remove(minIndex);
        }
        return copyList;
    }

    public static ArrayList<Double> sortNum(ArrayList<Double> doubleList) {
        ArrayList<Double> copyList = new ArrayList<>();
        while (!doubleList.isEmpty()) {
            int maxIndex = doubleList.indexOf(CitanjeSaStandardnogUlaza.max(doubleList));
            copyList.add(doubleList.get(maxIndex));
            doubleList.remove(maxIndex);
        }
        return copyList;
    }

    public static Double max(ArrayList<Double> intList) {
        Double max = intList.get(0);
        for (Double i : intList) {
            max = max > i ? max : i;
        }
        return max;
    }

    public static Character min(ArrayList<Character> charList) {
        Character min = charList.get(0);
        for (Character i : charList) {
            min = min < i ? min : i;
        }
        return min;
    }

}
