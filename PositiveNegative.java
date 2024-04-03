package Java.org;

import java.util.Scanner;

public class PositiveNegative 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number");
		int no;
		Scanner xyz=new Scanner(System.in);
		no = xyz.nextInt();
		if (no > 0)
		{
            System.out.println("The entered number is positive.");
        }
		else if (no < 0) 
		{
            System.out.println("The entered number is negative.");
        }
		else 
		{
            System.out.println("The entered number is zero.");
        }
	}

}
