package ru.mirea.task5.var3;

public class Sofa extends Furniture {
    public Sofa(String color, String style, int age) {
        super(color, style,age);
    }

    public void Model() {
        System.out.println(super.getColor() + " sofa in " + super.getStyle() + " style. Age:" + super.getAge());
    }
}
