// program to calculate HCF of Two given number.
import java.util.*;
class Q9{

	public static void main(String args[])
	{
		
		int num1,num2,hcf=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the First number::");
		num1=sc.nextInt();

		System.out.println("Enter the Second number::");
		num2=sc.nextInt();

		for(int i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
		}
			System.out.println("The HCF is : "+hcf);

	}
}