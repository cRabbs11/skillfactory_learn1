import java.util.concurrent.CopyOnWriteArraySet;

public class Chat {

    private CopyOnWriteArraySet<String> userList = new CopyOnWriteArraySet<>();
    private long startTime;

    public Chat() {
        startTime = System.currentTimeMillis();
        System.out.println(startTime + ": start chat");
    }

    public void connectToChat(String user) {
        new Thread() {
            @Override
            public void run() {
                try {
                    long connectTime = System.currentTimeMillis();
                    boolean queue = false;
                    do {
                        if (userList.size() < 5) {
                            queue = false;
                            if (userList.add(user)) {
                                System.out.println(System.currentTimeMillis() - startTime + ": " + user + " enter chat");
                            } else {
                                System.out.println(System.currentTimeMillis() - startTime + ": " + user + " already in chat");
                            }
                        } else {
                            queue = true;
                            System.out.println(System.currentTimeMillis() - startTime + ": " + user + " NOT enter, chat is full");
                        }
                        System.out.println("userList: " + userList.size());
                        sleep(200);
                    } while (queue && (System.currentTimeMillis() - connectTime) < 5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public void removeFromChar(String user) {
        new Thread() {
            @Override
            public void run() {
                if (userList.remove(user)) {
                    System.out.println(user + " left chat");
                    System.out.println("userList: " + userList.size());
                }
            }
        }.start();
    }
}