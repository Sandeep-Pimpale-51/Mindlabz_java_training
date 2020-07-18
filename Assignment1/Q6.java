//  program that prompts the user to input an integer and then outputs the number with the digits reversed.

import java.util.*;

class Q6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=0,rem=0;
		for(int i=0;num>0;i++)
		{
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		System.out.println(res);
	}
}
