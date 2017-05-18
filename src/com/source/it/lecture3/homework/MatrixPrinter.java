package com.source.it.lecture3.homework;

public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2000, 3,    4},
            {3, 4,    5250, 60000000},
            {7, 5,    4,    133, 45698}
        };

        /* Your code here */
        int digits = 12;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-" + digits + "d", array[i][j]);
            }
            System.out.println();
        }

    }
}
