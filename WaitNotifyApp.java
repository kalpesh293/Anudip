package threadpkt;
import java.util.*;

/*Wait () method is used for hold the thread execution for specified time period.
There are two types of wait
1) Conditional wait: conditional wait means if thread re-execute 
automatically after some specified time period called conditional wait.
Syntax: void wait (int milliseconds)
 
2) Unconditional wait: unconditional wait means thread not re-execute self 
we have to send the request to thread, for re-execution purpose for that we 
have the two methods name as notify() and notifyAll()
Syntax: void wait ()

notify(): notify() method is used for recall the waited thread for re-execution 
in first in first out format and call one thread at time. 

notifyAll(): this method is used for call the all waited thread in single stroke 
and in last in first out format.*/

class Tablee
{
    synchronized void showTable(int x) 
    {
        try 
        {
           for (int i = 1; i <= 10; i++)
           {
                System.out.printf("%d X %d = %d\n", i, x, i * x);
                if (i == 5) 
                {
                    wait(); // unconditional wait
                }
                Thread.sleep(1000);
           }
        } 
        catch (Exception ex) 
        {
             System.out.println("Error is " + ex);
        }
     }
     synchronized void restartTable()
     {
         try 
         {
             notifyAll();
         }
         catch (Exception ex)
         {
             System.out.println("error is " + ex);
         }
     }
}

class Two extends Thread 
{
     Tablee t;
     void setTable(Tablee t) 
     {
         this.t = t;
     }
     public void run() 
     {
         t.showTable(2);
     }
}

class Threee extends Thread 
{
    Tablee t;
    void setTable(Tablee t) 
    {
        this.t = t;
    }
    public void run() 
    {
        t.showTable(3);
    }
}


public class WaitNotifyApp 
{
	public static void main(String[] args) 
	{
		Tablee t = new Tablee();
		Two tw = new Two();
		tw.setTable(t);
		tw.start();
		Threee th = new Threee();
		th.setTable(t);
		th.start();
		
	}

}




/*
 * What is the diff between wait () and sleep()
 * 
 * 1) wait () is method of java.lang.Object and sleep() is static method of
 * Thread class
 * 
 * 2) wait () method can work with conditional wait as well as uncondition wait
 * but sleep() method can only work with conditional wait
 * 
 * 3) wait() method only works in synchronized block and sleep() can work in
 * synchronized as well as asynchronized block.
 * 
 * What is the diff between notify () and notifyAll () method
 * 
 * 1) notify() methood call one thread at a time and notifyAll() method call all
 * the threads at a time
 * 
 * 2) notify() method work with queue format and notifyAll() works with stack
 * format
 * 
 * 3)Both can work with only synchronized block
 */
