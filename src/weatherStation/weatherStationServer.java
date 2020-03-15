package weatherStation;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class weatherStationServer {

    public static void main(String[]args) throws IOException {
        weatherStationServer server = new weatherStationServer();
        server.acceptConnection();
    }

    private void acceptConnection() {
        try {
            int portNumber = 9091;
            ServerSocket server = new ServerSocket(portNumber);
            System.out.println("Server started on Port " + portNumber);

            while(true) {
                Socket clientSocket = server.accept();
                weatherStationServer thread = new weatherStationServer();
                addThreads();
                System.out.println("Weather station client accepted!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private int connectedClients() {
        int totalClients = 0;
        return totalClients;
    }

    static private synchronized void addThreads(){
        weatherStationThread thread = new weatherStationThread();
        thread.start();
    }
}
