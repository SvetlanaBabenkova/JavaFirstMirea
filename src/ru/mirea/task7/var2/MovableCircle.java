package ru.mirea.task7.var2;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() { return "Circle:" + "radius=" + radius + ", center=" + center;}

    public void moveUP() {
        center.moveUP();
    }

    public void moveDOWN() {
        center.moveDOWN();
    }

    public void moveRIGHT() {
        center.moveRIGHT();
    }

    public void moveLEFT() {
        center.moveLEFT();
    }
}