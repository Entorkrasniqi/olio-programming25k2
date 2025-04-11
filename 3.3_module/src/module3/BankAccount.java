package module3;

public class BankAccount {

    private static int accountCounter = 0; // To generate unique account numbers
    private int accountNumber;
    private double balance;

    // Constructori
    public BankAccount(double initialBalance) {
        this.accountNumber = ++accountCounter; // Auto-increment account number
        this.balance = initialBalance;
    }

    // Methodi fundeille accolle
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Methodi withdrawaa
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Getteri account balancelle
    public double getBalance() {
        return balance;
    }

    // Getteri account numberolle
    public int getAccountNumber() {
        return accountNumber;
    }

    // Static methodi retrieve the total number of accounts
    public static int getTotalAccounts() {
        return accountCounter;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating bank accounts
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        // Performing transactions
        account1.deposit(500);
        account2.withdraw(800);

        // Printing account details and the total number of accounts
        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        // Checking the total number of accounts
        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
