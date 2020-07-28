import java.io.*;
import java.net.*;
import java.util.*;
class Client11 extends Thread{
    public void run()
{ 
       try{ 
	String sentence;
        String modifiedSentence;
	
      while(true){
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
	
        Socket clientSocket = new Socket("localhost", 2040);
	
	 DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	
        System.out.println("Ready");
	
        sentence = in.readLine();
        out.writeBytes(sentence + '\n');
        modifiedSentence = in.readLine();
        System.out.println(modifiedSentence);

      clientSocket.close();
	  }
	}catch (IOException e) {
            System.out.println("There was a problem ");
            e.printStackTrace();
   }
}
public static void main(String args[]) throws Exception {
Client11 c1=new Client11 ();
c1.start();
}
}