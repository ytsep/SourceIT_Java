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
        /*не работает*/
        result = binarySearchTwo(array, 0, array.length, elem );

        return result;
    }

    private static int binarySearchTwo (int[] array, int first, int end, int elem) {

        while (end - first > 0) {

            int middle = (end + first) / 2;

            if (array[middle] == elem) {
                return middle;
            } else if (array[middle] < elem) {
               end = middle + 1;
            } else {
                first = middle;
            }
        }

        return -1;
    }

}
