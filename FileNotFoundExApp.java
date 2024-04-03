package ExceptionLab.org;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileNotFoundExApp
{
	public static void main(String[] args)
	{
		try
		{
			readFile("text.txt");
		}
		catch(FileNotFoundException ex) 
		{
			System.out.println("Error: "+ex.getMessage());
		}
	}

	private static void readFile(String FileName) throws FileNotFoundException{
		File f=new File(FileName);		
		Scanner xyz=new Scanner(f);
		
		while(xyz.hasNextLine())
		{
			String l = xyz.nextLine();
			System.out.println(l);
		}

	}

}
