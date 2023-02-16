/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module3inclassassignment;

/**
 *
 * @author hamza
 */
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter an integer (or -1 to exit): ");
        num = input.nextInt();

        while (num != -1) {
            if (isEven(num)) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }

            System.out.println("Enter an integer (or -1 to exit): ");
            num = input.nextInt();
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

