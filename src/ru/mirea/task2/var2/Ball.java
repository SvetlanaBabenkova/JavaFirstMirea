package ru.mirea.task2.var2;

public class Ball {
    String name;
    int size;
    String material;
    public static void main(String[] args) {
        Ball b1 = new Ball();
        b1.name = "green";
        b1.size = 12;
        b1.material = "rubber";

        System.out.println("This is " + b1.name +" "+ b1.material + " ball, with a diameter of " + b1.size);
    }
}
