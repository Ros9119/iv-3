package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }

    @Test
    void add() {
        int result=calculator.add(2,3);
        assertEquals(5,result);
    }

    @Test
    void subtract() {
        int result=calculator.subtract(5,3);
        assertEquals(2,result);

    }

    @Test
    void multiple() {
        int result=calculator.multiple(2,3);
        assertEquals(6,result);
    }

    @Test
    void divide() {
        int result=calculator.divide(2,2);
        assertEquals(1,result);
    }
}