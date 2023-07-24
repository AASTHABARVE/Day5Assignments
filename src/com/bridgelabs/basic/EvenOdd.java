package com.bridgelabs.basic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int data = sc.nextInt();

        if(data%2 == 0){
            System.out.println(data + " is even number");
        }else{
            System.out.println(data + " is odd number");
        }
    }
}
