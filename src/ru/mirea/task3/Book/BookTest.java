package ru.mirea.task3.Book;

public class BookTest {
    public static void main(String[] args) {
        Book d1 = new Book("Flowers for Algernon", 1959, "Daniel Keyes");
        Book d2 = new Book("Harry Potter and the Goblet of Fire", 2000, "J. K. Rowling");
        Book d3 = new Book("War and Peace", 1869, "Leo Tolstoy");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
