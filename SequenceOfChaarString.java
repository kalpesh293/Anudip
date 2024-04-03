package String.com;
import java.util.*;

//Write a Java program to test if a given string contains the specified sequence of char values.

public class SequenceOfChaarString
{
	public static void main(String[] args)
	{
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = xyz.nextLine();

        System.out.print("Enter the sequence of characters to check: ");
        String sequence = xyz.nextLine();

        boolean containsSequence = inputString.contains(sequence);

        if (containsSequence)
        {
            System.out.println("The string contains the specified sequence.");
        }
        else
        {
            System.out.println("The string does not contain the specified sequence.");
        }


	}

}
