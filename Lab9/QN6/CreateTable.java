package Lab9.QN6;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CreateTable {
    JFrame frame;
    JTable table;

    CreateTable() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Lab9/QN6/this"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
