package org.example;

import org.junit.*;

public class CarTest {
    Car car;
    private static final double DELTA = 1e-15;
    @Before
    public void setUp() {
        car = new Car(26, 20);

    }

    @Test
    public void testToString(){
        Assert.assertEquals("Exercise3{mileage=26, gas=20.0}",car.toString());
    }

    @Test
    public void testSetGas(){
        Assert.assertEquals(20,car.getGas(),DELTA);
        car.setGas(50);
        Assert.assertEquals(50, car.getGas(), DELTA);
    }

    @Test
    public void testGetGas(){
        Assert.assertEquals(20,car.getGas(),DELTA);
    }

    public void testSetMileage(){
        Assert.assertEquals(26,car.getMileage(),DELTA);
        car.setMileage(32);
        Assert.assertEquals(32, car.getMileage(), DELTA);
    }

    @Test
    public void testGetMileage(){
        Assert.assertEquals(26,car.getMileage(),DELTA);
    }

    @Test
    public void testFill(){
        car.fill(2);
        car.fill(3);
        Assert.assertEquals(25,car.getGas(),DELTA);
    }

    @Test
    public void testDriveWithEnough(){
        Assert.assertEquals(13,car.drive(13));
        Assert.assertEquals(19.5,car.getGas(),DELTA);
    }

    @Test
    public void testDriveWithoutEnough(){
        Assert.assertEquals(520,car.drive(1300));
        Assert.assertEquals(0,car.getGas(),DELTA);
    }

    @After
    public void cleanUp() {

    }
}
