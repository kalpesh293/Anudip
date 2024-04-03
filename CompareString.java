package String.com;
import java.util.*;

//Write a Java program to compare a given string to the specified character sequence

public class CompareString
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = xyz.nextLine();

        System.out.print("Enter the character sequence to compare: ");
        String sequence = xyz.nextLine();

        if (inputString.startsWith(sequence) && inputString.endsWith(sequence))
        {
            System.out.println("The string matche specified character sequence at both the beginning and the end.");
        }
        else if (inputString.startsWith(sequence)) 
        {
            System.out.println("The string matches specified character sequence at the beginning.");
        } 
        else if (inputString.endsWith(sequence)) 
        {
            System.out.println("The string matches specified character sequence at the end.");
        }  
        else 
        {
            System.out.println("The string does not match the specified character sequence.");
        }
		

	}

}
