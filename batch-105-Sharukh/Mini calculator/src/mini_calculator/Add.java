package mini_calculator;

public class Add implements Calculation
{

	@Override
	public void calculate(int a, int b) {
		System.out.println("Addition result of two number"+(a+b));
		
	}

	@Override
	public void calculate(int a, int b, int c) {
		System.out.println("Addition result of three number"+(a+b+c));
		
	}
 
}
