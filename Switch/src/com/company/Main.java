package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 3) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Vale is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4 : case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
        }

        char newChar = 'Z';
        switch(newChar){
            case 'A':
                System.out.println("It was an A");
                break;
            case 'B': case 'C': case 'D': case 'E':
                System.out.println( "It was a " + newChar);
                break;
            default:
                System.out.println( newChar + " was not found");
                break;
        }
    }
}
