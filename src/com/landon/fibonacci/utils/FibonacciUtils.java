package com.landon.fibonacci.utils;

public class FibonacciUtils {
    public static void printArray(int[] list) {
        System.out.print("[");

        int length = list.length;

        if (length == 0) {
            System.out.print("");
        } else if (length == 1) {
            System.out.print(list[0]);
        } else {
            for (int i = 0; i <= length - 2; i++) {
                System.out.print(list[i] + ", ");
            }
            System.out.print(list[length - 1]);
        }
        System.out.println("]");
    }

    public static boolean isValidInt(int n) {
        return (n > 0 && n < 47);
    }
}
