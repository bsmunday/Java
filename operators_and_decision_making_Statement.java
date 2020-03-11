package Assignment;

import java.util.Scanner;

public class operators_and_decision_making_Statement {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		//----------------------------------------------------------------------//
		// Problem 1															//
		//----------------------------------------------------------------------//
		/*boolean is_divis_by_three;
		boolean is_divis_by_five;	
		
		System.out.println("Enter a number: ");
		
		number = scan.nextInt();
		
		is_divis_by_three = (number % 3) == 0;
		is_divis_by_five  = (number % 5) == 0;
		
		if (is_divis_by_three) {
			System.out.print("Consultadd");
		}
		if (is_divis_by_five) {
			if (is_divis_by_three) {
				System.out.print(" ");
			}
			System.out.print("JAVA Training");
		}
		System.out.print("\n\n");*/

		//----------------------------------------------------------------------//
		// Problem 2															//
		//----------------------------------------------------------------------//
		/*int option, first, second, result = 0;
		
		do {
			System.out.println("Choose the following option first: ");
			System.out.println("-	Enter 1 - Addition");
			System.out.println("-	Enter 2 - Subtraction");
			System.out.println("-	Enter 3 - Division");
			System.out.println("-	Enter 4 - Multiplication");
			System.out.println("-	Enter 5 - Average");
			System.out.print("Option: ");
			option = scan.nextInt();
			System.out.println("Enter the 2 numbers seperated by spaces: ");
			
			first  = scan.nextInt();
			second = scan.nextInt();
			
			if (option == 1) { result = first + second; }
			if (option == 2) { result = first - second; }
			if (option == 3) { result = first / second; }
			if (option == 4) { result = first * second; }
			if (option == 5) { result = (first + second) / 2; }
			
			if (result < 0) {
				System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			} else {
				System.out.println("result = " + result);
			}
			
		} while (option != 5);*/
		
		//----------------------------------------------------------------------//
		// Problem 3															//
		//----------------------------------------------------------------------//
		/*int a = 60;
		int b = 120;
		int c = 180;
		
		int avg = (a + b + c) / 3;
		
		System.out.println("avg =" + avg);
		
		if (avg > a && avg > b && avg > c) {
			System.out.println("avg is higher than a, b, c");
		} 
		else {
			if (avg > a && avg > b) {
				System.out.println("avg is higher than a, b");
			}
			else if (avg > a && avg > c) {
				System.out.println("avg is higher than a, c");
			}
			else if (avg > b && avg > c) {
				System.out.println("avg is higher than b, c");
			}
			else if (avg > a) {
				System.out.println("avg is just higher than a");
			}
			else if (avg > b) {
				System.out.println("avg is just higher than b");
			}
			else if (avg > c) {
				System.out.println("avg is just higher than c");
			}
		}*/
		
		//----------------------------------------------------------------------//
		// Problem 4															//
		//----------------------------------------------------------------------//
		/*while (true) {
			System.out.print("Enter the number: ");
			number = scan.nextInt();
			if (number < 0) {
				System.out.println("It’s Over");
				break;
			} else {
				System.out.println("Good Going");
			}
		}*/
		
		//----------------------------------------------------------------------//
		// Problem 5															//
		//----------------------------------------------------------------------//
		/*for (int i = 0; i < 7; i ++) {
			if (i != 3 && i != 6) {
				System.out.print(i + " ");
			}
		}
		System.out.print("\n");*/
		
		
		//----------------------------------------------------------------------//
		// Problem 6															//
		//----------------------------------------------------------------------//
		/*int integer = 32;
		if (integer % 2 != 0) {
			System.out.println("NEW");
		}
		else {
			if (integer >= 2 && integer <= 5) {
				System.out.println("OLD");
			}
			if (integer >= 6 && integer <= 30) {
				System.out.println("NEW");
			}
			if (integer > 30) {
				System.out.println("OLD");
			}
		}*/
		
		//----------------------------------------------------------------------//
		// Problem 7															//
		//----------------------------------------------------------------------//
		/*System.out.print("Enter the number = ");
		float fnumber = scan.nextFloat();
		
		if (fnumber == 0) {
			System.out.println("zero");
		} 
		else {
			if (fnumber > 0) {
				System.out.print("positive");
			}
			else {
				System.out.print("negative");
			}
			
			if (Math.abs(fnumber) < 1) {
				System.out.print(" small");
			}
			else if (Math.abs(fnumber) > 1000000) {
				System.out.print(" large");
			}
			System.out.print(" fnumber");
		}*/
		
		//----------------------------------------------------------------------//
		// Problem 8															//
		//----------------------------------------------------------------------//
		/*System.out.print("Enter a character = ");
		char[] random = {'r', 'a', 'n', 'd', 'o', 'm'}; 
		char character = scan.next().charAt(0); 
		boolean isFound = false;
		for (char item: random) {
			if (item == Character.toLowerCase(character)) {
				isFound = true;
			}
		}
		if (isFound) {
			System.out.print("FOUND");
		} 
		else {
			System.out.println("NOT FOUND");
		}*/
		//----------------------------------------------------------------------//
	}
}
