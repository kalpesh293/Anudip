/*Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and 
Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override the calculateArea()
method in the Cylinder subclass to calculate and return the total surface area of the cylinder.*/


package Lab4.kk.org;

class Shapee {
    public void draw() 
    {
        System.out.println("Drawing  shape");
    }

    public double calculateArea() 
    {
        return 0.0;
    }
}

class Circle1 extends Shapee 
{
    protected double radius;

    public Circle1(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing Circle");
    }

    @Override
    public double calculateArea() 
    {
        return 3.14 * radius * radius;
    }
}

class Cylinder extends Circle1
{
    private double height;

    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing Cylinder");
    }

    @Override
    public double calculateArea()
    {
        double circleArea = super.calculateArea();
        double cylinderSurfaceArea = (2 * 3.14 * radius * height) + (2 * circleArea);
        return cylinderSurfaceArea;
    }
}

public class ShapeCylApp 
{
	public static void main(String[] args) 
	{
		Circle1 cir = new Circle1(5);
        Cylinder cy = new Cylinder(3, 7);

        cir.draw();
        System.out.println("Area of Circle: " + cir.calculateArea());

        cy.draw();
        System.out.println("Surface Area of Cylinder: " + cy.calculateArea());

	}

}
