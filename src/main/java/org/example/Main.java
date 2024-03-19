package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int orgNumber = number;
        int reverse = 0;
        while(number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        return orgNumber == reverse;
    }

    public static boolean isPerfectNumber(int number) {
      int sumOfDivisors = 0;
      for (int i=1; i < number; i++){
          if ((number % i) == 0) {
              sumOfDivisors += number;
          }
      }
      return sumOfDivisors == number;
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
