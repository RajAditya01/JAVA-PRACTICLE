import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        
            try{
                String ip ="127.0.0.1";
                final int PORT=122345;

                Socket skt=new Socket(ip,PORT);
                System.out.println("clinet is invocked....");
                System.out.println("Port num"+skt.getPort());
                System.out.println("Local port number="+skt.getLocalPort());
                System.out.println("I am aditya");

                BufferedReader in =new BufferedReader(new InputStreamReader(skt.getInputStream()));
                BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
                PrintWriter out=new PrintWriter(skt.getOutputStream(),true);
                String str= null;
                do{
                    str=keyboard.readLine();
                    out.println(str);
                    str=in.readLine();
                    System.out.println("From Server:"+str);

                }

                while(!str.equalsIgnoreCase("quit"));
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
    }
    
}
