package Papir_Kamen_Makaze;

import java.util.Random;
import java.util.Scanner;


public class KamenPapirMakaze {

    public enum MoguciIzbori {
        KAMEN(1),
        PAPIR(2),
        MAKAZE(3),
        KRAJ(4);

        private final int i;

        MoguciIzbori(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner skener = new Scanner(System.in);

        Igrac covek = new Igrac("covek");
        Igrac kompijuter = new Igrac("kompijuter");

        System.out.println("Dobrodosli u igru \"Kamen-Papir-Makaze\"");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Moguce opcije su: ");
        System.out.println("1. Kamen\n2. Papir\n3. Makaze\n4. Kraj");
        System.out.println("-----------------------------------------------------------------");

        while (nijeKrajIliTajBrejk(covek.getBrojPoena(), kompijuter.getBrojPoena())) {
            if (jeKraj(covek.getBrojPoena(), kompijuter.getBrojPoena())) {
                break;
            } else {
                System.out.print("Unesite broj izbor: ");
                String unos = skener.nextLine();
                if (unosValidan(unos)) {
                    int izborCoveka = Integer.parseInt(unos);
                    covek.setIzbor(setovanjeIzbora(izborCoveka));
                    if (MoguciIzbori.KRAJ.equals(covek.getIzbor())) {
                        break;
                    }

                    int izborKompijutera = random.nextInt(3) + 1;
                    kompijuter.setIzbor(setovanjeIzbora(izborKompijutera));

                    System.out.println("Covek je izbarao: " + covek.getIzbor());
                    System.out.println("Kompijuter je izbarao: " + kompijuter.getIzbor());

                    // Imao sam ideju da ovo ubacim u metodu, ali sta god ja stavio kao povratnu vrednost
                    // necu je nigde iskoristiti, a Vlado, ti si mi rekao da to ne radim. Ne znam kako ovo da
                    // ubacio u test case, a da ima smisla
                    if (kompijuter.getIzbor().equals(covek.getIzbor())) {
                        covek.setBrojPoena(covek.getBrojPoena() + 1);
                        kompijuter.setBrojPoena(kompijuter.getBrojPoena() + 1);
                    } else if (covek.isKamen() && kompijuter.isMakaze()) {
                        covek.setBrojPoena(covek.getBrojPoena() + 2);
                    } else if (covek.isKamen() && kompijuter.isPapir()) {
                        kompijuter.setBrojPoena(kompijuter.getBrojPoena() + 2);
                    } else if (covek.isPapir() && kompijuter.isKamen()) {
                        covek.setBrojPoena(covek.getBrojPoena() + 2);
                    } else if (covek.isPapir() && kompijuter.isMakaze()) {
                        kompijuter.setBrojPoena(kompijuter.getBrojPoena() + 2);
                    } else if (covek.isMakaze() && kompijuter.isPapir()) {
                        covek.setBrojPoena(covek.getBrojPoena() + 2);
                    } else {
                        kompijuter.setBrojPoena(kompijuter.getBrojPoena() + 2);
                    }

                    System.out.println("Trenutni broj poena: ");
                    System.out.println("Covek: " + covek.getBrojPoena());
                    System.out.println("Kompijuter: " + kompijuter.getBrojPoena());
                    System.out.println("-----------------------------------------------------------------");
                } else {
                    System.out.println("Uneli ste ne validan unos!");
                }
            }
        }


    }

    public static boolean nijeKrajIliTajBrejk(int brojPoenaCovek, int brojPoenaKompijuter) {
        if ((brojPoenaCovek >= 21 && brojPoenaKompijuter >= 21) || brojPoenaCovek < 21 || brojPoenaKompijuter < 21) {
            return true;
        }
        return false;
    }

    public static boolean jeKraj(int brojPoenaCovek, int brojPoenaKompijuter) {
        if (brojPoenaCovek >= 21 && brojPoenaCovek > brojPoenaKompijuter) {
            System.out.println("Pobednike je covek!");
            return true;
        } else if (brojPoenaKompijuter >= 21 && brojPoenaKompijuter > brojPoenaCovek) {
            System.out.println("Pobednik je kompijuter!");
            return true;
        }
        return false;
    }

    public static boolean unosValidan(String unos) {
        char[] izbor = unos.toCharArray();
        if (izbor.length == 1 && Character.isDigit(izbor[0]) && Character.getNumericValue(izbor[0]) >= 0 && Character.getNumericValue(izbor[0]) <= 4) {
            return true;
        }
        return false;
    }

    public static MoguciIzbori setovanjeIzbora(int i) {
        if (MoguciIzbori.KAMEN.getI() == i) {
            return MoguciIzbori.KAMEN;
        } else if (MoguciIzbori.PAPIR.getI() == i) {
            return MoguciIzbori.PAPIR;
        } else if (MoguciIzbori.MAKAZE.getI() == i) {
            return MoguciIzbori.MAKAZE;
        } else {
            return MoguciIzbori.KRAJ;
        }
    }
}
