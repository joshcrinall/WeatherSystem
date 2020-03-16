package weatherStation;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class weatherStationServer {

    ArrayList<weatherStationThread> connectedClients = new ArrayList<weatherStationThread>();

    public static void main(String[]args) throws IOException {
        weatherStationServer myServer = new weatherStationServer();
        //weatherStationLogin loginHandler = new weatherStationLogin(System.getProperty("user.dir") + "/src/accounts/accounts.txt");
        //System.out.println(loginHandler.getUsernames());
        //System.out.println(loginHandler.getPasswords());
        //System.out.println(Arrays.toString(loginHandler.permissions()));
        myServer.acceptConnection(myServer);

    }

    private void acceptConnection(weatherStationServer s) {
        try {
            int portNumber = 9091;
            ServerSocket server = new ServerSocket(portNumber);
            System.out.println("Server started on Port " + portNumber);

            while(true) {
                Socket clientSocket = server.accept();
                addThreads(s);
                System.out.println("Weather station client accepted!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int connectedClients() {
        return connectedClients.size();
    }

    static private synchronized void addThreads(weatherStationServer s){
        weatherStationThread thread = new weatherStationThread(s);
        thread.start();
    }

    public String getThreadName(int index){
        return connectedClients.get(index).getName();
    }



}
