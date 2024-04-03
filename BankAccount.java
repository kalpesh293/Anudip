package ClassDemo;

public class BankAccount 
{
	public String accountNumber;
	public double balance;
	
	public BankAccount(String accountNumber,double balance)
	{
		super();
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		//balance=balance+amount
		balance+=amount;
	}
	
	public void withdraw(double amount) //this condition is for bank account
	{
		if(balance>=amount)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Insufficient amount");
		}
	}
	public double getBalance()
	{
		return balance;
	}

}
