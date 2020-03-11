package Assignment;

public class Employee {
    ////////////////////////////////////////////////////////////////
	// Data members
	String name;
	int yearOfJoining;
	int salary;
	String address;
    ////////////////////////////////////////////////////////////////
	// member methods
    // Default Constructor
    public Employee() {
    	this.name = "";
    	this.yearOfJoining = 0;
    	this.salary = 0;
    	this.address = "";
    }
    // Parametric Constructor
    public Employee(String nameIn, int yearOfJoiningIn, 
    							int salaryIn, String addressIn) {
    	this.name = nameIn;
    	this.yearOfJoining = yearOfJoiningIn;
    	this.salary = salaryIn;
    	this.address = addressIn;
    }
    // main program
    public static void main(String[] args) {
    	Employee[] e = new Employee[3];
    	e[0] = new Employee("Robert", 1994, 80000, "64C- Walls Streat");
    	e[1] = new Employee("Sam"   , 2000, 85000, "68D- Walls Streat");
    	e[2] = new Employee("John"  , 1999, 90000, "26B- Walls Streat");
    	display(e);
    }
    public static void display(Employee[] e) {
		System.out.printf("%10s ", "Name");
		System.out.printf("%17s ", "Year of joining");
		System.out.printf("%10s ", "Salary");
		System.out.printf("%20s\n\n", "Address");
    	for (int i = 0; i < e.length; i++) {
    		System.out.printf("%10s ", e[i].name);
    		System.out.printf("%17d ", e[i].yearOfJoining);
    		System.out.printf("%10d ", e[i].salary);
    		System.out.printf("%20s\n\n", e[i].address);
    	}
    }   
}
