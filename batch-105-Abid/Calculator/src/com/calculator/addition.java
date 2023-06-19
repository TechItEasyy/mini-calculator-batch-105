package com.calculator;

public class addition implements Calculation{

	@Override
	public void calculate(int a, int b) {
		System.out.println("addition result = "+(a+b));
	}

	@Override
	public void calculate(int a, int b, int c) {
		System.out.println("addition result = "+(a+b+c));
	}

}
