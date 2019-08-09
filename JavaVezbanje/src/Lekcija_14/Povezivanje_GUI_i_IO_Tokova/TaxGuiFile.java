package Lekcija_14.Povezivanje_GUI_i_IO_Tokova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class TaxGuiFile extends JFrame {
    JLabel lblGrIncome;
    JTextField txtGrossIncome = new JTextField(15);

    JLabel lblDependents = new JLabel("Number of Dependents: ");
    JTextField txtDependents = new JTextField(2);

    JLabel lblState = new JLabel("State: ");

    // Definisanje modela podataka za ComboBox chState element
    Vector<String> states = new Vector<>(50);

    // Kreiranje kombinovanog polja za preuzimanje podataka iz modela
    JComboBox chState = new JComboBox(states);

    JLabel lblTax = new JLabel("State tax: ");
    JTextField txtStateTax = new JTextField(10);
    JButton bGo = new JButton("Go");
    JButton bReset = new JButton("Reset");

    TaxGuiFile() {
        lblGrIncome = new JLabel("Gross Income: ");
        GridLayout gr = new GridLayout(5, 2, 1, 1);
        setLayout(gr);

        add(lblGrIncome);
        add(txtGrossIncome);
        add(lblDependents);
        add(txtDependents);
        add(lblState);
        add(chState);
        add(lblTax);
        add(txtStateTax);
        add(bGo);
        add(bReset);

        // Ocitavanje stanja iz datoteke
        populateStates();

        chState.setSelectedIndex(0);
        txtStateTax.setEditable(false);

        // Obrada koja se odnosi na taster Go, definisana pomocu lambda izraza

        bGo.addActionListener(evt -> {
            try {
                int grossInc = Integer.parseInt(txtGrossIncome.getText());
                int dependents = Integer.parseInt(txtDependents.getText());
                String state = (String) chState.getSelectedItem();

                Tax tax = new Tax(grossInc, state, dependents);
                String sTax = Double.toString(tax.calcTax());
                txtStateTax.setText(sTax);
            } catch (NumberFormatException nfe) {
                txtStateTax.setText("Non-Numeric Data");
            } catch (Exception e) {
                txtStateTax.setText(e.getMessage());
            }
        });

        //Obrada koja se odnosi na taster Reset, definisana pomocu labda izraza
        bReset.addActionListener(evt -> {
            txtGrossIncome.setText("");
            txtDependents.setText("");
            chState.setSelectedIndex(0);
            txtStateTax.setText("");
        });

        //Definisanje, instanciranje i registracija WindowAdapter klase
        // za obradu windowClosing dogadjaja aktivnog okvira
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // Naredni kod ocitabva datoteku states.txt.txt i popunjava chStates padajuci meni
    private void populateStates() {
        states.add("Select State");
        try (FileInputStream fis = new FileInputStream("states.txt");
             InputStreamReader isr = new InputStreamReader(fis, "UTF8");
             BufferedReader br = new BufferedReader(isr);) {

            String stateName;
            while ((stateName = br.readLine()) != null) {
                states.add(stateName);
            }
        } catch (IOException ioe) {
            txtStateTax.setText("Can't read states.txt.txt: " + ioe.getMessage());
        }
    }


    public static void main(String[] args) {
        TaxGuiFile taxFrame = new TaxGuiFile();
        taxFrame.setLocationRelativeTo(null);
        taxFrame.setSize(400, 150);
        taxFrame.setVisible(true);
    }
}
