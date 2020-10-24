package com.SebastiaanLammertink;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + highScore );
        System.out.println("Your final score was: " + calculateScore(true, 800, 5, 100));
        System.out.println("Your final score was: " + calculateScore(true, 10000, 8, 200));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }

    }
}
