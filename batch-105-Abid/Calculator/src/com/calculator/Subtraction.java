package com.calculator;

public class Subtraction implements Calculation{

	@Override
	public void calculate(int a, int b) {
		System.out.println("subtraction result = "+(a-b));
		}

	@Override
	public void calculate(int a, int b, int c) {
		System.out.println("subtraction result = "+(a-b-c));
	}
	

}
