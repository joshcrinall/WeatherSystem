package weatherStation;

import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;

public class weatherStationClient {
    public static void main(String[]args) {
        String host = "127.0.0.1";
        int portNumber = 9091;
        try {
            Socket socket = new Socket(host, portNumber);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String message = in.readLine();
                System.out.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
