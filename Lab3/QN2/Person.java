package QN2;

abstract class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    abstract void show();
}
