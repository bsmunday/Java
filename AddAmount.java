package Assignment;

public class AddAmount {
	////////////////////////////////////////////////////////////////
	// Data members
	int amount;
	int transactions;
    ////////////////////////////////////////////////////////////////
	// member methods
    
    // Default Constructor
    public AddAmount() {
        this.amount = 50;
        transactions = 0;
    }
    // Parametric Constructor
    public AddAmount(int addAmount) {
        this.amount = addAmount + 50;
        transactions = 1;
    }
    
    public static void displayFinalAmountInSavingBox(AddAmount a) {
    	System.out.println("Final Amount in Saving Box: " + a.amount);
    }
    
    public void addMoreAmount(int amount_in) {
    	 this.amount += amount_in;
    	 transactions++;
    }
    public void displayTransactions() {
    	
    	if (transactions == 0) {
    		System.out.println("No transaction has done yet.");
    	}
    	else {
        	if (transactions == 1) {
        		System.out.print(transactions + " transaction ");
        		System.out.print("is");
        	} 
        	else {
        		System.out.print(transactions + " number of transactions ");
        		System.out.print("are");
        	}
        	System.out.println(" done on the Saving Box.");
    	}
    }
    
    public static void main(String[] args) {
    	AddAmount a1 = new AddAmount();
    	displayFinalAmountInSavingBox(a1);
    	a1.displayTransactions();
    	
    	a1.addMoreAmount(10);
    	displayFinalAmountInSavingBox(a1);
    	a1.displayTransactions();
    	
    	a1.addMoreAmount(20);
    	displayFinalAmountInSavingBox(a1);
    	a1.displayTransactions();
    	System.out.println("\n");
    	
    	AddAmount a2 = new AddAmount(10);
    	displayFinalAmountInSavingBox(a2);
    	a2.displayTransactions();
    	
    	a2.addMoreAmount(50);
    	displayFinalAmountInSavingBox(a2);
    	a2.displayTransactions();
    }
}
