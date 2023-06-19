package com.Calaculator.Sub;

import com.Calaculator.Calculator;

public class Subtraction implements Calculator {
	public void calculate(int a, int b) {
        System.out.println("Subtraction Result: " + (a - b));
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Subtraction Result: " + (a - b - c));
}
}
