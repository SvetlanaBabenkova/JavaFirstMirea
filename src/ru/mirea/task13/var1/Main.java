package ru.mirea.task13.var1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList list;
        list=new ArrayList();
        System.out.println("Initial data:");
        list.add("Akakiy");
        list.add(4567);
        for (Object o:list) {
            System.out.println(o);
        }

        System.out.println("Modify data:");
        list.add(2,"Pupkin");
        for (Object o:list) {
            System.out.println(o);
        }
        System.out.println("Size before: "+list.size());
        list.clear();
        System.out.println("Size after: "+list.size());

    }
}
