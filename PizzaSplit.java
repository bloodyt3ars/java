package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner in = new Scanner(System.in);
        int peopleNumber = in.nextInt();
        int slicesPizzaNumber = in.nextInt();
        int minimumPizzaNumber=1;
        while ((slicesPizzaNumber*minimumPizzaNumber)%peopleNumber!=0){
            minimumPizzaNumber++;
        }
        System.out.println(minimumPizzaNumber);
    }
}
