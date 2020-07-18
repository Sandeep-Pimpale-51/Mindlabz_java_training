
	
import java.util.Scanner;

public class Q18F
{
    public static void main(String[] args)
    {
         int rows=5;
        for (int i = 1; i <= rows; i++)
        {
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }

       
    }
}