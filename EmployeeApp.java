/*Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and 
Programmer.In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.*/

package Lab4.kk.org;
import java.util.*;

class Employee 
{
    protected String name;
    protected int basicSalary;
    protected int HA;
    protected int DA;

    public Employee(String name, int basicSalary, int HA, int DA) 
    {
        this.name = name;
        this.basicSalary = basicSalary;
        this.HA = HA;
        this.DA = DA;
    }

    public int calculateSalary() {
        return basicSalary + HA + DA;
    }
}

class Manager extends Employee 
{
    private int bonus;

    public Manager(String name, int basicSalary, int HA, int DA, int bonus)
    {
        super(name, basicSalary, HA, DA);
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() 
    {
        return super.calculateSalary() + bonus;
    }
}

class Programmer extends Employee 
{
	private int overtimeHour;

    public Programmer(String name, int basicSalary, int HA, int DA, int overtimeHour)
    {
        super(name, basicSalary, HA, DA);
        this.overtimeHour = overtimeHour;
    }

    @Override
    public int calculateSalary() 
    {
        int hourlyRate = (basicSalary + HA + DA) / 240; // Assuming 240 hours per month
        int overtimePay = overtimeHour * hourlyRate * 2; // Assuming 2 overtime rate
        return super.calculateSalary() + overtimePay;
    }
    
}

public class EmployeeApp 
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);
        System.out.println("Enter manager's name:");
        String managerName = xyz.nextLine();
        System.out.println("Enter manager's basic salary:");
        int managerBasicSalary = xyz.nextInt();
        System.out.println("Enter manager's house allowance:");
        int managerHA = xyz.nextInt();
        System.out.println("Enter manager's dearness allowance:");
        int managerDA = xyz.nextInt();
        System.out.println("Enter manager's bonus:");
        int managerBonus = xyz.nextInt();
        Manager man = new Manager(managerName, managerBasicSalary, managerHA, managerDA, managerBonus);
        
        System.out.println("Enter programmer's name:");
         xyz.nextLine(); 
        String programmerName = xyz.nextLine();
        System.out.println("Enter programmer's basic salary:");
        int programmerBasicSalary = xyz.nextInt();;
        System.out.println("Enter programmer's house allowance:");
        int programmerHA = xyz.nextInt();
        System.out.println("Enter programmer's dearness allowance:");
        int programmerDA = xyz.nextInt();
        System.out.println("Enter programmer's overtime hours:");
        int programmerOvertimeHour = xyz.nextInt();

        Programmer pro = new Programmer(programmerName, programmerBasicSalary, programmerHA, programmerDA, programmerOvertimeHour);

        System.out.println("Manager's salary: " + man.calculateSalary()+"INR");
        System.out.println("Programmer's salary: " + pro.calculateSalary()+"INR");
	}
}
