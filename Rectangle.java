package Assignment;

public class Rectangle {
    
	////////////////////////////////////////////////////////////////
	// Data members
	int length;
    int breadth;
	
    // 1 - having no parameter: Default Constructor
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }
    // 2 - having two numbers as parameters: Parametric Constructor
    public Rectangle(int lengthIn, int breadthIn) {
        this.length  = lengthIn;
        this.breadth = breadthIn;
    }
    // 3 - having one number as parameter: Parametric Constructor
    public Rectangle(int size) {
        this.length  = size;
        this.breadth = size;
    }
    public static void main(String[] args) {
    	Rectangle R1 = new Rectangle(3,5);
    	Rectangle R2 = new Rectangle(6);
    	
    	System.out.println("Area R1 = " + area(R1));
    	
    	System.out.println("Area R2 = " + area(R2));
    
    }
    public static int area(Rectangle r) {
    	return (r.length * r.breadth);
    }
}
