package com.Junit5_Project.TestConfig;

import com.Junit5_Project.junitconfig.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
//    Calculator calculator = new Calculator();
//
//    @Test
//    public  void  test_add(){
//
////        Calculator calculator = new Calculator();
//       int actualValue= calculator.add(15,5);
//        int expectedValue= 20;
//        assertEquals(expectedValue,actualValue);
//
//    }
//
//    @Test
//    public  void  test_mul(){
//      //  Calculator calculator = new Calculator();
//        int actualValue = calculator.mul(2,7);
//        int expectedValue=14;
//        assertEquals(expectedValue,actualValue);
//    }

    Calculator calculator = null;


    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @AfterEach
    public void destroy() {
        calculator = null;
    }

    @Test
    public void test_add() {
        int actualValue = calculator.add(15, 5);
        int expectedValue = 20;
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void test_mul() {
        int actualValue = calculator.mul(2, 7);
        int expectedValue = 14;
        assertEquals(expectedValue, actualValue);

    }
}