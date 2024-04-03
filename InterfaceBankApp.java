/*Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount.
The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, 
withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have
their own unique methods.*/

package EncapsulationAbstraction;

import java.util.Scanner;

interface Account 
{
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

class SavingsAccount implements Account 
{
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate)
    {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        balance += calculateInterest();
    }
}

class CurrentAccounts implements Account 
{
    private double balance;
    private double overdraftLimit;

    public CurrentAccounts(double balance, double overdraftLimit) 
    {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // Current account does not earn interest
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class Bank 
{
    private Account[] accounts;
    private int numAccounts;

    public Bank(int maxSize) 
    {
        accounts = new Account[maxSize];
        numAccounts = 0;
    }

    public void addAccount(Account account)
    {
        if (numAccounts < accounts.length)
        {
            accounts[numAccounts++] = account;
        } 
        else 
        {
            System.out.println("Cannot add more accounts. Bank is full.");
        }
    }

    public void displayAccounts() {
        System.out.println("Bank Accounts:");
        for (int i = 0; i < numAccounts; i++)
        {
            System.out.println("Account " + (i + 1) + ": Balance - " + accounts[i].getBalance());
        }
    }
}

public class InterfaceBankApp
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(5); // Maximum 5 accounts

        System.out.println("Creating Savings Account...");
        System.out.print("Enter initial balance: ");
        double savingsBalance = scanner.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsBalance, interestRate);

        // Create current account
        System.out.println("Creating Current Account...");
        System.out.print("Enter initial balance: ");
        double currentBalance = scanner.nextDouble();
        System.out.print("Enter overdraft limit: ");
        double overdraftLimit = scanner.nextDouble();
        CurrentAccounts currentAccount = new CurrentAccounts(currentBalance, overdraftLimit);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        bank.displayAccounts();

        savingsAccount.deposit(1000);
        currentAccount.withdraw(500);

        bank.displayAccounts();

	}

}
