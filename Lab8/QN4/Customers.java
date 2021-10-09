package QN4;

public class Customers {
    private final String name;
    private final int age;

    Customers(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return this.age + " " + this.name;
    }
}
