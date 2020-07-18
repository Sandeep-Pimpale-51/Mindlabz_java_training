import java.util.*;
class Average{

	int num1,num2,num3;
	int sum=0;
	float avg;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1:");
		num1=sc.nextInt(); 
		
		System.out.println("Enter the num2:");
		num2=sc.nextInt(); 

		System.out.println("Enter the num3:");
		num3=sc.nextInt(); 

	}

	void calculate()
	{
		sum=num1+num2+num3;
		avg=sum/3;
		System.out.println("Average::"+avg);
	}
}

class Q8{
	
	public static void main(String args[])
	{
		 Average a1=new Average();
		a1.getdata();
		a1.calculate();
	}
}