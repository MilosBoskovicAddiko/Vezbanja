package Lekcija_11_Kolekcije.TryIt;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListAndIterator {
    public static void main(String[] args) {
        // kreianje linked liste
        LinkedList customers = new LinkedList();

        // dodavanje potrosaca
        customers.add("Alex Smith");
        customers.add("Mary Lou");
        customers.add("Sim Monk");

        // iteriranje po listi
        ListIterator iterator = customers.listIterator();

        System.out.println(iterator.next());
        // dodavanje novog potrosaca tokom iteriranja
        iterator.add("VIP Customer");

        //pokvariti kod namerno, linija 24 ce prouzrokovati ConcurrentModificationException
        //customers.add("VIP Customer");

        //pomeriti iterator na prvi element
        iterator.previous();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
