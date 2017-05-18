package com.source.it.lecture2.homework;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 2;
        int mins = 30;
        int result = 0;

        /*Your code here*/
        if (testData(hours, mins)) {
            result = calcAngle(hours, mins);
            System.out.println("Angle between hours and minute narrows is " + result);
        } else {
            System.out.println("Enter correct data");
        }

    }

    public static int calcAngle(int hours, int mins) {
        int result = Math.abs((360 / 12 * hours ) - ( 360 / 60 * mins));
        if (result > 180) {
            result = 360 - result;
        }
        return result;
    }

    public static boolean testData(int hours, int mins) {
        if (hours < 0 || hours > 23) {
            return false;
        }

        if (mins < 0 || mins > 59) {
            return false;
        }

        return true;
    }

}
