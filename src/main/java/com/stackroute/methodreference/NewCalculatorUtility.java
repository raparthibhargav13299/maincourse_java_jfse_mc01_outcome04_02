package com.stackroute.methodreference;

import java.util.function.BiFunction;

/* Complete the class as per the requirements given in PROBLEM.md */
public class NewCalculatorUtility extends CalculatorUtility {
    @Override
    public double compute(int num1,int num2)
    {
        return Math.pow(num1,num2);

    }
    public double getPowerResult(int a,int b)
    {
        BiFunction<Integer,Integer,Double> cs=this::compute;
        return cs.apply(a,b);
    }
    public double getProductResult(int a,int b)
    {
        BiFunction<Integer,Integer,Double> cse=NewCalculatorUtility.super::compute;
        return cse.apply(a,b);
    }
}
