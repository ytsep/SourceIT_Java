package com.source.it.lecture3.homework;


import java.util.Arrays;

public class MatrixInverter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 7, 4, 1},
                {7, 5, 4, 1}
        };
        /* Your code here */

        if (array.length != array[0].length) {
            System.out.println("No correct matrix!");
            return ;
        }
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[0].length - i - 1; j++) {

                temp = array[i][i + j + 1];
                array[i][i + j + 1] = array[i + j + 1][i];
                array[i + j + 1][i] = temp;
            }
        }

        for (int[] arr: array) {
            System.out.println(Arrays.toString(arr));
        }
    }
}