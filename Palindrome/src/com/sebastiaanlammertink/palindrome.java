package com.sebastiaanlammertink;

public class palindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int remainingNumber = number;

        while (remainingNumber != 0) {
            lastDigit = remainingNumber % 10;
            System.out.println("lastDigit: " + lastDigit);
            reverse = reverse * 10;
            System.out.println(reverse);
            reverse = reverse + lastDigit;
            System.out.println(reverse);
            remainingNumber = remainingNumber / 10;
            System.out.println(remainingNumber);

        }
        return number == reverse;
    }
}

