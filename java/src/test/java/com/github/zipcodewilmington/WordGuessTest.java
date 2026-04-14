package com.github.zipcodewilmington;

/**
 * @author xt0fer
 * @version 2.0.0
 * @date 2/5/2026
 */

public class WordGuessTest {

    public void testBuildEmptyGuesses() {
        char[] guesses = WordGuess.buildEmptyGuesses(4);
        assertEquals(4, guesses.length);
        for (char c : guesses) {
            assertEquals('_', c);
        }
    }

    public void testIsWordGuessed_false() {
        WordGuess.playerGuesses = new char[] { '_', '_', '_' };
        assertFalse(WordGuess.isWordGuessed());
    }

    public void testIsWordGuessed_true() {
        WordGuess.playerGuesses = new char[] { 'c', 'a', 't' };
        assertTrue(WordGuess.isWordGuessed());
    }

    public void testProcessLetter_correctGuess() {
        WordGuess.solution = "cat".toCharArray();
        WordGuess.playerGuesses = new char[] { '_', '_', '_' };
        WordGuess.triesLeft = 3;

        WordGuess.processLetter('c');

        assertEquals('c', WordGuess.playerGuesses[0]);
        assertEquals(3, WordGuess.triesLeft); // tries should NOT decrease
    }

    public void testProcessLetter_wrongGuess() {
        WordGuess.solution = "cat".toCharArray();
        WordGuess.playerGuesses = new char[] { '_', '_', '_' };
        WordGuess.triesLeft = 3;

        WordGuess.processLetter('z');

        assertEquals(2, WordGuess.triesLeft); // tries should decrease
    }

    public void testProcessLetter_multipleOccurrences() {
        WordGuess.solution = "loop".toCharArray();
        WordGuess.playerGuesses = new char[] { '_', '_', '_', '_' };
        WordGuess.triesLeft = 4;

        WordGuess.processLetter('o');

        assertEquals('o', WordGuess.playerGuesses[1]);
        assertEquals('o', WordGuess.playerGuesses[2]);
        assertEquals(4, WordGuess.triesLeft); // tries should NOT decrease
    }

    public void testPickRandomWord() {
        String word = WordGuess.pickRandomWord();
        assertNotNull(word);
        assertTrue(word.length() > 0);
    }
}