//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that 
//overrides the makeSound() method to bark.

package Inheritance;

class Aanimal
{
    public void makeSound() 
    {
        System.out.println("Animal sound");
    }
}

class Cat extends Aanimal
{
    @Override
    public void makeSound() 
    {
        System.out.println("Meow");
    }
}
public class AnimalCatApp
{

	public static void main(String[] args) 
	{
		Aanimal ani = new Aanimal();
        ani.makeSound();
        Cat cat = new Cat();
        cat.makeSound();

	}

}
