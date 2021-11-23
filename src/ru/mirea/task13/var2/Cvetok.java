package ru.mirea.task13.var2;

import java.util.LinkedList;

public class Cvetok {
    String model;

    public Cvetok(String model) {
        this.model = model;
    }
    public static void main(String[] args){
        LinkedList<Cvetok> flowers = new LinkedList<>();
        Cvetok rosa = new Cvetok("Rosa chinensis");
        Cvetok romashka = new Cvetok("Chamaemelum nobile");
        Cvetok lily = new Cvetok("Lilium regale");
        Cvetok oduvan = new Cvetok("Tarаxacum officinаle");
        Cvetok margaritka = new Cvetok("Bellis perennis");

        flowers.add(rosa);
        flowers.add(romashka);
        flowers.add(lily);
        System.out.println(flowers);

        flowers.addFirst(oduvan);
        flowers.addLast(margaritka);
        System.out.println(flowers);
    }

    public String toString() {
        return "Flower - " + "type: " + model + " ";
    }
}