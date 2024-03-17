import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// import MultiThreaderServer.Client;

import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Client {
    public void run() throws UnknownHostException,IOException{
        int port=8010;
        InetAddress address = InetAddress.getByName("localhost");
        Socket socket=new Socket(address,port);
        PrintWriter toSocket=new PrintWriter(socket.getOutputStream(),true);
        BufferedReader fromSocket=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line=fromSocket.readLine();
        System.out.println("Response from the socket is: "+line);
        toSocket.close();
        fromSocket.close();
        socket.close();

    }
    public static void main(String[] args) {
        // Your code here
        Client client=new Client();
        try{
            client.run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
