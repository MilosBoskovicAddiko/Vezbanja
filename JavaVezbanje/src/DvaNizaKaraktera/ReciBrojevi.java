package DvaNizaKaraktera;

import java.util.Scanner;

public class ReciBrojevi {
    public static void main(String[] args) {
        System.out.print("Unesite prvi niz karaktera: ");
        Scanner sc = new Scanner(System.in);
        String unos1 = sc.nextLine();
        System.out.print("Unesite drugi niz karaktera: ");
        String unos2 = sc.nextLine();

        String noviNiz1[] = unos1.split("[^a-zA-Z]");
        String noviNiz2[] = unos2.split("[^0-9]");


        String konacniNiz="";


        for(int i=0; i<noviNiz1.length;i++){
            if(noviNiz1[i].equals("")){
                continue;
            }
            konacniNiz=konacniNiz+noviNiz1[i]+",";
        }

        for(int i=0; i<noviNiz2.length;i++){
            if(noviNiz2[i].equals("")){
                continue;
            }
            konacniNiz=konacniNiz+noviNiz2[i]+",";
        }

        konacniNiz=konacniNiz.substring(0,konacniNiz.length()-1);
        System.out.println("Elementi konacnog niza su: "+konacniNiz);
    }
}
