package com.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotationPointTest {
    @Test
  void rotationPointEquals2(){
      var RotationPoint=new RotationPoint();
      RotationPoint.findRotationPoint(new int[]{2,4,6,8,10});
      assertEquals(2,RotationPoint.findRotationPoint(new int[]{2,4,6,8,10}));
  }
}