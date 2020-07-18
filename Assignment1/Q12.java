// program to  enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered. 

import java.util.*;
class Q12{

	public static void main(String args[])
	{
		
		int num,lastNum=0,Large=0,Small=0;
		boolean doAgain=true;		
		char ans;
		Scanner sc= new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the number::");
			num=sc.nextInt();
				
			if(num<lastNum)
			{
				
				Small=num;
				
				lastNum=num;
			}else
			{
				if(num>lastNum)
				{
					if(Large<num){		
					Large=num;}
					
					lastNum=num;

				}
			}	
			System.out.println("Do you wishes to input the Another number.(Y/N)");
			ans=sc.next().charAt(0);
			
			if(ans=='N')
			{
				doAgain=false;
			}
		} while(doAgain);	
		
		System.out.println("small "+Small+" "+"large "+Large);		

	}
}