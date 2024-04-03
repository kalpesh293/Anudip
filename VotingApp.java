package ExceptionLab.org;
import java.util.*;

class AgeException extends Exception
{
	public AgeException(String message)
	{
		super(message);
	}
}

public class VotingApp 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter your age: ");
		int age=xyz.nextInt();
		
		try
		{
			checkAge(age);
			System.out.println("you are eligible for votting");
		}
		catch(AgeException ae)
		{
			System.out.println("you are not eligible for votting"+ae.getMessage());
		}
		
	}

	private static void checkAge(int age) throws AgeException {
		if(age<18)
		{
			throw new AgeException('\n'+"Exception :You must be above 18 for votting");
		}
		
		

	}

}
