import java.util.*;

class Employee {
	private String name;
	private float salary, hours;
	
	Employee() {
		name = " ";
		salary = 0;
		hours = 0;
	}
	
	public void getInfo(String n, float sal, float hr) {
		name = n;
		salary = sal;
		hours = hr;
	}
	
	public float AddSal() {
		if(salary<500) {
			salary = salary + 10;
		}
		return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}


	
	public void printSal() {
		System.out.println("Salary : " + salary);
}


class TestEmployee {
	
	
	
	}
}

class Q12
{
	public static void main (String[] args)
	{
		Employee emp = new Employee();
		
		/* taking input of employee details */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter salary");
		float salary = sc.nextFloat();
		System.out.println("Enter no. of hours of work");
		float hours = sc.nextFloat();
		
		/* calling methods of EmployeeDetail class */
		emp.getInfo(name, salary, hours);
		salary = emp.AddSal();
		salary = emp.AddWork();
		
		
		emp.printSal();  /* calling method of  to print final salary */
	}
}