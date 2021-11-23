package ru.mirea.task6.Car;

public class Kiaceed extends Car implements Kia{
    public Kiaceed(int weight, String surname){super(weight, surname);}
    public void infoCar()
    {
        System.out.println("Weight of "+super.getSurname()+" in tons:"+super.getWeight());
    }
    public int getMash() {
        return 0;
    }
}