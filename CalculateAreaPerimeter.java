//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter
//of the rectangle.

package Constructor;
import java.util.*;

class Rectangle 
{
     int width;
     int height;

    public Rectangle(int width, int height) 
    {
        this.width = width;
        this.height = height;
    }
    public int calculateArea() 
    {
        return width * height;
    }
    public int calculatePerimeter() 
    {
        return 2 * (width + height);
    }
}
public class CalculateAreaPerimeter 
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int width = xyz.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = xyz.nextInt();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
	}

}
