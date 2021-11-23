package ru.mirea.task10.var4;

import java.util.Scanner;

public class Ktos
{
    public static int recursion(int a, int sum, int k, int s)
    {
        if (a == k)
        {
            if (sum == s)
            {return 1;}
            else
            {return 0;}
        }

        int c = (a == 0 ? 1 : 0);
        int result = 0;
        for (int i = c; i < 10; i++)
        {
            result += recursion(a + 1, sum + i, k, s);
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("D = " + recursion(0, 0, 2, 10));
    }
}