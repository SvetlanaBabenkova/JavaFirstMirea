package ru.mirea.task1;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Sum=0;
        System.out.print("Введите длину массива: ");
        int a = sc.nextInt();
        System.out.print("Введите массив: ");
        int[] b = new int[a];
        for (int i=0; i<a; i++)
        {
            b[i] = sc.nextInt();
            Sum = Sum + b[i];
        }
        System.out.println("Сумма элементов массива: ");
        System.out.print(Sum);
    }
}
