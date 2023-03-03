package org.example;

import org.junit.*;
import java.util.*;

public class MathTest {
    Math mathClass;
    private static final double DELTA = 1e-5;

    @Before
    public void setUp(){
        mathClass = new Math();

    }

    @Test
    public void testGCFSmallerX(){
        Assert.assertEquals(3199, mathClass.GCF(9597,22393));

    }
    @Test
    public void testGCFLargerX(){
        Assert.assertEquals(3199, mathClass.GCF(22393,9597));

    }

    @Test
    public void testAreaRectangle(){
        Assert.assertEquals(2048, mathClass.areaRectangle(64,32));
    }

    @Test
    public void testAreaTriangle(){
        Assert.assertEquals(192, mathClass.areaTriangle(16,24),DELTA);
    }

    @Test
    public void testAreaCircle(){
        Assert.assertEquals(452.38934, mathClass.areaCircle(12),DELTA);
    }

    @Test
    public void testFactorial(){
        Assert.assertEquals(40320, mathClass.factorial(8));
    }

    @Test
    public void testFactorialZero(){
        Assert.assertEquals(1,mathClass.factorial(0));
    }


}
