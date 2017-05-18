package com.source.it.lecture4.homework.visitors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class MaxVisitorInOffice {
    public static void main(String[] args) {
        Visitor[] visitors = Visitor.createVisitors();
        Arrays.sort(visitors, new Comparator<Visitor>() {
            @Override
            public int compare(Visitor o1, Visitor o2) {
                return o1.getComeTime() > o2.getComeTime() ? 1 : -1;
            }
        });
        for (Visitor visitor : visitors) {
            System.out.println("Come " + new Date(visitor.getComeTime()));
            System.out.println("Leave " + new Date(visitor.getLeaveTime()));

            System.out.println("Leave " + visitor.getLeaveTime());


        }
        int maxVisitorAtOnce = 0;

        /*Your code here*/




    /*    int temp = 1;
        for (int i = 0; i < visitors.length - 1; i++) {
            for (int j = i + 1; j < visitors.length; j++ ) {
                if (visitors[i].getLeaveTime() > visitors[j].getLeaveTime()) {
                    temp++;
                } else {
                    temp--;
                }
            }

            if (maxVisitorAtOnce < temp) {
                maxVisitorAtOnce = temp;
            }
        }*/
        System.out.println("Max visitors was " + maxVisitorAtOnce);
        System.out.println(visitors.length);
    }
}
