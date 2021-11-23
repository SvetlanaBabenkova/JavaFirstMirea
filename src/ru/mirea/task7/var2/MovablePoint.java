package ru.mirea.task7.var2;

public class MovablePoint implements Movable{
    protected int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    public String toString() { return "Point:" + "x=" + x + ", y=" + y + ", Speed X=" + xSpeed + ", Speed Y=" + ySpeed;}

    public void moveUP() { y++;}

    public void moveDOWN() { y--;}

    public void moveRIGHT() { x++;}

    public void moveLEFT() { x--;}
}