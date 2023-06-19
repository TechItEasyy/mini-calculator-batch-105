package com.calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		while(true) {
		System.out.println("___________________select calculation type:_______________________");
		System.out.println("1 for addition");
		System.out.println("2 for subtraction");
		System.out.println("3 for multiplicatin");
		System.out.println("4 for division");	
		Scanner sc=new Scanner(System.in);
		int type=sc.nextInt();
		System.out.println("how many numbers have to be calculated but you can calculate only two or three number");
		System.out.println("_____________________________________________________________________________________________");
		int val=sc.nextInt();
		Calculation cal;
		switch(type)
		{
		case 1:
			 cal =new addition();
			break;
		case 2:
			cal=new Subtraction();
			break;
		case 3:
			cal=new Multiply();
			break;
		case 4:
			cal=new Division();
			break;
			default:
				System.out.println("enter valid");
				return;
		}
		
		if(val==2)
		{
			System.out.println("enter two number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			cal.calculate(a, b);
		}
		else if(val==3)
		{
			System.out.println("enter three number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			cal.calculate(a, b, c);
		}
		else
		{
			System.out.println("invalid value");
		}
	}
}
}


