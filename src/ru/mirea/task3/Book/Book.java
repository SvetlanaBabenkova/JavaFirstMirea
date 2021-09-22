package ru.mirea.task3.Book;

public class Book {
    private String name;
    private int age;
    private String author;

    public Book(String n, int a, String z) {
        name = n;
        age = a;
        author = z;
    }

    public Book(String n, String z) {
        name = n;
        age = 0;
        author = z;
    }

    public Book() {
        name = "Kniga";
        age = 0;
        author = "Avtor";
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public String toString()
    {
        return this.name + " - year of release: " + this.age + ", written by: " + this.author;
    }

}
