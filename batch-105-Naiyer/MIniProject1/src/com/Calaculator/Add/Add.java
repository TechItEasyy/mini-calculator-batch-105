package com.Calaculator.Add;

import com.Calaculator.Calculator;

public class Add implements Calculator {
	public void calculate(int a, int b) {
        System.out.println("Addition Result: " + (a + b));
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Addition Result: " + (a + b + c));
    }
}
