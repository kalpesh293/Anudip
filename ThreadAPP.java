package threadpkt;
import java.lang.*;

class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("First Thread");
				Thread.sleep(10000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Second Thread");
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
public class ThreadAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
        a.start();
        B b=new B();
        b.start();
	}

}
