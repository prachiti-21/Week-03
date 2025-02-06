package com.linear_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchSpecificWordTest {
    @Test
    void FirstSentenceIsHelloEveryone(){
        var SearchSpecificWord=new SearchSpecificWord();
        SearchSpecificWord.findSpecificWord(new String[]{"I am Prachiti","Hello everyone","I am great!"},"Hello");
        assertEquals("Hello everyone",SearchSpecificWord.findSpecificWord(new String[]{"I am Prachiti","Hello everyone","I am great!"},"Hello"));
        //assertEquals(" heheh",SearchSpecificWord.findSpecificWord(new String[]{"I am Prachiti","Hello everyone","I am great!"},"Hello"));


    }

}