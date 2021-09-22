package ru.mirea.task6.Price;

public class Auto implements Priceable {
    private String name;
    private int age;
    private int price;

    Auto(String name, int age, int price){
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public void getPrice() {
        System.out.println("\nМарка машины: " + name + "; Возраст: " + age + "; Стоит: " + price + "Р");
    }
}

