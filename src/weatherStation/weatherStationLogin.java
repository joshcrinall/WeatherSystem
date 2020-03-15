package weatherStation;

import java.io.*;

public class weatherStationLogin {

    public String logIN() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your username");
        String username = reader.readLine();
        System.out.println("Please enter your password");
        String password = reader.readLine();
        return username + password;
    }
}


