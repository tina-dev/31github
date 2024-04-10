package com.java.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add(2, 3));
    }

}