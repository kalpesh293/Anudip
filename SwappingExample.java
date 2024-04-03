package ClassObject;

import java.util.Scanner;

public class SwappingExample 
{
    public  void swapFunction(int a,int b)
    {
    	int temp;
    	temp=a;
    	a=b;
    	b=temp;
    	System.out.println("After swapping a="+a+"b="+b);
    	
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=xyz.nextInt();
        System.out.println("Enter the value of b");
        int b=xyz.nextInt();
        
        System.out.println("Before swapping a="+a+"b="+b);
         
        //Calling swapping function
        SwappingExample sx=new SwappingExample();
        sx.swapFunction(a,b);		
	}

}
