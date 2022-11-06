package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsCheckerTest {
    @Test
    void wordCheckedTrue() {
        WordsChecker wordsChecker = new WordsChecker("text tert tefxt");
        assertTrue(wordsChecker.hasWord("text"));
    }

    @Test
    void wordCheckedFalse() {
        WordsChecker wordsChecker = new WordsChecker("text tert tefxt");
        assertFalse(wordsChecker.hasWord("xxx"));
    }

    @Test
    void wordAdded() {
        WordsChecker wordsChecker = new WordsChecker("text");
        assertEquals("text current", wordsChecker.addText(" current"));
    }
}