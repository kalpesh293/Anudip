package Constructor;

//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person"
//class, set their attributes using the constructor, and print their name and age.

class Person 
{
    String name;
    int age;

    // Constructor
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}

public class NameAge 
{
	public static void main(String[] args) 
	{
		
		Person person1 = new Person("Ram", 23);
        Person person2 = new Person("Sham", 25);
        Person person3 = new Person("Gokarna", 22);
        Person person4 = new Person("Bharat", 20);

        // Print their name and age
        System.out.println(" Name - " + person1.name + ", Age - " + person1.age);
        System.out.println(" Name - " + person2.name + ", Age - " + person2.age);
        System.out.println(" Name - " + person3.name + ", Age - " + person3.age);
        System.out.println(" Name - " + person4.name + ", Age - " + person4.age);

	}

}
