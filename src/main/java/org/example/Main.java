package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isPalindrome(121);
    }

        public static boolean isPalindrome(int number){

           int reversed = 0;
           int original = number;

           while(number > 0) {

               int digit = number % 10;
               reversed = reversed * 10 + digit;
               number = number / 10;
           }

           return original == reversed;

        }


        public static boolean isPerfectNumber(int number){

        if(number < 0) return false;

        int total = 0;

        for(int i=1; i <= number/2; i++){

           if(number % i == 0){
               total += i;
           }
        }

            return number == total;
        }


        public static String numberToWords(int number){

            if(number < 0 ) return "Invalid Value";

           char[] strNumbers = String.valueOf(number).toCharArray();
           String text = "";

           for(char digit:strNumbers){

               switch (digit){
                   case '0':
                       text += "Zero ";
                       break;
                   case '1':
                       text += "One ";
                       break;
                   case '2':
                       text += "Two ";
                       break;
                   case '3':
                       text += "Three ";
                       break;

                   case '4':
                       text += "Four ";
                       break;
                   case '5':
                       text += "Five ";
                       break;
                   case '6':
                       text += "Six ";
                       break;
                   case '7':
                       text += "Seven ";
                       break;
                   case '8':
                       text += "Eight ";
                       break;
                   case '9':
                       text += "Nine ";
                       break;

               }

           }

            return text.trim();
        }


}
