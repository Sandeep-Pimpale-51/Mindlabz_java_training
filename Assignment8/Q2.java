//Write a program of producer and consumer


import java.util.*;
// Producer 

class Producer implements Runnable
{
  LinkedList<Integer> list;
  Producer(LinkedList<Integer> list)
  {
    this.list=list;
  }
  
  public void run()
  {
    for(int i=1; i<=5;i++)
	{
      synchronized(list)
	  {
        while(list.size()>=1)
		{
          System.out.println("Waiting as queue is full..");
          try 
		  {
            list.wait();
          } catch (InterruptedException e)
		  {
            e.printStackTrace();
          }
        }
        System.out.println("Adding to queue- " + Thread.currentThread().getName() + " " + i);
        list.add(i);
        list.notify();    
      }
    }		
  }
}
//Consumer 
class Consumer implements Runnable
{
  LinkedList<Integer> list;
  Consumer(LinkedList<Integer> list)
  {
    this.list = list;
  }
   public void run() 
   {
    for(int i=1;i<=5;i++)
	{
      synchronized(list) 
	  {
        while(list.size()<1)
		{
          System.out.println("Waiting as queue is empty..");
          try
		  {
            list.wait();
          }
		  catch (InterruptedException e) 
		  {
            e.printStackTrace();
          }
        }
        System.out.println("Consuming from queue- " + Thread.currentThread().getName() + " " + list.remove());
        list.notify();  
      }
    }		
  }
}

public class Q2
 {
  public static void main(String[] args)
  {
    LinkedList<Integer> list = new LinkedList<Integer>();
    Thread t1 = new Thread(new Producer(list), "Producer");
    Thread t2 = new Thread(new Consumer(list), "Consumer");
    t1.start();
    t2.start(); 
  }
}