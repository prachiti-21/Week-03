package com.bigo;

public class CompareFibonacci {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci recursive output: ");

        int[] num = {10, 30, 50};


        for (int n : num) {
            int[] dataset = new int[n];
            for (int i = 0; i < num.length; i++) {
                dataset[i] = n;
            }
            //execution time for recursion
            long startTime = System.nanoTime();
            fibonacciRecursive(n);
            long recursiveTime = System.nanoTime() - startTime;

            //execution time for iteration
            startTime = System.nanoTime();
            fibonacciIterative(n);
            long iterativeTime = System.nanoTime() - startTime;

            System.out.println("Number: " + n);
            System.out.println("Execution time for recursion: " + recursiveTime/1_000_000+" ms");
            System.out.println("Execution time for iteration: " + iterativeTime/1_000_000+" ms");
            System.out.println("Recursive approach is infeasible for large values of N due to exponential growth.");
            System.out.println("The iterative approach is significantly faster and memory-efficient.");

        }
    }
}
