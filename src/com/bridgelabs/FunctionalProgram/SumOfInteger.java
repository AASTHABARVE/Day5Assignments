//Sum of three Integer adds to ZERO
//a. Desc -> A program with cubic running time. Read in N integers and counts the
//number of triples that sum to exactly 0.
//b. I/P -> N number of integer, and N integer input array
//c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
//d. O/P -> One Output is number of distinct triplets as well as the second output is to
//print the distinct triplets.
package com.bridgelabs.FunctionalProgram;

public class SumOfInteger{
    public static void main(String[] args) {
        int arrayData[] = {1,1,-2,-1,0,-2,5,-5};
        boolean flag = false;

        for(int i=0; i<arrayData.length-2; i++){
            for(int j=i+1; j<arrayData.length-1; j++){
                for(int k=j+1; k<arrayData.length; k++){
                    if(arrayData[i] + arrayData[j] + arrayData[k] == 0){
                        System.out.println(arrayData[i] +"+"+ arrayData[j] +"+"+ arrayData[k] +"== 0");
                        flag = true;
                    }
                }
            }
        }
        if(flag = false)
            System.out.println("Combination not exists");
    }
}

