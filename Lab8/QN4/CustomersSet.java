package QN4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CustomersSet {
    public static void main(String[] args) {
        HashSet<Customers> customers = new HashSet<>();
        customers.add(new Customers(15, "Sweta"));
        customers.add(new Customers(10, "Ram"));
        customers.add(new Customers(12, "Ghanashyam"));
        customers.add(new Customers(12, "Hari"));
        customers.add(new Customers(13, "Gopal"));
        customers.add(new Customers(15, "Ashish"));
        customers.add(new Customers(10, "Shyam"));
        List<Customers> list = new ArrayList<>(customers);
        list.sort(new Comparator<>() {
            @Override
            public int compare(Customers o1, Customers o2) {
                int result = o1.getAge() - o2.getAge();
                if (result != 0) {
                    return result;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list);
    }
}
