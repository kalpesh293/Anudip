package ClassDemo;

public class BankMain 
{

	public static void main(String[] args) 
	{
		System.out.println("Initial balance for the account a/c-1496 is 500");
		BankAccount A1496=new BankAccount("A/C-1496",500);
		
        //deposit the amount in the bank
		System.out.println("Deposit 1000 re into the bank A/C-1496");
		A1496.deposit(1000);
		System.out.println("New balance after deposting 1000rs is"+A1496.getBalance());
		
		//Withdraw the amount 600 from the account
		System.out.println("Withdraw the amount 600 from the account A1496");
		A1496.withdraw(600);
		System.out.println("New balance after withdrawing 600rs is "+A1496.getBalance());
		
		
		//Creating the object of Saving account
		SavingAccount S1496=new SavingAccount("S/A-1496",450);
		System.out.println("Initial balance for the saving account S/A-1496 is 500");
		
		//withdraw 300 rs from saving account
		S1496.withdraw(300);
		
		//balance after withdrawing 300
		System.out.println("New balance after withdrawing 300rs is "+S1496.getBalance());
		
	}

}
