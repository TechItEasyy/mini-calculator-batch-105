package mini_calculator;

public class division implements Calculation 
{

	@Override
	public void calculate(int a, int b) {
		
		
		try
		{
			System.out.println("division result of two number"+(a/b)); 	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void calculate(int a, int b, int c) {
	
		
		try
		{
			System.out.println("division result of three number"+(a/b/c));	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
  
}
