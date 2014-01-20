package com.landon.fibonacci;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.print(fib1(0));
        for (int i = 1; i <= 10; i++) {
            System.out.print(", " + fib1(i));
        }
        System.out.println();

        System.out.print(fib2(0));
        for (int i = 1; i <= 10; i++) {
            System.out.print(", " + fib2(i));
        }
    }

    private static int fib1(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fib1(n - 1) + fib1(n - 2);
    }

    private static int fib2(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        int[] list = new int[n + 1];
        list[0] = 0;
        list[1] = 1;

        for (int i = 2; i <= n; i++) {
            list[i] = list[i - 1] + list[i - 2];
        }
        return list[n];
    }
}
