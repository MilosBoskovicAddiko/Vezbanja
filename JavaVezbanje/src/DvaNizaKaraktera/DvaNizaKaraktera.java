package DvaNizaKaraktera;

import java.util.Scanner;

public class DvaNizaKaraktera {
    public static void main(String[] args) {
        System.out.print("Unesite prvi niz karaktera: ");
        Scanner sc = new Scanner(System.in);
        String unos1 = sc.nextLine();
        System.out.print("Unesite drugi niz karaktera: ");
        String unos2 = sc.nextLine();
        String noviNiz = "";

        for(int i=0; i<unos1.length();i++){
            char trenutnoSlovo = unos1.charAt(i);
            if(Character.isSpaceChar(trenutnoSlovo) || !Character.isLetter(trenutnoSlovo)){
                continue;
            }else{
                noviNiz = noviNiz+trenutnoSlovo+",";
            }
        }

        for(int i=0; i<unos2.length(); i++){
            char trenutnaCifra = unos2.charAt(i);
            if(Character.isSpaceChar(trenutnaCifra) || !Character.isDigit(trenutnaCifra)){
                continue;
            }else{
                noviNiz = noviNiz+trenutnaCifra+",";
            }
        }
        noviNiz=noviNiz.substring(0,noviNiz.length()-1);
        System.out.println("Novonastali niz je: "+"\""+noviNiz+"\"");
    }
}
