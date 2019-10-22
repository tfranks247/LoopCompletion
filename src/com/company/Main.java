package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter ten numbers: ");
        int num, total = 0;

        // Loop should start here
        for( int n=1; n<11; n++) {
            num = keyboard.nextInt();
            total += num;
            // Loop should end here
        }
        System.out.println("The total of all 10 numbers is " + total);

    }

}
