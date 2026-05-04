import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) { super(message); }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Shortfall: $" + (amount - balance));
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount + " | Remaining: $" + balance);
    }

    public String getAccountNumber() { return accountNumber; }
}

public class BankSystem {
    public static void main(String[] args) {
        Map<String, BankAccount> accounts = new HashMap<>();
        accounts.put("ACC101", new BankAccount("ACC101", 500.00));

        BankAccount myAcc = accounts.get("ACC101");
        
        try {
            myAcc.deposit(200);
            myAcc.withdraw(800); 
        } catch (InsufficientFundsException e) {
            System.err.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("Session closed.");
        }
    }
}
