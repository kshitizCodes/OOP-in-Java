package QN2;

class Teacher extends Person {
   Teacher(String name, int age) {
       super(name, age);
   }

   @Override
   public void show() {
       System.out.println("Name: " + getName() + " Age: " + getAge());
   }
}
