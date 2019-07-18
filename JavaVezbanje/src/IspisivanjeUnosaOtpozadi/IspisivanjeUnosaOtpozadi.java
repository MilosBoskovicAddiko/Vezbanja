package IspisivanjeUnosaOtpozadi;

import java.util.Scanner;

public class IspisivanjeUnosaOtpozadi {
    public static void main(String[] args) {
        System.out.print("Unesite neki tekst: ");
        Scanner skener = new Scanner(System.in);
        StringBuilder sbld = new StringBuilder();
        String unos = skener.nextLine();
        sbld.append(unos);
        System.out.print("Uneti tekst ispisan otpozadi glasi: "+sbld.reverse());
    }
}
