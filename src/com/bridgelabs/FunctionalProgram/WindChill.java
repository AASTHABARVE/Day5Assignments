//Write a program WindChill.java that takes two double command-line arguments t
//and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
//temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
//National Weather Service defines the effective temperature (the wind chill) to be:
//
//Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
//than 120 or less than 3 (you may assume that the values you get are in that range).
package com.bridgelabs.FunctionalProgram;

import java.util.Scanner;

public class WindChill {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter wind speed value:");
            double v = sc.nextDouble();
            System.out.print("enter temperature value:");
            double t = sc.nextDouble();

            if(t < 50 && v < 120 && v > 3) {
                double data1 = (0.6215 * t);
                double data2 = (0.4275 * t);
                double data3 = Math.pow(v, 0.16);

                double windSpeed = 35.74 + data1 + (data2 - 35.75) * data3;
                System.out.println("windSpeed = " + windSpeed);
            }else{
                System.out.println("inputs are not in range to calculate");
            }
        }
    }

