package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number){
       number = Math.abs(number);
       int orgNumber = number;
       int reversedNumber = 0;

       while(number > 0){
           int digit = number % 10;
           reversedNumber = reversedNumber * 10 + digit;
           number %= 10;
       }

       return orgNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

        public static String numberToWords(int number) {

            if (number < 0) {
                return "Invalid Value";
            }

            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

            StringBuilder result = new StringBuilder();

            while (number > 0) {
                int digit = number % 10;
                result.insert(0, words[digit] + " ");
                number /= 10;
            }

            return result.toString().trim();
        }
}

public static String numberToWords( )