//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute.
//Calculate the area and circumference of the circle.

package Constructor;
import java.util.*;

 class Circle 
{
    int radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }
    public int getRadius() 
    {
        return radius;
    }
    public void setRadius(int radius) 
    {
        this.radius = radius;
    }
    public float calculateArea() 
    {
        return (float) (3.14 * radius * radius);
    }
    public float calculateCircumference() 
    {
        return (float) (2 * 3.14 * radius);
    }
}
 
public class CalculateAreaCircumference 
{
	public static void main(String[] args)
	{
		Scanner xyz = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = xyz.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
	}
}
