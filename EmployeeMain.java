package ClassDemo;
//manager is-A employee

class Employee
{
	public int salary;
	
	public Employee(int sal)
	{
		salary=sal;
	}
	public void work()
	{
		System.out.println("working as a emplyee");
	}
	public int getSalary()
	{
		return salary;
	}
}
class Manager extends Employee
{
	public Manager(int sal)
	{
		super(sal);
	}
	public void work()
	{
		System.out.println("working as employee");
	}
	public void addEmployee()
	{
		System.out.println("adding new employee");
	}
}
public class EmployeeMain
{
	public static void main(String[] args)
	{
		Employee emp=new Employee(40000);
		Manager man=new Manager(70000);
		
		emp.work();
		System.out.println("Employee salary"+emp.getSalary());
		man.work();
		System.out.println("Manager salary"+emp.getSalary());
		man.addEmployee();
	}

}
