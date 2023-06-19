package mini_calculator;

public class Substract implements Calculation
{

	@Override
	public void calculate(int a, int b) {
		System.out.println("substract result of two number"+(a-b));
		
	}

	@Override
	public void calculate(int a, int b, int c) {
		System.out.println("substract result of three number"+(a-b-c));
		
	}
  
}
