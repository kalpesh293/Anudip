package Java.org;
import java.util.*;

public class FindCube 
{
	public static void main(String[] args)
	{
		
		Scanner xyz= new Scanner(System.in);
		System.out.println("enter a number =");
	    int n=xyz.nextInt();
	
		for(int i=0;i<=n;i++)
		{
		    System.out.println("Cube of " + i + " is ="+(i*i*i));
		}

	}

}
