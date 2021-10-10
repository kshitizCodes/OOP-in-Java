package QN5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class SalesTransactionDemo {
    public static void main(String[] args) {
        LinkedList<SalesTransaction> list;

        SalesTransaction st1 = new SalesTransaction("This Person", new SalesTransaction.Date(2021, 10, 8),
                "How To Java?", 1.00, 400.00);
        SalesTransaction st2 = new SalesTransaction("That Person", new SalesTransaction.Date(2021, 10, 7),
                "Android Internals", 1.00, 600);
        SalesTransaction st3 = new SalesTransaction("Those People", new SalesTransaction.Date(2020, 10, 9),
                "iOS Internals", 1.00, 600);

        list = new LinkedList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        list.sort(new Comparator<>() {
            @Override
            public int compare(SalesTransaction o1, SalesTransaction o2) {
                return Integer.parseInt(o1._getDate()) - Integer.parseInt(o2._getDate());
            }
        });

        Iterator<SalesTransaction> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
