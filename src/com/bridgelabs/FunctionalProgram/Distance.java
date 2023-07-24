//Write a program Distance.java that takes two integer command-line arguments x
//and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
//formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
package com.bridgelabs.FunctionalProgram;

public class Distance {
        public static void main(String[] args) {
            int x1 = 0, y1 = 0;
            int x2 = 4, y2 = 4;
            int distance = 0;

            distance = (int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

            System.out.println("Distance between points "+"("+x1+","+y1+"),"+"("+x2+","+y2+") is ->"+distance);
        }
    }

