package com.calculator;

public class Multiply implements Calculation{

	@Override
	public void calculate(int a, int b) {
		System.out.println("multiplication result = "+(a*b));
	}

	@Override
	public void calculate(int a, int b, int c) {
		System.out.println("multiplication result = "+(a*b*c));
	}
	
	

}
