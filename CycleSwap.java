package com.epam.rd.autotasks;

class CycleSwap {
    static int[] cycleSwap(int[] array) {
        int[] resultArray = new int[array.length];
        System.arraycopy(array, 0, resultArray, 1, array.length-1);
        resultArray[0] = array[array.length-1];
        return resultArray;
    }

    static int[] cycleSwap(int[] array, int shift) {
        int[] resultArray = new int[array.length];
        if (resultArray.length > shift) {
            System.arraycopy(array, shift+1, resultArray, 0, array.length-shift-1);
            System.arraycopy(array, 0, resultArray, shift, array.length-shift);
        }
        else {
            resultArray = array;
        }
        return resultArray;
    }
}
