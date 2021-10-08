package Lab9.QN4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.Objects;

public class ComboBoxes {
    JFrame frame;
    JComboBox<String> province;
    JComboBox<String> districts;
    String[] provinces = {"Province 1", "Province 2"};
    String[] Province1 = {"Illam", "Jhapa"};
    String[] Province2 = {"Saptari", "Sunsari", "Siraha", "Mahottari"};

    ComboBoxes() {
        frame = new JFrame();
        frame.setLayout(new FlowLayout());

        province = new JComboBox<>(provinces);
        districts = new JComboBox<>(Province1);
        province.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                districts.removeAllItems();
                if (Objects.equals(province.getSelectedItem(), "Province 1")) {
                    for (String s : Province1) {
                        districts.addItem(s);
                    }
                }
                if (Objects.equals(province.getSelectedItem(), "Province 2")) {
                    for (String s : Province2) {
                        districts.addItem(s);
                    }
                }
            }
        });

        frame.add(province);
        frame.add(districts);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
