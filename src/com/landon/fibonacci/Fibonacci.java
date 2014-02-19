package com.landon.fibonacci;

import java.util.Scanner;

import com.landon.fibonacci.utils.FibonacciUtils;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean promptAgain = true;

        Introduction();

        while (promptAgain) {
            int num = getNumber(console);

            if (FibonacciUtils.isValidInt(num)) {
                FibonacciUtils.printArray(getFibonacciArray(num));
            } else {
                System.out.println("Your input is either less than 0 or greater than 46.");
                System.out.println("Please pick a number between 1 to 46.");
                continue;
            }

            System.out.println("Would you like to run this program again? [Y/n] ");
            promptAgain = console.next().equals("Y");
        }

        console.close();
        System.exit(0);
    }

    private static void Introduction() {
        System.out.println("This program takes integer (from 0 to 46)");
        System.out.println("and prints the Fibonacci sequence up to the");
        System.out.println("given integer.");
        System.out.println();
    }

    private static int getNumber(Scanner console) {
        String prompt = "Please enter the number: ";
        System.out.print(prompt);

        while (!console.hasNextInt()) {
            console.next();
            System.out.println("Not an integer; please try again.");
            System.out.println(prompt);
        }
        return console.nextInt();
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
