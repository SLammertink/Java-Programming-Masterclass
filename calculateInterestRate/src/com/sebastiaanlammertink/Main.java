package com.sebastiaanlammertink;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println(" 10000 at an interest rate of " + i + "% is: " + String.format("%.2f", calculateInterestRate(10000.0, i)));

        }

        System.out.println(" ");

        for (int i = 8; i > 1; i--) {
            System.out.println(" 10000 at an interest rate of " + i + "% is: " + String.format("%.2f", calculateInterestRate(10000.0, i)));
        }

        System.out.println(" ");
        int count = 0;
        for (int n = 10; n < 50; n++) {

            if (isPrime(n)) {
                count++;
                System.out.println("Prime number found: " + n);
                if (count == 10) {
                    System.out.println("Exiting the FOR-loop");
                    break;
                }
            }
        }


    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterestRate(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
