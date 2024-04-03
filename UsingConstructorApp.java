package threadpkt;
import java.lang.*;

class X extends Thread
{
	X(String ThreadName)
	{
		super (ThreadName);
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Thread name is\n"+name);
	}
}
class Y extends Thread
{
	Y(String ThreadName)
	{
		super (ThreadName);
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Thread name is\n"+name);
	}
}

public class UsingConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t=Thread.currentThread();
        System.out.println("main Thread\n"+t.getName());
        X a=new X("First Thraed");
        a.start();
        Y b=new Y("Second Thread");
        b.start();
        
	}

}
