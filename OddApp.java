package ExceptionLab.org;

public class OddApp 
{
	public static void main(String[] args) 
	{
		int n=10;
		trynumber(n);
		n=5;
		trynumber(n);
	}

	private static void trynumber(int n) {
		try
		{
			checkEvenNumber(n);
			System.out.println(n+" is a even number");
		}
		catch( IllegalArgumentException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	private static void checkEvenNumber(int n) {
		if(n%2!=0)
		{
			throw new IllegalArgumentException(n+" is a odd number");
		}

	}

}
