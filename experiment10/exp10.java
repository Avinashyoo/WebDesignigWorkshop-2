// Abstract class implementing Abstraction
abstract class BankAccount {
    // Encapsulation: Private data members
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize base variables
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Encapsulation: Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete method to Deposit money
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Concrete method to Display Account Details
    public void displayDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }

    // Abstraction: Abstract method to be overridden by subclasses
    public abstract void calculateInterest();
}

// Inheritance: SavingsAccount extends BankAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        // Passing arguments to parent class constructor
        super(accountNumber, accountHolderName, balance);
    }

    // Overriding abstract method for Savings Account (5% interest)
    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.05; 
        System.out.println("Savings Account Interest: " + interest);
    }
}

// Inheritance: CurrentAccount extends BankAccount
class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        // Passing arguments to parent class constructor
        super(accountNumber, accountHolderName, balance);
    }

    // Overriding abstract method for Current Account (2% interest)
    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }
}

// Main Class
public class exp10 {
    public static void main(String[] args) {
        // Creating objects for SavingsAccount and CurrentAccount
        SavingsAccount sa = new SavingsAccount(101, "Rahul", 10000);
        CurrentAccount ca = new CurrentAccount(102, "Anita", 20000);

        // Operations for Savings Account
        System.out.println("----- Savings Account -----");
        sa.deposit(2000);
        sa.displayDetails();
        sa.calculateInterest();

        System.out.println(); // Printing a blank line for spacing

        // Operations for Current Account
        System.out.println("----- Current Account -----");
        ca.deposit(3000);
        ca.displayDetails();
        ca.calculateInterest();
    }
}