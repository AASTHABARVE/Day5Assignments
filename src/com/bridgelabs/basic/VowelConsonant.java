package com.bridgelabs.basic;

public class VowelConsonant {
    //9. Java Program to Check Whether an Alphabet is Vowel or Consonant

        public static void main(String[] args) {
            char value = 'z';

            if(value=='a' || value=='e' || value=='i' || value=='o' || value=='u'){
                System.out.println(value + " is Vowel");
            }else{
                System.out.println(value + " is Consonant");
            }
        }
    }