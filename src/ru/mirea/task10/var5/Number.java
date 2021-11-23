package ru.mirea.task10.var5;
import java.util.Scanner;
public class Number
{
    public static int recursion(int n)
    {
        if (n < 10)
        {
            return n;
        }
        else
        {
            return n % 10 + recursion(n / 10);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("N: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(recursion(n));
    }
}
