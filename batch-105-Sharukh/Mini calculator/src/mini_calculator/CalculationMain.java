package mini_calculator;

import java.util.Scanner;

public class CalculationMain {

	public static void main(String[] args) 
	{
		
		while(true)
		{
	  System.out.println("Select calculation type");
	  System.out.println("+ for addition");
	  System.out.println("- for substration");
	  System.out.println("* for multiplication");
	  System.out.println("/ for division");
	  
	  Scanner sc = new Scanner(System.in);
	  char type =sc.next().charAt(0);
	  
	  System.out.println("Calculation only for two or three number possible");
	  
	  int val = sc.nextInt();
	  
	  Calculation cl;
	  
	  switch(type)
	  {
	  case '+':
		  cl=new Add();
		  break;
		  
	  case '-':
		  cl= new Substract();
		  break;
	 
	  case '*':
		  cl =new Multiplication();
		  break;
		  
	  case '/':
		  cl = new division();
		  break;
		  
		  default:
			  System.out.println("please enter valid symbol");
			  return;
	  }
	  
	  if(val==2)
	  {
		  System.out.println("enter two number");
		  int a =sc.nextInt();
		  int b = sc.nextInt();
		  
		  cl.calculate(a, b);
	  }
	  else if(val==3)
	  {
		  System.out.println("enter three number");
		  int a =sc.nextInt();
		  int b = sc.nextInt();
		  int c = sc.nextInt();
		  
		  cl.calculate(a, b, c);
	  }
	  else
	  {
		  System.out.println("invilid valueS");
	  }
		}
		

	}

}
