package Java.org;
import java.util.*;

public class SumAvarage 
{
	public static void main(String[] args)
	{
		Scanner xyz = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        int sum = 0;
        int average;

        for (int i = 1; i <= 5; i++)
        {
            System.out.print("Enter number " + i + ": ");
            int no=xyz.nextInt();
            sum =sum+no;
        }
        
        average = sum / 5;

        System.out.println("Sum of the entered numbers: " + sum);
        System.out.println("Average of the entered numbers: " + average);

	}

}
