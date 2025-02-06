package com.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void searchReturns3() {
        var BinarySearch = new BinarySearch();
        var i = BinarySearch.search(new int[]{3, 2, 6, 10, 5, 7}, 6);
        assertEquals(3, i);
    }
}