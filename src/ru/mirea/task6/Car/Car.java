package ru.mirea.task6.Car;

public abstract class Car  {
    private int weight;
    private String surname;

    public int getWeight () {
        return weight;
    }

    public String getSurname()
    {
        return surname;
    }

    public Car( int weight,String surname)
    {
        this.weight = weight;
        this.surname=surname;
    }
    public abstract void infoCar();
}