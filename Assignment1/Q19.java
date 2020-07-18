/* WAP to compute sinx for given x. The user should supply x & a positive integer n. We compute the sine of x using the series &
the computation should use all terms in the series up through the term involving xn.sinx=x-x3/3!+x5/5!-x7/7!+x9/9!....*/

import java.util.Scanner;
public class Q19
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n,fact;
		float x,sum=0;
		int sinx=-1;
		float prod=1;
		System.out.print("Enter value x:");
		x=sc.nextInt();
		System.out.print("Enter value n:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i+=2)
		{
			fact=1;
			for(j=1;j<=i;j++)
			{
				prod=prod*x;;
				fact=fact*j;
			}
			sinx=-1*sinx;
			sum=sum+sinx*prod/fact;
		}
		System.out.print("sine of 1="+sum);
		
	}
}