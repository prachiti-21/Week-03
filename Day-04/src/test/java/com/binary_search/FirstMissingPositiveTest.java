package com.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {
   @Test
    void firstMissingPositiveReturns2(){
       var FirstMissingPositive= new FirstMissingPositive();
       var i= FirstMissingPositive.firstMissingPositive(new int[] {3, 4, -1, 1});
       assertEquals(2,i);
   }
}