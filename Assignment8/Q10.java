
public class Q10 extends Thread 
{
   public void run()
   {
      for (int i = 0; i < 5; i++)
		  {
         System.out.println(" Thread name:" + Thread.currentThread().getName());
      }
   }
   public static void main(String[] args) 
   {
      Ten  t1 = new Ten ();
      t1.setName("Main Thread");
      t1.start();
      Thread t2 = currentThread();
      t2.setName("Current Thread");
      for (int i = 0; i < 5; i++)
		  {
         System.out.println(" Thread name: " + t1.currentThread().getName());
      }
   }
}