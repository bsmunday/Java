package Assignment;

import java.util.Scanner;

public class LOOPING_STATEMENTS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		//----------------------------------------------------------------------//
		// Problem 1															//
		//----------------------------------------------------------------------//
		int tableNumber = 3;
		int tableSize   = 10;
		for (int i = 1; i <= tableSize; i++) {
			System.out.print(tableNumber + " X " + i + " = ");
			System.out.println(tableNumber * i);
		}
		
		//----------------------------------------------------------------------//
		// Problem 2															//
		//----------------------------------------------------------------------//
		int [] values = new int[10];
		sum = 0;
		int Average = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter value " + (i + 1) + ": ");
			values[i] = scan.nextInt();
			sum += values[i];
		}
		Average = sum / 10;
		System.out.println("Sum of all the numbers     = " + sum);
		System.out.println("Average of all the numbers = " + Average);
		
		//----------------------------------------------------------------------//
		// Problem 3															//
		//----------------------------------------------------------------------//
		System.out.print("Enter the month number: ");
		int month = scan.nextInt();
		int numberOfDays = 0;
		if (month < 1 || month > 12) {
			System.out.println("Invalid Details");
		}
		else {
			System.out.print("Number of Days: ");
			if (month == 2) {
				numberOfDays = 29;
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11) {
				numberOfDays = 30;
			} 
			else {
				numberOfDays = 31;
			}
		}
		for (int i = 1; i <= numberOfDays; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
	
		//----------------------------------------------------------------------//
		// Problem 4															//
		//----------------------------------------------------------------------//
		System.out.print("Enter the integer number: ");
		int n = scan.nextInt();
		sum = 0;
		// if n is positive
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				System.out.print(i + " ");
				sum += i;
			}
			System.out.println("\nsum of n natural numbers = " + sum);
		}
		// if n is negative
		else if (n < 0) {
			for (int i = n; i < 0; i++) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		} 
		// if n is 0
		else {
			System.out.println(0);
		}
		
		//----------------------------------------------------------------------//
		// Problem 5															//
		//----------------------------------------------------------------------//
		System.out.print("Enter the long type value: ");
		long userInput = scan.nextLong();
		sum = 0;
		int digit = 0;
		int numOfDigits = 0;
		
		System.out.print("Digits: ");
		while (userInput > 0) {
			digit =  (int) (userInput) % 10;
			sum += digit;
			userInput /= 10;
			System.out.print(digit + " ");
			numOfDigits++;
		}
		System.out.println("\nNumber of Digits = " + numOfDigits);
		System.out.println("Sum = " + sum);
		
		//----------------------------------------------------------------------//
		// Problem 6															//
		//----------------------------------------------------------------------//
		String[] position = {"first", "second", "third"};
		int[] numbers = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Input " + position[i] + " number: ");
			numbers[i] = scan.nextInt();
		}
		System.out.println("Output: \n");
		
		if (numbers[0] < numbers[1] && numbers[1] < numbers[2]) {
			System.out.println("INCREASING");
		}
		else if (numbers[0] > numbers[1] && numbers[1] > numbers[2]) {
			System.out.println("DECREASING");
		}
		else {
			System.out.println("Neither increasing or decreasing order");
		}
		//----------------------------------------------------------------------//
	}
}
