package threadpkt;

class MyThread extends Thread
{
	@Override   //(method overriding)
	public void run()
	{
		System.out.println("this is my task!!!");
		
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("this is my task!!!");
	}
}

public class ThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		MyThread th=new MyThread();
		th.start();
		th.setName("kalpesh");
		th.setPriority(1);
		String name=th.getName();
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(name);
		
		MyThread2 t=new MyThread2();
		t.start();
		t.setName("kumbhar");
		
		String name1=t.getName();
		System.out.println(t.getId());
		
		System.out.println(name1);
		
		
	}

}
