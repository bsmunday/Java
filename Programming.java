package Assignment;

public class Programming {

	public Programming() {
		System.out.println("I love programming languages");
	}
	public Programming(String str) {
		System.out.println("I love " + str);
	}
	public static void main(String[] args) {
		Programming p1 = new Programming();
		Programming p2 = new Programming("Java");
		Programming p3 = new Programming("C/C++, Java and Python programming languages");
	}
}
