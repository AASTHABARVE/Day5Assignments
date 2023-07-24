//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//can be found using a formula (Note: Take a, b and c as input values)
//delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)
package com.bridgelabs.FunctionalProgram;
import java.util.Scanner;

    public class Quadratic {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter the value of b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter the value of c: ");
            double c = scanner.nextDouble();

            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Root 1 of x: " + root1);
                System.out.println("Root 2 of x: " + root2);
            } else if (delta == 0) {
                double root = -b / (2 * a);
                System.out.println("Root of x: " + root);
            } else {
                System.out.println("No real roots. The roots are complex.");
            }
        }
    }

