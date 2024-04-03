package runnable;
import java.util.*;
class Test implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
			    System.out.printf("Good Afternoon\n");
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Excpetion is "+ex);
		}
	}
}
public class RunnableTestApp
{
	public static void main(String[] args)
	{
		Test t=new Test();
		Thread th=new Thread(t);
		th.start();

	}
}
