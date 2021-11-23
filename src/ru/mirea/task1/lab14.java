package ru.mirea.task1;

    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;

class lab14 {
    public static void main (String[] args){
        System.out.println("Enter thr number of items:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Random m=new Random();
        int mas[]=new int[n];
        System.out.println();
        System.out.println("Array a:");
        for (int i=0;i<n;i++){
            mas[i]=m.nextInt(100);
            System.out.print(mas[i]+" ");
        }System.out.println();
        System.out.println("New Array a:");
        Arrays.sort(mas);
        for (int i = 0; i <  mas.length; i++) {
            System.out.print(mas[i] + " ");
        }System.out.println();
        System.out.println("Array b:");
        int[] array;
        array = new int[n];
        for (int i = 0; i <array.length ; i++) {
            array[i] = ((int) (Math.random()*100 ));
            System.out.print(array[i]+ " ");
        }System.out.println();
        Arrays.sort(array);
        System.out.println("New array b:");
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
