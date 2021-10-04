package QN3;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Book> books = new Vector<>();
        Book book1 = new Book(9780134743356L, "Harvey Deitel and Paul J. Deitel", "Java: How to Program", "NaN", 1996);
        Book book2 = new Book(9788420739564L, "Alexandre Dumas", "The Count of Monte Cristo", "NaN", 1844);
        books.add(book1);
        books.add(book2);
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() == 9780134743356L) {
                System.out.println("Same book found.");
            }
        }
    }
}
