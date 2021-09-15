package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: constructor sets gasTankLevel properly

    Car test_car;
    int gas_tank_size;

    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
        gas_tank_size = test_car.getGasTankSize();
    }

    @Test
    public void testInitialGasTank(){
        assertEquals(10, gas_tank_size,.001);
    }

    @Test
    public void testInitialGasTankFalse(){
        assertFalse(gas_tank_size == 0);
    }

    @Test
    public void testInitialGasTankTrue(){
        assertTrue(gas_tank_size == 10);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void gasTankLevelAccuracyUnderTankRange(){
        test_car.drive(50);

        double currentGasTankLevel = test_car.getGasTankLevel();
        assertEquals(9, currentGasTankLevel, .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void gasTankLevelAccuracyOverTankRange(){
        test_car.drive(600);

        double currentGasTankLevel = test_car.getGasTankLevel();
        assertEquals(0, currentGasTankLevel, .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        test_car.addGas(10);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }


}
