package ru.mirea.task4.Ball;

public class TestBall {
    public static void main(String[] args)
    {
        Ball a = new Ball(12, 10);
        System.out.println(a);
        a.move(4, 6);
        System.out.println(a);
    }
}
