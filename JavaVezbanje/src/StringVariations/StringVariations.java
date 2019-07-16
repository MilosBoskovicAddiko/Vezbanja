package StringVariations;

public class StringVariations {

    public static void main(String[] args) {
        String str1 = "miki";
        System.out.println(str1);
        String str2 = str1;
        System.out.println("str1 created using str1 = \"miki\"");
        System.out.println("str2 created like str2=str1");
        System.out.println("--------------------------------------------");

        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
        System.out.println("str1 = str2: " + str1 == str2);
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("--------------------------------------------");

        String str3 = new String("miki");
        System.out.println("str3 created using new String() method. Value = \"miki\"");
        System.out.println("str1 = str3: " + str1 == str3);
        System.out.println("str1.equals(str3): "+str1.equals(str3));
        System.out.println("--------------------------------------------");

        String ime = "Milos";
        String a,b,c;
        a=ime;
        b=ime;
        c=a;
        ime="Milos Boskovic";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(ime);
    }
}
