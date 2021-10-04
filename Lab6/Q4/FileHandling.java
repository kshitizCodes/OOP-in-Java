package Q4;

import java.io.*;


public class FileHandling {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Q4/a1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Q4/b1.txt"));
            int s;
            while ((s = br.read()) != -1) {
                bw.write(s);
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}