import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MyClient {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Client is ready to connect");
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            
            
            s.close();
    }
