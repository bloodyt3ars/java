package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        int count = Integer.parseInt(inputString);
        if (count>0){
            String[] array = new String[count];
            for (int i=0;i<count;i++){
                array[i] = in.nextLine();
            }
            for (int i=0;i<count;i++){
                System.out.println("Hello, "+ array[i]);
            }
        } else if (count == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else {
            System.out.println("Seriously? Why so negative?");
        }

    }
}
