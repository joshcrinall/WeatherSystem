package weatherStation;

public class weatherStationThread extends Thread{

    weatherStationServer server;

    weatherStationThread(weatherStationServer s){
        this.server = s;
    }

    public void run(){
        server.connectedClients.add(this); // adds the thread to the list
        System.out.println(server.connectedClients()); // Prints the amount of threads in list

        // System.out.println(server.getThreadName(3));

    }
}
