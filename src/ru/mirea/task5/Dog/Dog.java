package ru.mirea.task5.Dog;

public abstract class Dog {
    private String name;
    private String age;
    private String height;
    public String getName() {return name;}
    public String getAge() {return age;}
    public String getHeight() {return height;}
    public Dog(String name, String age, String height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public abstract void displayInfo();
}
