package com.programs;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
    
    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        // 1 and numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, num is not prime
            }
        }
        
        return true; // If not divisible by any number, num is prime
    }
}