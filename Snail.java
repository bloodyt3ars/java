package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner in = new Scanner(System.in);
        String aInputString = in.nextLine();
        int a = Integer.parseInt(aInputString);
        String bInputString = in.nextLine();
        int b = Integer.parseInt(bInputString);
        String hInputString = in.nextLine();
        int h = Integer.parseInt(hInputString);
        int days=1;
        h=h-a;
        if (a>b){
            while (h>0){
                days++;
                h=h-a+b;
            }
            System.out.println(days);
        } else if (h>0) {
            System.out.println("Impossible");
        }
        else{
            System.out.println(days);
        }
    }
}
