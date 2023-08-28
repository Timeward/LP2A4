import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client0 {
    public static void main(String[] args) {
        try {
            Socket clientsocket000 = new Socket("localhost", 12345);
            Scanner scanner = new Scanner(System.in);

            ClientThread clientThread = new ClientThread(clientsocket000);
            clientThread.start();

            PrintStream output = new PrintStream(clientsocket000.getOutputStream());
            while(true){
                String message = scanner.nextLine();
                output.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
