package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalAmount = in.nextInt();
        if (totalAmount>=0)
        {
            int friendsNumber = in.nextInt();
            if (friendsNumber>0){
                totalAmount *= 1.1 ;
                int partPayment = totalAmount/friendsNumber;
                System.out.println(partPayment);
            }
            else {
                System.out.println("Number of friends cannot be negative or zero");
            }
        }
        else {
            System.out.println("Bill total amount cannot be negative");
        }

    }
}
