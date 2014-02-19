package com.landon.fibonacci;

import com.landon.fibonacci.utils.FibonacciUtils;

public class Fibonacci {      //burrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
    public static void main(String[] args) {
        try {
            if (args.length == 1) {
                int num = Integer.parseInt(args[0]);

                if (FibonacciUtils.isValidInt(num)) {
                    FibonacciUtils.printArray(getFibonacciArray(num));
                } else {
                    System.out.println("Your input is either less than 0 or greater than 46. "
                            + "Please pick a number between 1 to 46.");
                }
            } else {
                System.out.println("Please enter single integer value.");
            }
        } catch (NumberFormatException nfe) { // Non-integer argument
            System.out.println(nfe + "you can only pass integer as an argument.");
        }
    }

    private static int[] getFibonacciArray(int n) {
        int[] target = new int[n];

        if (n == 0) return target;
        if (n > 1) target[1] = 1;
        if (n > 2) {
            for (int i = 2; i <= n - 1; i++) {
                target[i] = target[i - 2] + target[i - 1];
            }
        }
        return target;
    }

    // More mathematically elegant, non-optimal solution
    /*private static int recursiveFib(int n) {
        return (n < 2) ? n : recursiveFib(n - 1) + recursiveFib(n - 2);
    }*/
}
