/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.array.course;

/**
 *
 * @author Bmc pictures
 */
public class BalexCompany {
     public static void calculatePay(double basePay, int hoursWorked) {
        // Constants
        final double MINIMUM_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;
        final double OVERTIME_RATE = 1.5;

        // Check for base pay below minimum wage
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay must not be less than the minimum wage ($8.00 an hour).");
            return;
        }
            // Check for hours worked over maximum limit
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Employees are not allowed to work more than 60 hours a week.");
            return;
        }
        double totalPay;
        // Calculate regular and overtime pay
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * OVERTIME_RATE);
        }
// Print the total pay
        System.out.printf("Total pay for %d hours at $%.2f per hour is $%.2f%n", hoursWorked, basePay, totalPay);
        
    }
    public static void main(String[] args) {
        // Test cases for different employees
        System.out.println("Employee 1:");
        calculatePay(7.50, 35);  // Employee 1: base pay $7.50, hours worked 35
        System.out.println("Employee 2:");
        calculatePay(8.20, 47);  // Employee 2: base pay $8.20, hours worked 47
        System.out.println("Employee 3:");
        calculatePay(10.00, 73); // Employee 3: base pay $10.00, hours worked 73
    }
}
