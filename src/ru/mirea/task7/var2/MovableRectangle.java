package ru.mirea.task7.var2;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() { return "Rectangle:" + "top Left=" + topLeft + ", bottom Right=" + bottomRight;}

    public void moveUP()
    {
        topLeft.moveUP();
        bottomRight.moveUP();
    }

    public void moveDOWN()
    {
        topLeft.moveDOWN();
        bottomRight.moveDOWN();
    }

    public void moveLEFT()
    {
        topLeft.moveLEFT();
        bottomRight.moveLEFT();
    }

    public void moveRIGHT()
    {
        topLeft.moveRIGHT();
        bottomRight.moveRIGHT();

    }
}