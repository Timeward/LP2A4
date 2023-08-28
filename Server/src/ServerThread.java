import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.ServerSocket;

public class ServerThread extends Thread{

    private Socket serversocket0;
    private Socket serversocket1;

    public ServerThread(Socket serversocket0, Socket serversocket1){
        this.serversocket0 = serversocket0;
        this.serversocket1 = serversocket1;
    }
    @Override
    public void run(){
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(serversocket0.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String linestring;

            PrintStream output = new PrintStream(serversocket1.getOutputStream());

            while ((linestring = reader.readLine()) != null) {
                output.println(linestring);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
