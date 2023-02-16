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

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.println("Enter the number of customers:");
        int numCustomers = input.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.println();
            System.out.println("Enter the hours parked for customer " + i + ":");
            int hours = input.nextInt();
            double charge = calculateCharges(hours);
            totalReceipts += charge;
            System.out.printf("Customer %d's charge is $%.2f%n", i, charge);
        }

        System.out.println();
        System.out.printf("Yesterday's total receipts: $%.2f%n", totalReceipts);
    }

    public static double calculateCharges(int hours) {
        double minCharge = 2.0;
        double hourlyCharge = 0.5;
        double maxCharge = 10.0;

        if (hours <= 3) {
            return minCharge;
        } else if (hours <= 24) {
            return Math.min(minCharge + hourlyCharge * (hours - 3), maxCharge);
        } else {
            return maxCharge;
        }
    }
}


