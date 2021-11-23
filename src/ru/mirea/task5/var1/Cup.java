package ru.mirea.task5.var1;

public class Cup extends Dish{
    public Cup(String color, String print, int lot) {
    super(color, print, lot);
}

    public void Model() {
        System.out.println("Color: " + super.getColor() + "; Print: " + super.getPrint() + "; Volume:" + super.getLot());
    }
}
