package Assignment;

import java.util.Scanner;

public class basic_exercise {

	public static void main(String[] args) {
		
		//----------------------------------------------------------------------//
		// 1.1 Swap two numbers using third variable as result name 			//
		// and without using any third variable.								//
		//----------------------------------------------------------------------//
		System.out.println("//---------------------------------------------------//");
		System.out.println("Swap two numbers using third variable");
		
		int A = 1;
		int B = 2;
		int result;
		System.out.println("Input : A = " + A + ", B = " + B);
		
		result = A;
		A = B;
		B = result;
		System.out.println("Output: A = " + A + ", B = " + B + "\n");
		
		//----------------------------------------------------------------------//
		// 1.2 Swap two numbers without using any third variable.				//					//
		//----------------------------------------------------------------------//
		
		System.out.println("//---------------------------------------------------//");
		System.out.println("Swap two numbers without using any third variable");
		System.out.println("Input : A = " + A + ", B = " + B);
		
		A = A + B;
		B = A - B; // B = A + B - B = A;
		A = A - B; // A = A + B - B = A + B - A = B;
		System.out.println("Output: A = " + A + ", B = " + B + "\n");
		
		//----------------------------------------------------------------------//
		// 2. Prints the value given by the user								//
		//----------------------------------------------------------------------//
		System.out.println("//---------------------------------------------------//");
		System.out.println("print the value given by the user");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an Integer value: ");
		
		int value = scan.nextInt();
		
		System.out.println("User entered: " + value + "\n");
		
		//----------------------------------------------------------------------//
		// Ask the user to enter any 2 numbers in between 1-10 and add both of 	//
		// them to another variable call z.										//
		//----------------------------------------------------------------------//
		
		System.out.println("//---------------------------------------------------//");
		System.out.println("Adding two numbers");
		System.out.println("Enter any 2 numbers in between 1-10 separated by spaces");
		System.out.println("Example: 3 4 Enter and Final Result is 3 + 4 + 30 = 37");
		
		int first  = scan.nextInt();
		int second = scan.nextInt();
		int z = first + second + 30;
		System.out.println("Final Result: " + z + "\n");
	
	}
}
