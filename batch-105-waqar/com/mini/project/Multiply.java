package com.mini.project;

public class Multiply implements CalculateTwoNumber, CalculateThreeNumber {

	@Override
	public int calculate(int a, int b, int c) {
		int mul;
		mul = a * b * c;
		return mul;
	}

	@Override
	public int calculate(int a, int b) {
		int mul;
		mul = a * b;
		return mul;
	}

}
