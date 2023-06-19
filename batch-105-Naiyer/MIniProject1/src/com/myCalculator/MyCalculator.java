package com.myCalculator;

import java.util.Scanner;

import com.Calaculator.Calculator;
import com.Calaculator.Add.Add;
import com.Calaculator.Sub.Subtraction;
import com.Calaculator.div.Division;
import com.Calaculator.mul.Multiply;

public class MyCalculator {

	public static void main(String[] args) {
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Select an operation:");
		        System.out.println("1. Addition");
		        System.out.println("2. Subtraction");
		        System.out.println("3. Multiplication");
		        System.out.println("4. Division");
		        int operation = scanner.nextInt();

		        System.out.println("Enter the number of operands (2 or 3):");
		        int numOperands = scanner.nextInt();

		        System.out.println("Enter the First Number:");
		        int a = scanner.nextInt();
		        System.out.println("Enter the Second Number:");
		        int b = scanner.nextInt();
		        int c = 0;

		        if (numOperands == 3) {
		            System.out.println("Enter the third Number:");
		            c = scanner.nextInt();
		        }

		        Calculator calculation;

		        switch (operation) {
		            case 1:
		                calculation = new Add();
		                break;
		            case 2:
		                calculation = new Subtraction();
		                break;
		            case 3:
		                calculation = new Multiply();
		                break;
		            case 4:
		                calculation = new Division();
		                break;
		            default:
		                System.out.println("Invalid operation!");
		                return;
		        }

		        if (numOperands == 2) {
		            calculation.calculate(a, b);
		        } else if (numOperands == 3) {
		            calculation.calculate(a, b, c);
		        } else {
		            System.out.println("Invalid number of operands!");
		        }
			}

			}

	}
