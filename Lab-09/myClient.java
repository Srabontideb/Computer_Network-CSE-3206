import java.io.*;
import java.net.*;
import java.util.Scanner;
public class myClient {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            
            Scanner input = new Scanner(System.in);
            String msg = input.nextLine();
            
            dout.writeUTF(msg);
            dout.flush();
            
            DataInputStream dis=new DataInputStream( s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("message= "+str);
            
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}