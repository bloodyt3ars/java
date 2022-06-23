package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner in = new Scanner(System.in);
        int inputNumber = 1;
        int max = -999999;
        while (inputNumber!=0)
        {
            inputNumber = in.nextInt();
            max = (inputNumber>max&&inputNumber!=0)? inputNumber : max;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
