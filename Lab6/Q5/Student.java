package Q5;

import java.io.*;

public class Student implements Serializable {
    private int field_id;
    private String name;
    private String email;

    Student(int field_id, String name, String email) {
        this.field_id = field_id;
        this.name = name;
        this.email = email;
    }

    int getField_id() {
        return field_id;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }
}
