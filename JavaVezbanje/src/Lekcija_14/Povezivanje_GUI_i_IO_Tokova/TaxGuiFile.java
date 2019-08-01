package Lekcija_14.Povezivanje_GUI_i_IO_Tokova;

import javax.swing.*;
import java.util.Vector;

public class TaxGuiFile extends JFrame {
    JLabel lblGrIncome = new JLabel("Gross Income: ");
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
}
