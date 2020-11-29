package com.sebastiaanlammertink;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i < number; i++) {
            int mod = number % i;
            if (mod == 0) {
                System.out.println(i);
            }
        }
    }
}


