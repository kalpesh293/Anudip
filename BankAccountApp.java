/*Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount
and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.*/

package Lab4.kk.org;
import java.util.*;

class BankAccount
{
    protected double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance =balance+ amount;
        System.out.println("Deposited: " + amount+"INR");
        System.out.println("Current Balance: " + balance+"INR");
        
    }

    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn:" + amount+"INR");
            System.out.println("Current Balance:" + balance+"INR");
        } 
        else
        {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccount extends BankAccount 
{
    private double withdrawalLimit;
    public SavingsAccount(double initialBalance, double withdrawalLimit) 
    {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount)
    {
        if (amount <= withdrawalLimit && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn:" + amount+"INR");
            System.out.println("Current Balance:" + balance+"INR");
        } 
        else 
        {
            System.out.println("Withdrawal limit exceeded or insufficient balance!");
        }
    }
}

class CheckingAccount extends BankAccount 
{
    private double overdraftFee;

    public CheckingAccount(double initialBalance, double overdraftFee) 
    {
        super(initialBalance);
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount+"INR");
            System.out.println("Current Balance: " + balance+"INR");
        } 
        else 
        {
            balance -= overdraftFee;
            System.out.println("Withdrawn with overdraft fee:" + (amount + overdraftFee) +"INR");
            System.out.println("Current Balance:" + balance+"INR");
        }
    }
}

public class BankAccountApp 
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);

        System.out.println("Enter initial balance:");
        double savingsInitialBalance = xyz.nextDouble();
        System.out.println("Enter withdrawal limit:");
        double savingsWithdrawalLimit = xyz.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsInitialBalance, savingsWithdrawalLimit);

        System.out.println("Creating Checking Account...");
        System.out.println("Enter initial balance:");
        double checkingInitialBalance = xyz.nextDouble();
        System.out.println("Enter overdraft fee:");
        double checkingOverdraftFee = xyz.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(checkingInitialBalance, checkingOverdraftFee);

        System.out.println("Enter deposit amount for Savings Account:");
        double depositAmountSavings = xyz.nextDouble();
        savingsAccount.deposit(depositAmountSavings);

        System.out.println("Enter withdrawal amount for Savings Account:");
        double withdrawAmountSavings = xyz.nextDouble();
        savingsAccount.withdraw(withdrawAmountSavings);

        System.out.println("Enter deposit amount for Checking Account:");
        double depositAmountChecking = xyz.nextDouble();
        checkingAccount.deposit(depositAmountChecking);

        System.out.println("Enter withdrawal amount for Checking Account:");
        double withdrawAmountChecking = xyz.nextDouble();
        checkingAccount.withdraw(withdrawAmountChecking);

	}
}
