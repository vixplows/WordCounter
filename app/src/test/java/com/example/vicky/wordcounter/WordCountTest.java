package com.example.vicky.wordcounter;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Created by vicky on 04/07/2017.
 */

public class WordCountTest {

    WordCount wordCount;

    @Before
    public void before() {
        wordCount = new WordCount("Well isn't this fun, fun, fun");
    }

    @Test
    public void testHasSentence() {
        assertEquals("Well isn't this fun, fun, fun", wordCount.getSentence());
    }

}




