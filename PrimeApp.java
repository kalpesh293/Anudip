//Program to find all prime numbers between 1 to 1000.
package kk.Exception.org;
import java.util.*;

public class PrimeApp 
{
	static void anyMethod()
    {
        try
        {
            return;
        }
        catch (Exception e) 
        {
            return;
        }
        finally
        {
            System.out.println("finally Block");
        }
    }
     
	public static void main(String[] args) 
	{
		anyMethod();
	}

}
