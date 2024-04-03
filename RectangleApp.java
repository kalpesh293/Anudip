//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that
//overrides the getArea() method to calculate the area of a rectangle.

package Inheritance;
import java.util.*;

class Shape 
{
    public int getArea() 
    {
        return 0;
    }
}

class Rectangle extends Shape 
{
    int length;
    int width;
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    @Override
    public int getArea() 
    {
        return length * width;
    }
}

public class RectangleApp 
{
	public static void main(String[] args) 
	{
		 Scanner xyz = new Scanner(System.in);
	     System.out.print("Enter length of the rectangle: ");
	     int length = xyz.nextInt();
	        
	     System.out.print("Enter width of the rectangle: ");
	     int width = xyz.nextInt();
	      
	     Rectangle rec = new Rectangle(length, width);
	     System.out.println("Area of the rectangle: " + rec.getArea());
		 
	}

}
