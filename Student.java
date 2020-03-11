package Assignment;

public class Student {

	// Data members
	String name;

	// member methods
	
    // Default Constructor
    public Student() {
    	this.name = "Unknown";
    }
    // Parametric Constructor
    public Student(String nameIn) {
    	this.name = nameIn;
    }
    // main program
    public static void main(String[] args) {
    	Student[] s = new Student[10];
    	s[0] = new Student();
    	for (int i = 1; i < s.length - 1; i++) {
    		s[i] = new Student("Vicky" + i);
    	}
    	s[s.length - 1] = new Student();
    	display(s);
    }
    public static void display(Student[] s) {
    	for (int i = 0; i < s.length; i++) {
    		System.out.println(s[i].name);
    	}
    }  
}
