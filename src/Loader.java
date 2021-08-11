import tank.Tank;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    ArrayList<Client> clientList = new ArrayList<>();
    ServerSocket serverSocket;

    public Loader() throws IOException {
        serverSocket = new ServerSocket(1234);
    }

    public void run() {
        while(true) {
            System.out.println("Waiting...");
            // ждем клиента из сети
            try {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");
                // создаем клиента на своей стороне
                Client client = new Client(socket, this);
                clientList.add(client);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new Loader().run();
    }

    void sendToChat(String message) {
        for (Client client: clientList) {
            client.receive(message);
        }
    }

    void leaveChat(Client leaveClient) {
        Iterator<Client> iterator = clientList.iterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            if (client==leaveClient) {
                iterator.remove();
            }
        }
    }
}
