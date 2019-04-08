package com.credits.service.Check;

import org.junit.*;

import static junit.framework.TestCase.*;

public class CheckValuesTest {

    @Test
    public void shouldReturnTrueIfPositive(){
        assertTrue(CheckValues.checkPositive(10));
    }

    @Test
    public void shouldReturnFalseIfPositive(){
        assertFalse(CheckValues.checkPositive(-10));
    }

    @Test
    public void shouldReturnFalseIfZero(){
        assertFalse(CheckValues.checkPositive(0));
    }

    @Test
    public void shouldReturnTrueIfNumberLowerThanLimit(){
        assertTrue(CheckValues.checkLowerThanLimit(10, 20));
    }
    @Test
    public void shouldReturnTrueIfNumberEqualLimit(){
        assertTrue(CheckValues.checkLowerThanLimit(10, 10));
    }
    @Test
    public void shouldReturnFalseIfNumberGraterThanLimit(){
        assertFalse(CheckValues.checkLowerThanLimit(10, 5));
    }
}