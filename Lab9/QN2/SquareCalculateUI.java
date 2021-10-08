package Lab9.QN2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareCalculateUI extends JFrame implements ActionListener {
    JFrame frame;
    JLabel inputLabel, outputLabel;
    JTextField inputField, outputField;
    JButton button;
    JPanel first, second, third;

    SquareCalculateUI() {
        frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        first = new JPanel();
        first.setLayout(new FlowLayout());

        second = new JPanel();
        second.setLayout(new FlowLayout());

        third = new JPanel();
        third.setLayout(new FlowLayout());

        inputLabel = new JLabel("Enter any number: ");
        inputField = new JTextField(10);
        first.add(inputLabel);
        first.add(inputField);
        frame.add(first);

        button = new JButton("Calculate Square");
        button.addActionListener(this);
        second.add(button);
        frame.add(second);

        outputLabel = new JLabel("Square of entered number: ");
        outputField = new JTextField(10);
        third.add(outputLabel);
        third.add(outputField);
        frame.add(third);
        
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            double number = Double.parseDouble(inputField.getText());
            number = Math.pow(number, 2);
            outputField.setText(String.valueOf(number));
        }
    }
}
