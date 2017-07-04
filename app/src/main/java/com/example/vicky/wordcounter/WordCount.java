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

    public int countWords(String sentence) {
        if (sentence == null)
            return 0;
        return sentence.trim().split("").length;
    }

}