package Lekcija_13_Lambda_Izrazi;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    public void processButtonClick(ActionEvent actionEvent) {
        System.out.println("Someone clicked on the button!");
    }

    public static void main(String[] args) {
        Frame example = new Frame();
        JButton myButton = new JButton("Click me");
        example.add(myButton);

        myButton.addActionListener(example::processButtonClick);

        example.pack();
        example.setVisible(true);
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        example.setLocationRelativeTo(null);
    }
}
