package Lekcija_11_Kolekcije.LinkedListAndListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListWithIterator {
    public static void main(String[] args) {
        LinkedList passangerList = new LinkedList();
        passangerList.add("Alex Smith");
        passangerList.add("Mary Lou");
        passangerList.add("Sim Monk");

        ListIterator iterator = passangerList.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
