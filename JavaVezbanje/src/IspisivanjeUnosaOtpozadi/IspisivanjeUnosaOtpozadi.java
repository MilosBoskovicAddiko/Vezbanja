package IspisivanjeUnosaOtpozadi;

import java.util.Scanner;

public class IspisivanjeUnosaOtpozadi {
    public static void main(String[] args) {
        System.out.print("Unesite neki tekst: ");
        Scanner skener = new Scanner(System.in);
        String unos = skener.nextLine();
        String obrnutiUnos="";
        for(int i = unos.length()-1; i >= 0; i--){
            obrnutiUnos+=unos.charAt(i);
        }
        System.out.print("Uneti tekst ispisan otpozadi glasi: "+obrnutiUnos);
    }
}
