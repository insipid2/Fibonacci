package com.landon.fibonacci.utils;

public class FibonacciUtils {
    
    // Prints array in a format [element 1, element 2, ...]
    public static void printArray(int[] list) {
        System.out.print("[");

        if (list.length == 0) {
            System.out.print("");
        } else if (list.length == 1) {
            System.out.print(list[0]);
        } else {
            for (int i = 0; i <= list.length - 2; i++) {
                System.out.print(list[i] + ", ");
            }
            System.out.print(list[list.length - 1]);
        }
        System.out.println("]");
    }
}
