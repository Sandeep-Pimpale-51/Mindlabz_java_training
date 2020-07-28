
class Q5 extends Thread
{
 public void run()
 {  
   System.out.println("Task1::");
   for(int i=1;i<11;i++)
    {
     System.out.println(i);
    }
   System.out.println("Task2::");
   for(int j=11;j<21;j++)
     {
      System.out.println(j);
     }
   System.out.println("Task3::");
   for(int k=21;k<31;k++)
      {
    System.out.println(k);
      }
 }  
 public static void main(String args[])
 {  
  Five t1=new Five();  
  
  t1.start();  
  
 }  
}
