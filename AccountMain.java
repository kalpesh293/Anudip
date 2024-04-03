package threadpkt;



public class AccountMain {

	public static void main(String[] args) 
	{
		Account ac1=new Account();
		ac1.setName("kalpesh");
		
		Account ac2= new Account();
		ac2.setName("Tushar");
		
		ac1.start();
		ac2.start();
		

	}

}
