package Lab9.QN6;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateTable {
    JFrame frame;
    JTable table;
    String[][] data;

    CreateTable() {
        try {
            List<String[]> lines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("Lab9/QN6/this"));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line.split(","));
            }
            data = new String[lines.size()][0];
            lines.toArray(data);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("CSV");
        JTable table = new JTable(data, data[0]);
        frame.add(table);
        frame.pack();
        frame.setVisible(true);
    }
}

