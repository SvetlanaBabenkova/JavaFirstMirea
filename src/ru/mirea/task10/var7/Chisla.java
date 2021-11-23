package ru.mirea.task10.var7;
import java.util.Scanner;

public class Chisla {
    public static void recursion(int n, int k) {
        if (k > n / 2)
        {
            System.out.println(n);
            return;
        }
        if (n % k == 0)
        {
            System.out.println(k);
            recursion(n / k, k);
        }
        else
        {
            recursion(n, ++k);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("N: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        recursion(n, 2);
    }
}
