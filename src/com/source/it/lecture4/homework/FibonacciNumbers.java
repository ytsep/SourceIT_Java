package com.source.it.lecture4.homework;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int fibonacci = fibonacci(7);

        System.out.println(fibonacci);
    }

    private static int fibonacci(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }


        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
