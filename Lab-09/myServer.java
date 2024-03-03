import java.io.*;
import java.net.*;
import java.util.Scanner;

public class myServer {
    public static void main(String[] args){
        try {
            ServerSocket ss=new ServerSocket (6666);
            System.out.println("Server is ready,Waiting for client");
            Socket s=ss.accept();
            System.out.println("Client connected");
            
            DataInputStream dis=new DataInputStream( s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("message= "+str);
            
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            Scanner input = new Scanner(System.in);
            String msg = input.nextLine();
            dout.writeUTF(msg);
            dout.flush();
            dout.close();
            
            ss.close();
        } 
catch (IOException e) {
      System.out.println(e);
        }
    }
    
}