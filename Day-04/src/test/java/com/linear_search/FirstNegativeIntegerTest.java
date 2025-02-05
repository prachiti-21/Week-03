package com.linear_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNegativeIntegerTest {
   @Test
    void firstNegativeIndexEquals2(){
       var FirstNegativeInteger=new FirstNegativeInteger();
       FirstNegativeInteger.findFirstNegativeInteger(new int[]{1,2,-1,3,5,-9});
       assertEquals(2,FirstNegativeInteger.findFirstNegativeInteger(new int[]{1,2,-1,3,5,-9}));
    }
}