package com.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastOccurenceTest {
 @Test
    void firstOccurenceReturns5(){
     var FirstAndLastOccurence= new FirstAndLastOccurence();
     var i = FirstAndLastOccurence.firstOccurance(new int[]{1, 2, 3, 4, 3, 5, 5, 5, 6}, 5);
     assertEquals(5, i);
 }
 @Test
   void lastOccurenceReturns7(){
     var FirstAndLastOccurence= new FirstAndLastOccurence();
     var i=FirstAndLastOccurence.lastOccurance(new int[]{1,2,3,4,3,5,5,5,6},7);
     assertEquals(7,i);
   }
}