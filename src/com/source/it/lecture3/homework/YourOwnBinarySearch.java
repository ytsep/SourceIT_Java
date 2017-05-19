package com.source.it.lecture3.homework;

public class YourOwnBinarySearch {
    static int[] array = {1, 4, 7, 10, 17, 30, 48, 49};
    static int element = 7;

    public static void main(String[] args) {
        System.out.println(binarySearch(array, element));
    }


    private static int binarySearch(int[] array, int elem) {
        int result = -1;
        /* Your code here */

        int first = 0;
        int end = array.length - 1;
        while (end - first > 1) {
            int middle = (end + first) / 2;
            if (array[middle] == elem) {
                result = middle;
                break;
            } else if (array[middle] < elem) {
                first = middle;
            } else {
                end = middle;
            }
        }
        if (array[first] == elem) {
            result = first;
        }
        if (array[end] == elem) {
            result = end;
        }
        return result;
    }

}
