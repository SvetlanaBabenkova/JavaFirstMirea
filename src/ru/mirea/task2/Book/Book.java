package ru.mirea.task2.Book;

public class Book {
    private String name;
    private int age;
    private int thickness;

    public Book(String n, int a, int z) {
        name = n;
        age = a;
        thickness = z;
    }

    public Book(String n) {
        name = n;
        age = 0;
        thickness = 0;
    }

    public Book() {
        name = "Kniga";
        age = 0;
        thickness = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
    public int getThickness() {
        return thickness;
    }
    public String toString(){
        return this.name + ", age " + this.age + ", thickness " + this.thickness;
    }
    public void intoMonth(){
        System.out.println(name+"'s age is "+age*12+" months" + ", number of pages: " + thickness );
    }
}
