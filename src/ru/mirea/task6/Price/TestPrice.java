package ru.mirea.task6.Price;

public class TestPrice {
    public static void main(String[] args) {
        Priceable b1 = new Book("Dandelion wine", 1957, 450);
        Priceable s1 = new Auto("Kia Rio", 5, 500000);
        b1.getPrice();
        s1.getPrice();
    }
}
