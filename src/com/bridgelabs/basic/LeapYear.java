package com.bridgelabs.basic;
import java.util.Scanner;

public class LeapYear {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year (4 digits): ");
            int year = scanner.nextInt();

            if (year < 1000 || year > 9999) {
                System.out.println("Invalid input. Please enter a 4-digit number.");
            } else if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        public static boolean isLeapYear(int year) {
            // If the year is divisible by 400, it is a leap year
            if (year % 400 == 0) {
                return true;
            }
            // If the year is divisible by 100, it is not a leap year
            if (year % 100 == 0) {
                return false;
            }
            // If the year is divisible by 4, it is a leap year
            return year % 4 == 0;
        }
    }