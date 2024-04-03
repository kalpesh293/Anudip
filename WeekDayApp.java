//Program to display the day of the week
package kk.Exception.org;

import java.util.*;


public class WeekDayApp 
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
	    int no = xyz.nextInt();
	     
	    switch (no) 
	    {
        case 1:
            System.out.printf("Monday");
            break;
            
        case 2:
	       	 System.out.printf("Tuesday");
	       	 break;
        case 3:
	       	 System.out.printf("Wednesday");
	       	 break;
        case 4:
	       	 System.out.printf("Thursday");
	       	 break;
        case 5:
	       	 System.out.printf("Friday");
	       	 break;
        case 6:
	       	 System.out.printf("Saturday");
	       	 break;
        case 7:
	       	 System.out.printf("Sunday");
	       	 break;
        default:
       	 	 System.out.printf("Invalid Number");
	     }

	}

}
