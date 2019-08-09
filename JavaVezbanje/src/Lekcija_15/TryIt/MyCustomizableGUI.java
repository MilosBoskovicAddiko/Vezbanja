package Lekcija_15.TryIt;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MyCustomizableGUI extends JPanel {
    private JLabel colorLabel = new JLabel("Color:");
    private JLabel fontLabel = new JLabel("Font:");
    private JLabel fontSizelabel = new JLabel("Font size:");

    private JButton cancelButton = new JButton("Cancel");
    private JButton saveButton = new JButton("Save");
    private JButton preferencesButton = new JButton("Preferences");

    private JTextField textField = new JTextField(20);

    private String[] colorList = {"Red", "Green", "Blue", "Cyan", "Magenta","Yelow", "Black"};
    private String[] fontList = {"Arial", "Times New Roman", "Helvetica"};
    private String[] fontSizeList = {"12", "18", "25", "40", "64"};

    private JComboBox color = new JComboBox(colorList);
    private JComboBox font = new JComboBox(fontList);
    private JComboBox fontSize = new JComboBox(fontSizeList);

    private JDialog prefDialog;
    private JFrame frame;

    public MyCustomizableGUI() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(textField);
        this.add(preferencesButton);

        preferencesButton.addActionListener(evt -> {
            prefDialog.setVisible(true);
        });

        frame = new JFrame("My Text Editor");
        frame.setContentPane(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(300,130);

        // Preferences dialog box
        prefDialog = new JDialog(frame,"Dialog",true);
        prefDialog.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,2));
        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));

        saveButton.addActionListener(evtSave->{
            String fontChosen;
            int fontSizeChosen;

            prefDialog.setVisible(false);

            if ((String) color.getSelectedItem() == "Red") {
                textField.setForeground(Color.red);
            } else if ((String) color.getSelectedItem() == "Green") {
                textField.setForeground(Color.green);
            } else if ((String) color.getSelectedItem() == "Blue") {
                textField.setForeground(Color.blue);
            } else if ((String) color.getSelectedItem() == "Cyan") {
                textField.setForeground(Color.cyan);
            } else if ((String) color.getSelectedItem() == "Magenta") {
                textField.setForeground(Color.magenta);
            } else if ((String) color.getSelectedItem() == "Yellow") {
                textField.setForeground(Color.yellow);
            } else if ((String) color.getSelectedItem() == "Black") {
                textField.setForeground(Color.black);
            }

            fontChosen = (String) font.getSelectedItem();
            fontSizeChosen = Integer.parseInt((String) fontSize.getSelectedItem());
            textField.setFont(new Font(fontChosen, Font.PLAIN, fontSizeChosen));

            UserPreferences userPreferences = new UserPreferences();
            userPreferences.setColor((String) color.getSelectedItem());
            userPreferences.setFont(fontChosen);
            userPreferences.setFontSize(fontSizeChosen);

            try (FileOutputStream fOut = new FileOutputStream("preferences.ser");
                 ObjectOutputStream oOut = new ObjectOutputStream(fOut);) {

                oOut.writeObject(userPreferences);

            } catch (IOException ioe) {
                System.out.println("I/O error: " + ioe.getMessage());
            }
        });

        cancelButton.addActionListener(evtCancel -> {
            prefDialog.setVisible(false);
        });

        p1.add(colorLabel);
        p1.add(color);
        p1.add(fontLabel);
        p1.add(font);
        p1.add(fontSizelabel);
        p1.add(fontSize);
        p1.add(cancelButton);
        p2.add(saveButton);

        prefDialog.add(BorderLayout.NORTH, p1);
        prefDialog.add(BorderLayout.SOUTH, p2);

        prefDialog.pack();
    }

    public void setFont(String font, int fontSize) {
        textField.setFont(new Font(font,Font.PLAIN,fontSize));
    }

    public static void main(String[] args)  {

        MyCustomizableGUI myCustomizableGUI = new MyCustomizableGUI();
        UserPreferences savedPreferences;

        try(FileInputStream fIn = new FileInputStream("preferences.ser");
            ObjectInputStream oIn = new ObjectInputStream(fIn);) {

            savedPreferences = (UserPreferences) oIn.readObject();

            if (savedPreferences.getColor().contains("Red")) {
                myCustomizableGUI.textField.setForeground(Color.red);
                myCustomizableGUI.color.setSelectedItem("Red");
            } else if (savedPreferences.getColor().contains("Green")) {
                myCustomizableGUI.textField.setForeground(Color.green);
                myCustomizableGUI.color.setSelectedItem("Green");
            } else if (savedPreferences.getColor().contains("Blue")) {
                myCustomizableGUI.textField.setForeground(Color.blue);
                myCustomizableGUI.color.setSelectedItem("Blue");
            } else if (savedPreferences.getColor().contains("Cyan")) {
                myCustomizableGUI.textField.setForeground(Color.cyan);
                myCustomizableGUI.color.setSelectedItem("Cyan");
            } else if (savedPreferences.getColor().contains("Magenta")) {
                myCustomizableGUI.textField.setForeground(Color.magenta);
                myCustomizableGUI.color.setSelectedItem("Magenta");
            } else if (savedPreferences.getColor().contains("Yellow")) {
                myCustomizableGUI.textField.setForeground(Color.yellow);
                myCustomizableGUI.color.setSelectedItem("Yellow");
            } else if (savedPreferences.getColor().contains("Black")) {
                myCustomizableGUI.textField.setForeground(Color.black);
                myCustomizableGUI.color.setSelectedItem("Black");
            }

            myCustomizableGUI.setFont(savedPreferences.getFont(),savedPreferences.getFontSize());
            myCustomizableGUI.font.setSelectedItem(savedPreferences.getFont());
            myCustomizableGUI.fontSize.setSelectedItem(savedPreferences.getFontSize());

        } catch (FileNotFoundException noFile ) {
            // load default font and color
            myCustomizableGUI.setFont("Arial", 25);
            myCustomizableGUI.textField.setForeground(Color.black);

        } catch (ClassNotFoundException noPrefs) {
            noPrefs.printStackTrace();

        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe.getMessage());
        }
    }
}
