/*1.Create a class named 'Student' with String variable 'name' & integer variable 'roll_no'.
Assign the value of roll_no as '2' & that of name as "John" by creating an object of the class Student. */

class Student{
	String name;
	int roll_no;

       Student(String n,int r)
	  {
		  name=n;
		  roll_no=r;
	  }
	  void display()
	  {
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+roll_no);
	  }
	  public static void main(String[] args)
	  {
		  Student s=new Student("John",2);
		  s.display();
	  }
		

}
