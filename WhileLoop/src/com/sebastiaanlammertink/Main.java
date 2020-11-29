package com.sebastiaanlammertink;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int countEvenNumbers = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            countEvenNumbers++;
            if (countEvenNumbers >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found is " + countEvenNumbers);

        System.out.println("--------------------------------------");
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("--------------------------------------");
        for (int i = 1; i != 6; i++) {
            System.out.println("Count value is " + i);
        }
        System.out.println("--------------------------------------");
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("--------------------------------------");
        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;

        } while (count != 6);


    }


    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}

