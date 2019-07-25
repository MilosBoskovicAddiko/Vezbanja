package Lekcija_11.BitSetExample;

import java.util.BitSet;

/*Primer primene BitSet klase koja skladisti sekvencu bitova.Zavisno od boja bitova koji
 * je postavljen, klasa moze da ukazuje na sledece:
 * Bit 0: Kutija sa novcicima je prazna
 * Bit 1: Kutija sa novcicima je do pola puna
 * Bit 2: Kutija sa novcicima je puna
 * Bit 3: Coca-Cola deo u automatu je prazan*/
public class BitSetExample {
    public static void main(String[] args) {
        BitSet report = new BitSet();
        report.set(2);  //The box is empty
        report.set(4);  //There's no Coca-Cola

        BitSetExample example = new BitSetExample();
        example.phoneRinging(report);
    }

    public void phoneRinging(BitSet report) {
        int size = report.size();

        for (int i = 0; i < size; i++) {
            if (report.get(i)) {
                switch (i) {
                    case 0:
                        System.out.println("The box is empty");
                        break;
                    case 1:
                        System.out.println("The box is half-empty");
                        break;
                    case 2:
                        System.out.println("The box is full");
                        break;
                    case 3:
                        System.out.println("The box has been removed");
                        break;
                    case 4:
                        System.out.println("Coca-Cola part is empty");
                        break;
                }
            }
        }
    }
}
