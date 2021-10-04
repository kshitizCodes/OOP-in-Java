package QN2;

class Student extends Person {
   Student(String name, int age) {
       super(name, age);
   }

   @Override
   public void show() {
       System.out.println("Name: " + super.getName() + " Age: " + super.getAge());
   }
}
