package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = 0, minutes = 0;
        while (seconds>=60){
            minutes+=1;
            seconds-=60;
        }
        while (minutes>=60){
            hours+=1;
            minutes-=60;
        }
        while (hours>=24) {
            hours -= 24;
        }
        System.out.printf("%d:%02d:%02d \n", hours, minutes, seconds);
    }
}
