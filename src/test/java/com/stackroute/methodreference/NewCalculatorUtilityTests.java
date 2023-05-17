package com.stackroute.methodreference;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* Write test cases for positive and negative scenarios*/
public class NewCalculatorUtilityTests {
    NewCalculatorUtility newCalculatorUtility;

    @BeforeEach
    public void setUp() throws Exception {
        newCalculatorUtility = new NewCalculatorUtility();
    }
    @AfterEach
    public void tearDown(){
        newCalculatorUtility=null;
    }

    @Test
    public void givenTwoIntegersWhenMultiplyThenShouldReturnProduct() {
        assertEquals( 20.0, newCalculatorUtility.getProductResult(5, 4), 1e-1);
        assertEquals( 25.0, newCalculatorUtility.getProductResult(5, 5), 1e-1);


    }
    @Test
    public void TwoIntegerReturnPower() {
        assertEquals( 64.0, newCalculatorUtility.getPowerResult(4, 3), 1e-1);
        assertEquals( 3125.0, newCalculatorUtility.getPowerResult(5, 5), 1e-1);
    }
    //for negative test cases
    @Test
    public void  TwoIntegerReturnPowerFail()
    {
        assertNotEquals(25,newCalculatorUtility.getPowerResult(5,5));
        assertNotEquals( 56,newCalculatorUtility.getPowerResult(6,9));

    }
    @Test
    public void twoIntegerReturnProductFail()
    {
        assertNotEquals(56,newCalculatorUtility.getProductResult(8,8));
        assertNotEquals(100,newCalculatorUtility.getProductResult(9,8));
    }
    @Test
    public void GivenStringAsNullThenReturnEmptyString()
    {
        String expected="";
        assertThrows(NullPointerException.class,()->newCalculatorUtility.getProductResult(0,0));

    }
}








