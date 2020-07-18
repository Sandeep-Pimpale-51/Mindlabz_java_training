/* 1
   222
   33333
   4444444
   555555555  */
   
   public class Q18E{
	   public static void main(String[] args)
	   {
		   int a=1;
		   for(int i=1;i<=5;i++)
		   {
			   for(int j=5;j>i;j--)
			   {
				   System.out.print("");
			   }
			   for(int k=1;k<=(i*2)-1;k++)
			   {
				   System.out.print(a);
			   }
			   a++;
			   System.out.println();
		   }
	   }
   }