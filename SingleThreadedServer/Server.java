import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.InputStreamReader;

public class Server {
    public void run(){
        int port=8010;
        try{
            ServerSocket serverSocket=new ServerSocket(port);
            serverSocket.setSoTimeout(100000);
            while(true){
                try{
                    System.out.println("Server is listening on port: "+port);
                    Socket acceptedConnection=serverSocket.accept();
                    System.out.println("Connection accepted from "+acceptedConnection.getInetAddress().getHostAddress());
                    PrintWriter toClient=new PrintWriter(acceptedConnection.getOutputStream(),true);
                    BufferedReader fromClient=new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
                    toClient.println("Hello from the server");
                    toClient.close();
                    fromClient.close();
                    acceptedConnection.close();
    
                }catch(IOException e){
                    e.printStackTrace();
                }
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        

    }
    public static void main(String[] args) {
        // Your code here
        Server server=new Server(); // method is not static hence it will not be in memory , so we need to create an object of the class 
        try{
            server.run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}