// program to do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 

import java.util.*;
class Q10{

	public static void main(String args[])
	{
		
		int num1,num2,sum=0;
		boolean doAgain=true;		
		char ans;
		Scanner sc= new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the First number::");
			num1=sc.nextInt();

			System.out.println("Enter the Second number::");
			num2=sc.nextInt();
			
			sum=num1+num2;
			System.out.println("The sum is: "+sum);

			System.out.println("Do you wishes to perform the operation again.(Y/N)");
			ans=sc.next().charAt(0);
			
			if(ans=='N')
			{
				doAgain=false;
			}
		} while(doAgain);	
		

	}
}