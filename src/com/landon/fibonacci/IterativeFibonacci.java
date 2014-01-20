package com.landon.fibonacci;

import com.landon.fibonacci.utils.FibonacciUtils;

public class IterativeFibonacci {
    public static void main(String[] args) {
        try {
            if (args.length == 1) {
                FibonacciUtils.printArray(getFibonacci(Integer.parseInt(args[0])));
            } else {
                System.err.println("Please enter single integer value.");
            }
        } catch (NumberFormatException nfe) { // Non-integer argument
            System.err.println(nfe + "you can only pass integer as an argument.");
        }
    }

    // Returns x-sized Fibonacci array.
    // Prompts user with a warning for size greater than 47.
    private static int[] getFibonacci(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative size is not allowed.");
        } else if (x > 47) {
            System.err.println("Your values after 47th element in this array will"
                + " be incorrect due to integer overflow.");
            System.err.println("Please implement different type array fibonacci"
                + " method for array sized greater than 47.");
        }

        int[] target = new int[x];

        if (x == 0) return target;
        if (x > 1) target[1] = 1;
        if (x > 2) {
            for (int i = 2; i <= x - 1; i++) {
                target[i] = target[i - 2] + target[i - 1];
            }
        }
        return target;
    }
}
