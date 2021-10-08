package Lab9.QN5;

import javax.swing.*;

public class JavaMenus {
    JMenuItem itemI, itemII;

    JavaMenus() {
        JFrame frame = new JFrame("Menu Demo");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        itemI = new JMenuItem("This");
        itemII = new JMenuItem("That");
        menu.add(itemI);
        menu.add(itemII);
        menuBar.add(new JMenu());
        menuBar.add(menu);
        frame.add(menuBar);

        frame.setJMenuBar(menuBar);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}
