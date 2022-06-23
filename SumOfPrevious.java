package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){
        boolean[] resultArray = new boolean[array.length];
        for (int i = 2; i < array.length; i++) {
            resultArray[0] = false;
            resultArray[1] = false;
            if (array[i-2]+array[i-1]==array[i]){
                resultArray[i] = true;
            }
            else {
                resultArray[i]=false;
            }
        }
        return resultArray;
    }
}
