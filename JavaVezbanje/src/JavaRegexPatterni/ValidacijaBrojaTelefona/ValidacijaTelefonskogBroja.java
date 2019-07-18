package JavaRegexPatterni.ValidacijaBrojaTelefona;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacijaTelefonskogBroja {
    public static void main(String[] args) {
        System.out.print("Unesite broj telefona u sledecoj formi ###/###-####: ");
        Scanner skener = new Scanner(System.in);
        String unos = skener.nextLine();

        Pattern sablon = Pattern.compile("\\d{3}\\-{1}\\d{3}\\-{1}\\d{4}");
        Matcher mecer = sablon.matcher(unos);
        System.out.println(mecer.find() ? "Uneti broj odgovara zeljenom formatu" : "Uneti broj NE odgovara zeljenom formatu");
    }
}
