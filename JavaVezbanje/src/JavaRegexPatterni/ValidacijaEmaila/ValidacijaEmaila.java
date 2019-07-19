package JavaRegexPatterni.ValidacijaEmaila;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TODO - Pitati Vladu kako napisati regex koji ce pocinjati iskljucivo sa malim slovima ili cifrom, a u nastavku moze imati znakove poput -_.A-Z karaktere

public class ValidacijaEmaila {

    public static void main(String[] args) {
        System.out.print("Unesite E-mail: ");
        Scanner skener = new Scanner(System.in);
        String unos = skener.nextLine();

        Pattern patern = Pattern.compile("^([a-z\\d])([a-zA-Z\\d\\._-])*@([a-z\\d-]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
        Matcher matcher = patern.matcher(unos);

        System.out.println("Entered email is valid: " + matcher.matches());
    }
}
