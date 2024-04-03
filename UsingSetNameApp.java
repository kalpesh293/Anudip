package threadpkt;
import java.lang.*;
class C extends Thread
{
	C(String ThreadName)
	{
		super (ThreadName);
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Thread name is"+name);
	}
}
class D extends Thread
{
	D(String ThreadName)
	{
		super (ThreadName);
	}
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Thread name is"+name);
	}
}
public class UsingSetNameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
        System.out.println("main Thread\n"+t.getName());
        C p=new C();
        p.setName("Kalpesh");
        p.start();
        
        D b=new D();
        b.setName("Kumbhar");
        b.start();
	}

}
