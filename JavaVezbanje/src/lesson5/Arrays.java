package lesson5;

public class Arrays {
    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18] = "Hillary";
        friends[19] = "Natasha";


        int i = 0;
        do {
            System.out.println("Reading the element" + i + " of array friends");
            if (friends[i] == null) {
                i++;
                continue;
            }
            System.out.println("I love " + friends[i]);
            i++;
        } while (i <friends.length);




    }
}
