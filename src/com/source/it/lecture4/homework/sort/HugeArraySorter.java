package com.source.it.lecture4.homework.sort;

import java.util.Arrays;

public class HugeArraySorter {
    public static void main(String[] args) {
        int[] hugeArray = ArrayCreator.createHugeArray(10);

        /*Your implementation here*/
        int[] mass9 = new int[10];
        for (int i = 0; i < hugeArray.length; i++) {

            switch (hugeArray[i]) {
                case 0 : {
                    mass9[0]++;
                    break;
                }
                case 1 : {
                    mass9[1]++;
                    break;
                }
                case 2 : {
                    mass9[2]++;
                    break;
                }
                case 3 : {
                    mass9[3]++;
                    break;
                }
                case 4 : {
                    mass9[4]++;
                    break;
                }
                case 5 : {
                    mass9[5]++;
                    break;
                }
                case 6 : {
                    mass9[6]++;
                    break;
                }
                case 7 : {
                    mass9[7]++;
                    break;
                }
                case 8 : {
                    mass9[8]++;
                    break;
                }
                case 9 : {
                    mass9[9]++;
                    break;
                }
                default: break;
            }
        }
        int count = 0;
        for (int i = 0; i < mass9.length; i++) {
            for (int j = 0; j < mass9[i]; j++) {
                hugeArray[count++] = i;
            }
        }

        //System.out.println(Arrays.toString(mass9));

        for (int index = 0; index < hugeArray.length - 1; index++) {
            if (hugeArray[index] > hugeArray[index + 1]) {
                System.out.println("Sort failed!!!");
                return;
            }
        }

        System.out.println("Sort successful!!");
    }
}
