package com.calculator;

public class Division implements Calculation{

	@Override
	public void calculate(int a, int b) {
		try {
			System.out.println("division result = "+(a/b));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divided by zero cant not possible");
		}
	}

	@Override
	public void calculate(int a, int b, int c) {
		try
		{
			System.out.println("division result = "+((a/b)/c));
		}catch(ArithmeticException ae)
		{
			System.out.println("divided by zero cant not possible");
		}
			}
	

}
