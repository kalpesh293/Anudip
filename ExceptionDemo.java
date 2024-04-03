package kk.Exception.org;

public class ExceptionDemo {

	public static void main(String[] args) {
		int result,a=10,b=0;
		try
		{
			result=a/b;
			System.out.println("result"+result);
		}
		catch(Exception ex)
		{
			System.out.println("no values in variable");
		}
		
		finally
		{
			System.out.println("close all connections");
		}

	}

}
