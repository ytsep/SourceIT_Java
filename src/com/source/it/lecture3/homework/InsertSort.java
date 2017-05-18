package com.source.it.lecture3.homework;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        //int[] array = {5, 7, 9, 15, 10, -1, 8};
        int[] array = {15, 7, 9, 15, 10, -1, 8, -9, 23, 7, 11, -50, 15};

        /*Your code here*/
        for (int i = 1; i < array.length; i++) {
            int k = 1;
            boolean key = true;
            int temp = 0;
                while (array[i] < array[i - k]){
                    if (k == i) {
                        temp = array[i];
                        System.arraycopy(array, 0, array, 1, i);
                        array[0] = temp;
                        key = false;
                        break;
                    }
                    k++;
                }
                if (k != 1 && key == true) {
                    temp = array[i];
                    System.arraycopy(array, i - k, array, i - k + 1, k);
                    array[i - k + 1] = temp;
                }
        }
        System.out.println(Arrays.toString(array));
    }
}
