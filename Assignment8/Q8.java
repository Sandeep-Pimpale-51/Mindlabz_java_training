
public class Q8 implements Runnable
    {
        static int count =1;
        private static final int MAX_COUNT =20;
        public synchronized void print ()
        {
            System.out.println(Thread.currentThread().getName() + " is printing " + count);
            count++;
            notify();
            try{
                if(count>MAX_COUNT)
                    return;
                wait();
            }catch (InterruptedException e){ 
                e.printStackTrace();
            }
        }
        public void run()
        {
            for(int i=0;i<MAX_COUNT/2;i++)
            {
                print();

            }
        }

        public static void main(String[] args) {

            Eight x= new Eight();
            Thread t0= new Thread(x);
            Thread t1=  new Thread(x);
            t0.start();
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            t1.start();     
        }


    }