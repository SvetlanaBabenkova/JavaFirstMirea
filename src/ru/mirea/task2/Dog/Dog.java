package ru.mirea.task2.Dog;

public class Dog {
    String name;
    int age;
    int people;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public int getPeople(){
        return age*7;
    }

    public String toString() {
        return this.name+" dog at age:  "+this.age+"; human at age: "+this.getPeople();
    }
}
