import java.io.*;
import java.net.*; 
import java.util.*; 

public class simpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private Scanner in;
    private PrintWriter out;

    public simpleServer(int port) throws Exception {
        serverSocket=new ServerSocket(port);
    }

    public void acceptClient() throws Exception {
        socket = serverSocket.accept();
        in = new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    public String receiveMessage() {
        return in.nextLine();
    }

    public void sendMessage(String message) {
        out.println(message);
        out.flush();
    } 

    public void close()throws Exception{
        in.close();
        out.close();
        socket.close();
        serverSocket.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("System Started");
        try {
            simpleServer server = new simpleServer(9090);
            server.acceptClient();
            while(true){
                String msg = input.nextLine();
                server.sendMessage(msg);
                String response = server.receiveMessage();
                System.out.println("Client: "+response);
                if(response.equals("stop")){
                    break;
                }
            }
            input.close();
        } catch(Exception e) {

        }
    }
}
