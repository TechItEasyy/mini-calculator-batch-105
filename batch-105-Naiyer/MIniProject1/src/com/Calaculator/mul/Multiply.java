package com.Calaculator.mul;

import com.Calaculator.Calculator;

public class Multiply implements Calculator {
	public void calculate(int a, int b) {
        System.out.println("Multiplication Result: " + (a * b));
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Multiplication Result: " + (a * b * c));
    }
}
