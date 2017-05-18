package com.source.it.lecture3.homework;

import java.util.Arrays;

public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 4},
                {3, 4, 6},
                {7, 5, 1},
                {3, 5, 0}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };

        if (first.length != second.length || first[0].length != second[0].length) {
            System.out.println(" No correct matrix-s");
            return;
        }

        int[][] multiplier = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                multiplier[i][j] = first[i][j] * second[i][j];
            }
        }

        for (int i = 0; i < multiplier.length; i++) {
            System.out.println(Arrays.toString(multiplier[i]));
        }

    }
}
