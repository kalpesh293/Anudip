package String.com;
import java.util.*;

//Write a Java program to create a String object with a character array.

public class UsingCharArray
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter the characters: ");
        String input = xyz.nextLine();
        char[] charArray = input.toCharArray();

        String str = new String(charArray);
        System.out.println("String created from character array: " + str);

	}

}
