package Lekcija_11_Kolekcije.EnumeratorAndIterator;

import java.util.*;

public class EnumAndIter {
    public static void main(String[] args) {

        /*Enumertation examples*/

        List arrayList = new ArrayList(3);

        Double someNumber = 3.14;
        String someString = "Some text";
        Float someFloat = 5.14f;
        arrayList.add(someNumber);
        arrayList.add(someString);
        arrayList.add(someFloat);

        Enumeration enumArrayList = Collections.enumeration(arrayList);
        while(enumArrayList.hasMoreElements()){
            System.out.println(enumArrayList.nextElement());
        }

        System.out.println("---------------------------------");

        Hashtable<String, Double> hashtable = new Hashtable<>();
        hashtable.put("One",1.0);
        hashtable.put("Two",2.0);
        hashtable.put("Three",3.0);

        Enumeration enumKeys = hashtable.keys();
        while(enumKeys.hasMoreElements()){
            String currentKey = (String) enumKeys.nextElement();
            System.out.println("Current key is: "+currentKey+"\nCurrent value is: "+hashtable.get(currentKey));
        }

        System.out.println("---------------------------------");

        //Iterator example

        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            if(it.next().equals(3.14)){
                it.remove();
            }
        }
    }
}
