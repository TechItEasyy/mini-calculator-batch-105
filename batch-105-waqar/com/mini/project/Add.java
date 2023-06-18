package com.mini.project;

public class Add implements CalculateTwoNumber, CalculateThreeNumber {

	@Override
	public int calculate(int a, int b, int c) {
		int add;
		add = a + b + c;
		return add;
	}

	@Override
	public int calculate(int a, int b) {
		int add;
		add = a + b;
		return add;
	}
	

}
