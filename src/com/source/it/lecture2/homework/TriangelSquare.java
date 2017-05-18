package com.source.it.lecture2.homework;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        float length = 0;
        float square = 0;

        /*your code here*/
        float len1 = calcLength(x1, y1, x2, y2);
        float len2 = calcLength(x1, y1, x3, y3);
        float len3 = calcLength(x3, y3, x2, y2);
        length = len1 + len2 + len3;

        float length2 = length / 2;
        square = (float) Math.sqrt(length2 * Math.abs(length2 - len1) *
                Math.abs(length2 - len2) * Math.abs(length2 - len3));

        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }

    public static float calcLength(int x1, int y1, int x2, int y2) {

        double result =  Math.sqrt(Math.abs(Math.pow((x1 - x2), 2) - Math.pow((y1 - y2), 2)));

        return (float) result;
    }
}
