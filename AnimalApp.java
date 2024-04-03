//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides
//the move() method to run.

package Inheritance;

class Animal
{
    public void move() 
    {
        System.out.println("animal is moving");
    }
}

class Cheetah extends Animal
{
    @Override
    public void move()
    {
        System.out.println("Cheetah is moving fast");
    }
}
public class AnimalApp 
{

	public static void main(String[] args) 
	{
		Animal ani = new Animal();
        ani.move();
        
        Cheetah chee = new Cheetah();
        chee.move();

	}

}
