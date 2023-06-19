package com.day14;

public class MultiplyNumber implements Calculator
{
	public int calculate(int a , int b) {
		int mult;
		mult = a * b;
		return mult;
	}
	
	public int calculate(int a, int b, int c) {
	    int mult;
	    mult = a * b * c;
	    return mult;

}
}