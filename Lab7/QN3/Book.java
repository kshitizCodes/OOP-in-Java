package QN3;

public class Book {
    private long isbn;
    private String author;
    private String name;
    private String publisher;
    private int year;

    Book() {
    }

    Book(long isbn, String author, String name, String publisher, int year) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.year = year;
    }

    public long getIsbn() {
        return this.isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public String name() {
        return this.name;
    }

    public String publisher() {
        return this.publisher;
    }

    public int getYear() {
        return this.year;
    }
}
