package com.Calaculator.div;

import com.Calaculator.Calculator;

public class Division implements Calculator {
	 public void calculate(int a, int b) {
	        try {
	        	if(b==0) {
	        		System.out.println("Error: Cannot divide by zero!");
	        	}
	            double result = (double) a / b;
	            System.out.println("Division:" + result);
	        	}
	        	catch (ArithmeticException e)
	        	{
	            System.out.println("Error: Cannot divide by zero!");
	        }
	        }
	@Override
	public void calculate(int a, int b, int c) {
		System.out.println("Division operation is not supported for three numbers.");
		
	}
}
