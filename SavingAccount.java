package ClassDemo;

public class SavingAccount extends BankAccount
{
	public SavingAccount(String accountNumber, double balance) 
	{
		super(accountNumber, balance);
		
	}
	
	public void withdraw(double amount)
	{
		if(getBalance() - amount <100) //this condition is for saving account
		{
			System.out.println("You requried to maintain the minimum balance amount");
		}
		else
		{
			super.withdraw(amount);
		}
	}
	

}
