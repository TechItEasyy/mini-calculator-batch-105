package com.calculator;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		while(true)
		{
	System.out.println("select special symbol for calculation. types are :");
	System.out.println("+ for addition");
	System.out.println("- for subtraction");
	System.out.println("* for multiplication");
	System.out.println("/ for division");
	Scanner sc=new Scanner(System.in);
	char type=sc.next().charAt(0);
	System.out.println(" select only two or three number and calculate");
	int val=sc.nextInt();
	addition ad=new addition();
	Subtraction sub=new Subtraction();
	Multiply mul=new Multiply();
	Division div=new Division();
	switch(type)
	{
	case '+':
		//addition ad=new addition();
		//System.out.println(ad);
		break;
	case '-':
		//Subtraction sb=new Subtraction();
		//System.out.println(sub);
		break;
	case '*':
	//Multiply ml=new Multiply();
		//System.out.println(mul);
	break;
	case '/':
		//Division dv=new  Division();
		//System.out.println(div);
		break;
		default:
			System.out.println("enter valid symbol");
		return;
	}
	if(val==2)
	{
		System.out.println(" enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ad.calculate(a, b);
	}
	else if(val==2)
	{
		System.out.println(" enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sub.calculate(a, b);
		
	}
	else if(val==2)
	{
		System.out.println(" enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		mul.calculate(a, b);
		
	}
	else if(val==2)
	{
		System.out.println(" enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		div.calculate(a, b);
		
	}
		else if(val==3)
		{
			System.out.println(" enter three number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			ad.calculate(a, b, c);
			
		}
		else if(val==3)
		{
			System.out.println(" enter three number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			sub.calculate(a, b, c);
			
		}
		else if(val==3)
		{
			System.out.println(" enter three number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			mul.calculate(a, b, c);
			
		}
		else if(val==3)
		{
			System.out.println(" enter three number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			div.calculate(a, b, c);
			
		}
		}
	}
	}
	


