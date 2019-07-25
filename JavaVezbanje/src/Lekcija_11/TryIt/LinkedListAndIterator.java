package Lekcija_11.TryIt;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListAndIterator {
    public static void main(String[] args) {
        // create the LinkedList
        LinkedList customers = new LinkedList();

        // add passangers
        customers.add("Alex Smith");
        customers.add("Mary Lou");
        customers.add("Sim Monk");

        // iterate over the list
        ListIterator iterator = customers.listIterator();

        System.out.println(iterator.next());
        // add a new customer
        iterator.add("VIP Customer");

        //let's break the code on purpose, Line 24 will cause ConcurrentModificationException
        //customers.add("VIP Customer");

        //move the iterator on element one
        iterator.previous();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
