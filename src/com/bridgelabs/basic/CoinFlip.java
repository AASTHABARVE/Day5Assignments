package com.bridgelabs.basic;
import java.util.Random;
import java.util.Scanner;


public class CoinFlip {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of times to flip the coin: ");
            int numFlips = scanner.nextInt();

            if (numFlips <= 0) {
                System.out.println("Number of flips should be a positive integer.");
                return;
            }

            int headsCount = 0;
            int tailsCount = 0;
            Random random = new Random();

            for (int i = 0; i < numFlips; i++) {
                if (random.nextDouble() < 0.5) {
                    tailsCount++;
                } else {
                    headsCount++;
                }
            }

            double headsPercentage = (headsCount * 100.0) / numFlips;
            double tailsPercentage = (tailsCount * 100.0) / numFlips;

            System.out.println("Number of flips: " + numFlips);
            System.out.println("Percentage of Heads: " + String.format("%.2f", headsPercentage) + "%");
            System.out.println("Percentage of Tails: " + String.format("%.2f", tailsPercentage) + "%");
        }
    }


