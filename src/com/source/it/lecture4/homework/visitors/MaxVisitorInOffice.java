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
        }
        int maxVisitorAtOnce = 0;

        /*Your code here*/

        int temp = 1;
        for (int i = 1; i < visitors.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (visitors[j].getLeaveTime() > visitors[i - 1].getComeTime()
                        && visitors[j].getLeaveTime() < visitors[i].getComeTime()){
                    temp--;
                }
                if (maxVisitorAtOnce < temp) {
                    maxVisitorAtOnce = temp;
                }
            }
            temp++;

        }
        System.out.println("Max visitors was " + maxVisitorAtOnce);
        System.out.println("Total visitors was " + visitors.length);
    }
}
