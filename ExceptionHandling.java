package kk.Exception.org;

import java.io.IOException;
import java.util.Scanner;

 
public class ExceptionHandling 
{
	void method1()throws IOException
	{
		throw new IOException("Some hardware problem");
	}
	void method2()throws IOException
	{
		method1();
	}
	void method3()throws IOException
	{
		method2();
	}
	public static void main(String[] args)
	{
		
		

		
	}

}
