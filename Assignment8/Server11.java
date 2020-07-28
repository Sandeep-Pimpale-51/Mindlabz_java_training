//Java Program to Create a Server with 2 Threads to Communicate with Serveral Clients
import java.net.*;
import java.io.*;
import java.lang.*;
import java.io.*;

public class Server11 extends Thread {
    public void run()
{ 
        String clientSentence;
        String cap_Sentence;
     try{
   ServerSocket my_Socket = new ServerSocket(2040);
	
        while(true) {
            Socket connectionSocket = my_Socket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream out = new DataOutputStream(connectionSocket.getOutputStream());
            clientSentence = in.readLine();
            cap_Sentence = "Raceived:" +  clientSentence + '\n';
            out.writeBytes(cap_Sentence);
        }
	    }catch (IOException e) {
            System.out.println("There was a problem");
            e.printStackTrace();
   } 
}
public static void main(String args[]) throws IOException {
Server11 s1=new Server11 ();
s1.start();
    }
}