package ru.mirea.task6.Car;

public class TestCar {
    public static void main(String[] args)
    {
        Car p1=new Kiaceed(4, "Kia Ceed");
        p1.infoCar();
        if (p1 instanceof Kia)
        {
            int k=((Kia)p1).getMash();
            System.out.println("Made in Korea");
        }
        else
            System.out.println("No inf");
        Car p2=new Renologan(2, "Reno Logan");
        p2.infoCar();
        if (p2 instanceof Kia)
        {
            int k=((Kia)p2).getMash();
            System.out.println("Made in Korea");
        }
        else
            System.out.println("No inf");
    }
}
