package Q5;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Kshitiz Wagle", "kshitizbca076@ojashwicollege.com.np");
        File file = new File("Lab6/Q5/file");
        try {
            //serializing
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream obout = new ObjectOutputStream(out);
            obout.writeObject(student);
            obout.close();
            out.close();
            //deserializing
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream oin = new ObjectInputStream(in);
            Student s = (Student) oin.readObject();
            in.close();
            oin.close();
            System.out.println("Student info: " + s.getField_id() + " " + s.getName() + " " + s.getEmail());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}