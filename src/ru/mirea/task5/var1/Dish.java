package ru.mirea.task5.var1;

public abstract class Dish {
    private String color, print;
    private int lot ;

    public String getColor() {
        return color;
    }

    public int getLot() {
        return lot;
    }

    public String getPrint() {
        return print;
    }

    public Dish(String color, String print, int lot) {
        this.color = color;
        this.lot = lot;
        this.print = print;
    }

    public abstract void Model();
}
