package Array.org;
import java.util.*;



 class ClassObject 
{
	public static void main(String[] args)
	{
		try{

			throw new RuntimeException();

			}
		catch(RuntimeException e) 
		{

			try
			{

			System.out.println("Hello");

			e.printStackTrace();

			}

			System.out.println("SCJP");

			catch(Exception x) {

			System.out.println(x);

			}

			}
		

	}
}
