package mini_calculator;

public class Multiplication implements Calculation
{

	@Override
	public void calculate(int a, int b) {
		System.out.println("multiplication result of two number"+(a*b));
		
	}

	@Override
	public void calculate(int a, int b, int c) {
		System.out.println("multiplication result of three number"+(a*b*c));
		
	}
 
}
