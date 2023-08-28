import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread extends Thread{

    private Socket clientsocket;

    public ClientThread(Socket clientsocket){
        this.clientsocket = clientsocket;
    }
    @Override
    public void run(){

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(clientsocket.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String linestring;

            while ((linestring = reader.readLine()) != null) {
                System.out.println(linestring);
            }
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
