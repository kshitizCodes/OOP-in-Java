package Lab9.QN3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SavingAccountScheme extends JFrame implements ActionListener {
    JFrame frame;
    JRadioButton r1, r2, r3;
    JButton button;
    ButtonGroup group;

    SavingAccountScheme() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        r1 = new JRadioButton("Type 1");
        r1.setActionCommand("Type 1");
        r1.setSelected(true);

        r2 = new JRadioButton("Type 2");
        r2.setActionCommand("Type 2");

        r3 = new JRadioButton("Type 3");
        r3.setActionCommand("Type 3");

        button = new JButton("Submit");
        button.addActionListener(this);

        group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (Objects.equals(group.getSelection().getActionCommand(), "Type 1")) {
                JOptionPane.showMessageDialog(null, "Minimum balance: 1000  Interest rate: 3%");
            }
            if (Objects.equals(group.getSelection().getActionCommand(), "Type 2")) {
                JOptionPane.showMessageDialog(null, "Minimum balance: 10000  Interest rate: 5%");
            }
            if (Objects.equals(group.getSelection().getActionCommand(), "Type 3")) {
                JOptionPane.showMessageDialog(null, "Minimum balance: 50000  Interest rate: 8%");
            }
        }
    }
}
