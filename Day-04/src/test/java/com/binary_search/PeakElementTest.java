package com.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakElementTest {
@Test
    void peakElementEquals5(){
    var PeakElement=new PeakElement();
    PeakElement.findPeakElement(new int[]{2,4,3,5,1,6,7,8});
    assertEquals(5,PeakElement.findPeakElement(new int[]{2,4,3,5,1,6,7,8}));
}
}