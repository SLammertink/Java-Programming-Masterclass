package com.sebastiaanlammertink;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int newNumber = 0;

        for ( int i = 1; i <= 1000; i ++){
            if ((i % 3 == 0) && ( i % 5 == 0 )){
                count ++;
                newNumber += i;
                System.out.println("Found :" + i);
            }
            if (count == 5){
                break;
            }
        }

        System.out.println("Sum = " + newNumber);
    }
}