package String.com;
import java.util.*;

//Write a Java program to get the character at the given index within the string.

public class FindCharacterUsingIndex 
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = xyz.nextLine();

        System.out.print("Enter the index: ");
        int index = xyz.nextInt();

        if (index >= 0 && index < inputString.length())
        {
            
            char characterAtIndex = inputString.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } 
        else 
        {
            System.out.println("Not found! Please enter valid index");
        }




	}

}
