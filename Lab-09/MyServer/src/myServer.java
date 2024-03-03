import java.io.*;
import java.net.*;
import java.util.Scanner;

public class myServer {
    public static void main(String[] args) throws IOException{

            ServerSocket ss = new ServerSocket (6666);
            System.out.println("Server is ready to connect");
            Socket s=ss.accept();
            System.out.println("Client is connected");
            ss.close();
            
            
        }
       
       
    
}