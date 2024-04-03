package threadpkt;

class Table
{
	void ShowTable(int x)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%d * %d = %d\n",i,x,i*x);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}
class Five extends Table
{
	 Table table;
     void setTable(Table table)
     {
     	this.table=table;
     }
     public void run()
     {
     	table.ShowTable(5);
     }
}
class Three extends Table
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
public class TableThreadApp 
{
	public static void main(String[] args)
	{
		Table t=new Table();
		Five f=new Five();
		f.setTable(t);
		f .run();
		Three th=new Three();
		th.setTable(t);
		th.run();
		
		      
	}
}
