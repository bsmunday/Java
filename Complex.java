package Assignment;

import java.util.Scanner;

public class Complex {

	// Data members
	double Re;
    double Im;
    
	// member methods
    
    // Default Constructor
    public Complex() {
        this.Re = 0.0;
        this.Im = 0.0;
    }
    // Parametric Constructor
    public Complex(double Re_In, double Im_In) {
        this.Re = Re_In;
        this.Im = Im_In;
    }
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double real = 0;
		double imag = 0;
		String[] complexInput;
				
		// Get first Complex Number
		System.out.print("Enter first  Complex number (for expamle 2 + 3j): ");
		complexInput = scan.nextLine().split(" ");    		 
		real = Double.parseDouble(complexInput[0]);
		complexInput[2] = complexInput[2].substring(0, complexInput[2].length()-1); // remove "j"
		imag = Double.parseDouble(complexInput[2]);
		Complex c1 = new Complex(real, imag);
		
		// Get Second Complex Number	
		System.out.print("Enter Second Complex number (for expamle 2 + 3j): ");	
		complexInput = scan.nextLine().split(" ");    		 
		real = Double.parseDouble(complexInput[0]);
		complexInput[2] = complexInput[2].substring(0, complexInput[2].length()-1); // remove "j"
		imag = Double.parseDouble(complexInput[2]);
		Complex c2 = new Complex(real, imag);
		
		Complex result = new Complex();
		
		// Sum Test
		result = sum(c1, c2);
		System.out.printf("%10s:", "Sum");
		result.display();
		
		// Difference Test
		result =  difference(c1, c2);
		System.out.printf("%10s:", "Difference");
		result.display();
		
		// Product Test
		result =  product(c1, c2);
		System.out.printf("%10s:", "Product");
		result.display();
	}
    // Sum of two Complex Number
    public static Complex sum(Complex c1, Complex c2) {
    	Complex result = new Complex();
    	result.Re = c1.Re + c2.Re;
    	result.Im = c1.Im + c2.Im;
    	return result;
    }   
    // Difference of two Complex Number
    public static Complex difference(Complex c1, Complex c2) {
    	Complex result = new Complex();
    	result.Re = c1.Re - c2.Re;
    	result.Im = c1.Im - c2.Im;
    	return result;
    }
    // Product of two Complex Number
    public static Complex product(Complex c1, Complex c2) {
    	Complex result = new Complex();
    	result.Re = (c1.Re * c2.Re) + (c1.Im * c2.Im * -1.0);
    	result.Im = (c1.Re * c2.Im) + (c1.Im * c2.Re);
    	return result;
    }
    public void display() {
		System.out.printf("%10f + %10f%c\n", this.Re, this.Im, 'j');
    }
    
}
