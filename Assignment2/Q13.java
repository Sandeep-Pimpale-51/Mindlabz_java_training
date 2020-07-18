import java.util.Scanner;  

class Matrix {  
		int rows=0, col=0;
		int[][] arr=new int[3][3];
		  Scanner sc = new Scanner(System.in); 
	Matrix(int r,int c)
	{
		rows=r;
		col=c;	
	}
		void getdata(){
		
		for (int i=0;i<rows;i++)  
  		  {  
       			 for(int j=0;j<col;j++)  
        		{  
          		  System.out.print("Enter Element");  
          		  arr[i][j]=sc.nextInt();  
          		  System.out.println();  
       			 }  
  		  }  
		}

		void display()
		{
			System.out.println("Printing Elements...");  
  			  for(int i=0;i<rows;i++)  
    			{   
     				   System.out.println();  
    				    for(int j=0;j<col;j++)  
    				    {  
          				  System.out.print(arr[i][j]+"\t");  
        			    }  
    }  
		}
}
class Q13{
public static void main(String[] args) {  
   
   
	
	Matrix m=new Matrix (3,3);
	m.getdata();
	m.display();
    
    
}  
}  