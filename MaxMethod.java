package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maximum=Integer.MIN_VALUE;
        for (int element:values) {
            maximum = Math.max(element, maximum);
        }
        return maximum;
    }
}
