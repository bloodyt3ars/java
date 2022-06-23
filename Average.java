package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        int average;
        int sum = inputNumber;
        int count = 0;
        while (inputNumber!=0)
        {
            inputNumber = in.nextInt();
            sum+=inputNumber;
            count++;
        }
        average=sum/count;
        System.out.println(average);

    }

}