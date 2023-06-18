package com.mini.project;

import java.util.Scanner;

public class InterfaceMain {

	public static void main(String[] args) {
		   Multiply mulObj = new Multiply();
	        Add addObj = new Add();
	        Subtract subObj = new Subtract();
	        Divide divObj = new Divide();

	        System.out.println("Welcome to our mini project");
	        System.out.println();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("What type of calculation do you want?");
	        System.out.println("1. AdditionOfTwoNum");
	        System.out.println("2. AdditionOfThreeNum");
	        System.out.println("3. Subtraction");
	        System.out.println("4. Division");
	        System.out.println("5. MultiplicationOfTwoNum");
	        System.out.println("6. MultiplicationOfThreeNum");
	        String calculationType = sc.next();

	        int a = 0;
	        int b = 0;
	        int c = 0;
	        
	        if (calculationType.equals("1") || calculationType.equals("3") || calculationType.equals("4") || calculationType.equals("5")) {
	            System.out.println("Enter number a:");
	              a = sc.nextInt();
	            System.out.println("Enter number b:");
	              b = sc.nextInt();
	        }
	        
	        else { 
	        	System.out.println("Enter number a:");
	             a = sc.nextInt();
	            System.out.println("Enter number b:");
	              b = sc.nextInt();
	        	System.out.println("Enter number c:");
	              c = sc.nextInt();
	        }
	        try {
	            switch (calculationType) {
	                case "1":
	                    System.out.println("The result is: " + addObj.calculate(a, b));
	                    break;
	                case "2":
	                    System.out.println("The result is: " + addObj.calculate(a, b, c));
	                    break;
	                case "3":
	                    System.out.println("The result is: " + subObj.calculate(a, b));
	                    break;
	                case "4":
	                    System.out.println("The result is: " + divObj.calculate(a, b));
	                    break;
	                case "5":
	                    System.out.println("The result is: " + mulObj.calculate(a, b));
	                    break;
	                case "6":
	                    System.out.println("The result is: " + mulObj.calculate(a, b, c));
	                    break;
	            }
	        } catch (ArithmeticException e) {
	            System.out.println("Hey, you cannot divide any number by zero!");
	        }
	    }
	}