import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serversocket000 = new ServerSocket(12345);
            ServerSocket serversocket001 = new ServerSocket(12346);
            System.out.println("Servidor ativo");
            Scanner scanner = new Scanner(System.in);

            Socket client0 = serversocket000.accept();
            System.out.println("Cliente 1 conectado");
            Socket client1 = serversocket001.accept();
            System.out.println("Cliente 2 conectado");

            ServerThread serverthread0 = new ServerThread(client0, client1);
            serverthread0.start();
            ServerThread serverthread1 = new ServerThread(client1, client0);
            serverthread1.start();

//            ClientThread clientThread0 = new ClientThread(client0);
//            clientThread0.start();
//            ClientThread clientThread1 = new ClientThread(client1);
//            clientThread1.start();


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}