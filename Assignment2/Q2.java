/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John" 
respectively by creating two objects of class 'Student'.*/

 class Student1
{
	int rollno;
	String phoneno;
	String address;

    void Student(int r,String p,String a)
	{
		rollno=r;
		phoneno=p;
		address=a;
	}
	
	void display()
	{
		
		System.out.println("Rollno:"+rollno+"  "+"Phone no:"+phoneno+"   "+"Address:"+address);
	
	
	}
	
	}
class Q2
{
		
	  public static void main(String[] args)
	  {
		  Student1 s1=new Student1();
          	Student1 s2=new Student1();
		  s1.Student(1,"9123476586","Pune");
		 s2.Student(2,"9836287493","Mumbai");
			System.out.println("Details of Sam:");
		  s1.display();
	System.out.println("Details of John:");
		  s2.display();
	  }
		

}
