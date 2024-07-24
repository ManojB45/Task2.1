package task2;

public class Account {
	 private double balance;

	    // Default constructor
	    public Account() {
	        this.balance = 0.0;
	    }

	    // Parameterized constructor
	    public Account(double balance) {
	        this.balance = balance;
	    }

	    // Method to deposit amount to the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: rs" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw amount from the account
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: rs" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            System.out.println("Withdraw amount must be positive.");
	        }
	    }

	    // Method to display the balance
	    public void displayBalance() {
	        System.out.println("Current Balance: rs" + balance);
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating an account with the default constructor
        Account account1 = new Account();
        account1.displayBalance();  // Output: Current Balance: 0.0

        // Depositing and withdrawing amounts
        account1.deposit(1000);
        account1.withdraw(500);
        account1.displayBalance();  // Output: Current Balance: 500.0

        // Creating an account with the parameterized constructor
        Account account2 = new Account(2000);
        account2.displayBalance();  // Output: Current Balance: 2000.0

        // Depositing and withdrawing amounts
        account2.deposit(500);
        account2.withdraw(300);
        account2.displayBalance();  // Output: Current Balance: 2200.0

	}

}
