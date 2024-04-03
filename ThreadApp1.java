package threadpkt;
import java.lang.*;

class K extends Thread
{
	public void run()
	{
		try
		{
		    Thread t=Thread.currentThread();
		    String name=t.getName();
		    for(int i=1;i<=8;i++)
		    {
			   boolean b=this.isAlive();
			   System.out.println(name+"\t"+i+"\t"+b);
			   if(i==5)
			   {
				   stop();
			   }
			   sleep(10000);
		    }
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
class L extends Thread
{
	public void run()
	{
		try
		{
			Thread t=Thread.currentThread();
			String name=t.getName();
			for(int i=1;i<=50;i++)
			{
				System.out.println(name+"\t"+i);
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
public class ThreadApp1
{
	public static void main(String[] args) throws Exception
	{
		Thread t=Thread.currentThread();
		System.out.println("Main Thread"+t.getName());
		K a1=new K();
		a1.setName("First Thread");
		a1.start();
		a1.join();
		System.out.println("Status of first thread is"+a1.isAlive());
		L b1=new L();
		b1.setName("Second Thread");
		b1.start();
        
	}

}
