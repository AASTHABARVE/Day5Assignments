
//Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.
package com.bridgelabs.basic;

import java.util.Scanner;
public class HarmonicNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the nth number:");
            int N = sc.nextInt();

            float sum = 0;
            while(N != 0){
                System.out.println("1/"+N);
                sum = sum + (float)(1.0/N);
                N--;
            }
            System.out.println("Result the Nth harmonic number: 1/1 + 1/2 + ... + 1/N is = " + sum);
        }
    }
