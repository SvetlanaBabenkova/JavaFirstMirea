package ru.mirea.task6.Car;

public class Renologan extends Car {
    public Renologan(int weight, String surname){super(weight,surname);}
    public void infoCar()
    {
        System.out.println("Weight of "+super.getSurname()+" in tons:"+super.getWeight());
    }
}