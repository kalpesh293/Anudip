package ExceptionLab.org;

public class ThrowsApp 
{
	public static void main(String[] args)
	{
		try
		{
			int result =divideNumber(5,0);
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	private static int divideNumber(int i, int j) {
		if(j==0)
		{
			throw new ArithmeticException("cannot divide the given number by zero");
		}
		return i/j;

	}

}
