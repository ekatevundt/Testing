package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        HashSet<String> listOfWords = new HashSet<>();
        String[] words = text.split("\\P{IsAlphabetic}+");
        listOfWords.addAll(Arrays.asList(words));

        System.out.println(listOfWords.contains(word));
        return listOfWords.contains(word);


    }

    public String addText(String word) {
        StringBuilder sb = new StringBuilder(this.text);
        return String.valueOf(sb.append(word));
    }
}