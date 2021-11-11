package com.bridgelabz.hashtables;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashMapTest {
    @Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        Assert.assertEquals(2, frequency);
    }
}