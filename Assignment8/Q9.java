
public class Q9 implements Runnable 
{
    public static void main(String[] args) throws InterruptedException
	{
       
        Thread t = new Thread(new Nine(), "MyThread");
        t.start();
        t.join();       
        t = new Thread(new Nine(), "MyThread");        
        t.start();
	
    }


    public void run() {
        System.out.println("Thread started running " + Thread.currentThread().getName());    
    }
}