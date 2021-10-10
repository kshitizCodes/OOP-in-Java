package Lab9.QN1;

import javax.swing.*;

public class BasicGUI {
    String input;
    double numberI, numberII;
    double sum, product, difference;

    BasicGUI() {
        input = JOptionPane.showInputDialog("Enter a number: ");
        numberI = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter another number: ");
        numberII = Double.parseDouble(input);
        sum = numberI + numberII;
        product = numberI * numberII;
        difference = numberI - numberII;
        JOptionPane.showMessageDialog(null, "Sum is " + sum + ", difference is "
                + difference + " and product is " + product);
    }
}
