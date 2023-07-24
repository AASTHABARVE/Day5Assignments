package com.bridgelabs.basic;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value1 = ");
        int value1 = sc.nextInt();

        System.out.print("Enter the value2 = ");
        int value2 = sc.nextInt();

        System.out.print("Enter the value3 = ");
        int value3 = sc.nextInt();

        //Checking for largest
        if (value1 > value2 && value1 > value3){
            System.out.println(value1 +" is largest");
        }else if(value2 > value1 && value2>value3){
            System.out.println(value2 +" is largest");
        } else if(value3>value1 && value3 > value2) {
            System.out.println(value3 +" is largest");
        }
    }
}

