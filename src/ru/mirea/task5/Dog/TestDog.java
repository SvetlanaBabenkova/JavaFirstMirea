package ru.mirea.task5.Dog;

public class TestDog {
    public static void main(String[] args) {
        Bulldog bl = new Bulldog("Akakiy", "12", "72", "boy");
        bl.displayInfo();
        Shepherd sp = new Shepherd("Lara", "3", "94", "2");
        sp.displayInfo();
    }
}
