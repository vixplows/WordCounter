package com.example.vicky.wordcounter;

/**
 * Created by vicky on 04/07/2017.
 */

public class WordCount {
   private String sentence;

    public WordCount(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return this.sentence;
    }

    public int countWords() {
        String sentence = this.sentence;
        String trim = sentence.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }
}