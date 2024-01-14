package org.example;


import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualsFour() {
        //create calculator
        SimpleCalculator calculator = new SimpleCalculator();
        //make 2+2
        //check that the result is 4
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void tenPlusTwoEqualsTwelve() {
        //create calculator
        SimpleCalculator calculator = new SimpleCalculator();
        //make 2+2

        //check that the result is 4
        assertEquals(12, calculator.add(10,2));

    }

    @Test
    public void testDivisionByZero() {
        SimpleCalculator calculator = new SimpleCalculator();
        // We expect an ArithmeticException to be thrown when dividing by zero
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /*@Test
    public void testDivisionByZeroNoException() {
        SimpleCalculator calculator = new SimpleCalculator();
        // We expect an ArithmeticException to be thrown when dividing by zero
        assertDoesNotThrow(ArithmeticException.class, );
    }*/






}