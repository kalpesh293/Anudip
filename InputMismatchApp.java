package ExceptionLab.org;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchApp 
{
	public static void main(String[] args) 
	{
		 Scanner xyz = new Scanner(System.in);

	        System.out.println("Please enter an integer:");

	        try 
	        {
	            int no = xyz.nextInt();
	            System.out.println("You entered: " + no);
	        } 
	        catch (InputMismatchException e)
	        {
	            System.out.println("Input error: Please enter a valid integer.");
	        } 

	}

}
