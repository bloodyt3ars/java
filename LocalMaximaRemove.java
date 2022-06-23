package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        Integer [] tempArray = new Integer[array.length];
        int length=0;
        if (!(array[0]>array[1])) {
            length++;
            tempArray[0] = 0;
        }
        if (!(array[array.length-1]>array[array.length-2])) {
            length++;
            tempArray[array.length-1] = array.length-1;
        }
        for (int i = 1; i < array.length-1; i++) {
            if (!(array[i-1]<array[i]&&array[i]>array[i+1])) {
                length++;
                tempArray[i] = i;
            }
        }
        int [] resultArray = new int[length];
        for (int i = 0, j=0; i < array.length; i++) {
            if (tempArray[i] != null) {
                resultArray[j] = array[tempArray[i]];
                j++;
            }
        }
        return resultArray;
    }
}
