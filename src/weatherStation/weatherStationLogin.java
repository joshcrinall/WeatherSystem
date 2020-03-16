package weatherStation;

import java.io.*;
import java.util.StringTokenizer;

public class weatherStationLogin {

    private String[] usernames;
    private String[] passwords;
    private String[] permissions;

    weatherStationLogin(String filePath) throws IOException {
        try {
            FileReader file = new FileReader(filePath);
            BufferedReader fileContent = new BufferedReader(file);
            String line = null;
            int counter = 0;

            while ((line = fileContent.readLine()) != null) {
                StringTokenizer tk = new StringTokenizer(line, ",");
                System.out.println(usernames[counter] = tk.nextToken().trim());
                System.out.println(passwords[counter] = tk.nextToken().trim());
                System.out.println(permissions[counter] = tk.nextToken().toString().trim());
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public String[] getUsernames(){
        return usernames;
    }

    public String[] getPasswords(){
        return passwords;
    }
    public String[] permissions(){
        return permissions;
    }

}


