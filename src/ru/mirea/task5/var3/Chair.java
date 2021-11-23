package ru.mirea.task5.var3;

public class Chair extends Furniture {
    public Chair(String color, String style, int age) {
        super(color, style, age);
    }

    public void Model() {
        System.out.println(super.getColor() + " chair in " + super.getStyle() + " style. Age:" + super.getAge());
    }
}