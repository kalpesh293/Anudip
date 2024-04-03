package Synchronized;
import java.util.*;


class Table
{
	synchronized void ShowTable(int x)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%d * %d = %d\n",x,i,i*x);
				if(i==5)
				{
					wait();
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
	public synchronized void restart()
	{
		try
		{
			notifyAll();
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
class Twoo extends Table
{
	 Table table;
     void setTable(Table table)
     {
     	this.table=table;
     }
     public void run()
     {
     	table.ShowTable(2);
     }
}
class Threee extends Table
{
	 Table table;
     void setTable(Table table)
     {
     	this.table=table;
     }
     public void run()
     {
     	table.ShowTable(3);
     }
}
public class SysnchronizedTableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		Twoo tw=new Twoo();
		tw.setTable(t);
		tw.run();
		Threee th=new Threee();
		th.setTable(t);
		th.run();   
		do
		{
			Scanner xyz=new Scanner(System.in);
			String msg=xyz.nextLine();
			if(msg.equals("restart"))
			{
				t.restart();
			}
		}
        while(true);
	}

}
