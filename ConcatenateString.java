package String.com;
import java.util.*;

//Write a Java program to concatenate a given string to the end of another string.

public class ConcatenateString 
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String fString = xyz.nextLine();
        System.out.print("Enter the string to concatenate: ");
        String sString = xyz.nextLine();
        String concatenatedString = fString + sString;

        System.out.println("Concatenated string: " + concatenatedString);


	}

}
