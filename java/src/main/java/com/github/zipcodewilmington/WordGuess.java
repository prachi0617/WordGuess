package com.github.zipcodewilmington;

import java.util.Scanner;

public class WordGuess {

    static String[] wordList = { "cat", "dog", "java", "code", "loop", "dark", "ship", "frog" };
    static char[] solution;
    static char[] playerGuesses;
    static int triesLeft;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String playAgain = "yes";

        while (playAgain.equals("yes")) {
            setupGame();
            playGame();
            System.out.println("Would you like to play again? (yes/no) ");
            playAgain = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println("Game Over.");
        scanner.close();
    }

    static void setupGame() {
        String word = pickRandomWord();
        solution = word.toCharArray();
        playerGuesses = buildEmptyGuesses(solution.length);
        triesLeft = solution.length;
        System.out.println("Let's Play Wordguess game");
    }

    static String pickRandomWord() {
        int index = (int) (Math.random() * wordList.length);
        return wordList[index];
    }

    static char[] buildEmptyGuesses(int length) {
        char[] guesses = new char[length];
        for (int i = 0; i < length; i++) {
            guesses[i] = '_';
        }
        return guesses;
    }

    static void playGame() {
        while (triesLeft > 0 && !isWordGuessed()) {
            printCurrentGuesses();
            System.out.println("You have " + triesLeft + " tries left.");
            System.out.println("Enter a single character: ");

            String input = scanner.nextLine().trim();

            if (input.equals("-"))
                break;
            if (input.isEmpty())
                continue;

            char letter = input.charAt(0);
            processLetter(letter);
        }

        printResult();
    }

    static void processLetter(char letter) {
        boolean found = false;
        for (int i = 0; i < solution.length; i++) {
            if (solution[i] == letter) {
                playerGuesses[i] = letter;
                found = true;
            }
        }
        if (!found) {
            triesLeft--;
        }
    }

    static boolean isWordGuessed() {
        for (char c : playerGuesses) {
            if (c == '_')
                return false;
        }
        return true;
    }

    static void printCurrentGuesses() {
        System.out.println("Current Guesses: ");
        for (char c : playerGuesses) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    static void printResult() {
        if (isWordGuessed()) {
            printCurrentGuesses();
            System.out.println("Congratulations, You Won!");
        } else {
            printCurrentGuesses();
            System.out.println("You Lost! You ran out of guesses.");
        }
    }
}