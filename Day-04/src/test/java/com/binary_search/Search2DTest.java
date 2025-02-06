package com.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2DTest {
  @Test
    void Search2DreturnsTrue(){
      var Search2D= new Search2D();
      Search2D.search(new int[][]{{1,2,3},{4,5,6},{7,8,9}},3,3,2);
      assertEquals(true, Search2D.search(new int[][]{{1,2,3},{4,5,6},{7,8,9}},3,3,2));

  }
}