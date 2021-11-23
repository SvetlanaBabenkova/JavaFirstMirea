package ru.mirea.task5.var3;

public abstract  class Furniture {
    String color,style;
    int age;


    public String getColor() {
        return color;
    }

    public String getStyle() {
        return style;
    }

    public int getAge() {
        return age;
    }

    public Furniture(String color, String style, int age) {
        this.color = color;
        this.style = style;
        this.age = age;
    }
    public abstract void Model();

}
