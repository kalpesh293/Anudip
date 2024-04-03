package Array.org;
import java.util.*;

class Shape 
{
    public double getArea() 
    {
        return 0; 
    }
}

class Circle extends Shape
{
    private int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14* radius * radius;
    }
}

class Square extends Shape 
{
    private int length;

    public Square(int length) 
    {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape
{
    private int width;
    private int height;

    public Rectangle(int width, int height) 
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}


public class ShapeAreaApp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.getArea());

        System.out.print("Enter length of square: ");
        int length = sc.nextInt();
        Square square = new Square(length);
        System.out.println("Area of Square: " + square.getArea());

        System.out.print("Enter width of rectangle: ");
        int width = sc.nextInt();
        System.out.print("Enter height of rectangle: ");
        int height = sc.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

	}

}
