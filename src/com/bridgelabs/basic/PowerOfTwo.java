
//3.Power of 2
// INTEGER: range from -2,147,483,647 to 2,147,483,647 for 9 or 10 digits of precision.
// The number 2,147,483,648 is a reserved value and cannot be used.
//2^31 cross = 2147483648
//2^30 in limit = 1073741824


package com.bridgelabs.basic;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the limit:");
            int N = sc.nextInt();

            int temp = 2; //power of 2 is calculated

            if(N >= 1 && N <= 31){
                for(int i=1; i<=N; i++){
                    int result = (int)Math.pow(temp, i);
                    System.out.println("2^"+i+" = " +result);
                }
            }else{
                System.out.println("!!! [2^32] The number 2,147,483,648 is a reserved. Crossing Integer limit !!!");
            }

        }
    }
