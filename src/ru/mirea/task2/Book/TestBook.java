package ru.mirea.task2.Book;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Flowers for Algernon", 62, 311);
        Book d2 = new Book("Harry Potter and the Goblet of Fire", 19, 672);
        Book d3 = new Book("War and Peace");
        d3.setAge(154);
        d3.setThickness(1300);
        System.out.println(d1);
        d1.intoMonth();
        d2.intoMonth();
        d3.intoMonth();
    }
}
