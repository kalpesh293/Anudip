package ClassDemo;

class Student
{ //Wrapping of data in single unit is called encapsulation
	 int id;
	String name;
	String address;
	String email;
	
	void display()
	{
		System.out.println(id+" "+name+" "+address+" "+email);
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student();
        s1.id=1;
        s1.name="Kalpesh";
        s1.address="Pune";
        s1.email="kumbharkalpesh13@gmail.com";
        s1.display();
        
	}

}
