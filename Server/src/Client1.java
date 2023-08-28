import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) {
        try {
            Socket clientsocket001 = new Socket("localhost", 12346);
            Scanner scanner = new Scanner(System.in);

            ClientThread clientThread = new ClientThread(clientsocket001);
            clientThread.start();

            PrintStream output = new PrintStream(clientsocket001.getOutputStream());
            while(true){
                String message = scanner.nextLine();
                output.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
