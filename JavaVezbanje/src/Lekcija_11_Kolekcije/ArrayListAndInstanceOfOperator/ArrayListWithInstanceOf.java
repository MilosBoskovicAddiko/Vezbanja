package Lekcija_11_Kolekcije.ArrayListAndInstanceOfOperator;

import java.util.ArrayList;
import java.util.List;

/* Operator instance of je jako spor i treba ga izbegavati. Razmisliti o resenju primenom polimorfizma.
U Lekciji 12 bice reci kako daprimenjujemo genericke mehanizme, koji omogucavaju da izbegnemo  koriscenje
instance of operatora, kao i da u toku prevodjenja kontrolisemo koji objekti se mogu dodati u kolekciju

U odeljku "Programiranje interfejsa" opisano je sta treba promeniti u deklaraciji promenjljive arrayList
*/
public class ArrayListWithInstanceOf {
    public static void main(String[] args) {
        List arrayList = new ArrayList(3);

        Double someNumber = 3.14;
        String someString = "Some text";
        Float someFloat = 5.14f;
        arrayList.add(someNumber);
        arrayList.add(someString);
        arrayList.add(someFloat);

        int totalElem = arrayList.size();

        for (int i = 0; i < totalElem; i++) {
            Object currentElement = arrayList.get(i);
            if (currentElement instanceof Double) {
                Double currentDouble = (Double) arrayList.get(i);
                System.out.println("Current double: " + currentDouble);
            } else if (currentElement instanceof String) {
                String currentString = (String) arrayList.get(i);
                System.out.println("Current string: " + currentString);
            } else if (currentElement instanceof Float) {
                Float currentFloat = (Float) arrayList.get(i);
                System.out.println("Current float: " + currentFloat);
            }
        }


    }
}
