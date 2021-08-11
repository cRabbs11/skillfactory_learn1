import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

class Client implements Runnable {
    Socket socket;
    private PrintStream out;
    private Loader server;

    public Client(Socket socket, Loader server){

        this.socket = socket;
        this.server = server;

        new Thread(this).start();
    }

    public void receive(String message) {
        out.println(message);
    }

    public void run() {
        try {
            // получаем потоки ввода и вывода
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // создаем удобные средства ввода и вывода
            Scanner in = new Scanner(is);
            out = new PrintStream(os);

            // читаем из сети и пишем в сеть
            out.println("Welcome to mountains!");
            String input = in.nextLine();
            while (!input.equals("bye")) {
                server.sendToChat(input);
                input = in.nextLine();
            }
            socket.close();
            server.leaveChat(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
