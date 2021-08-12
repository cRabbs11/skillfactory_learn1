import tank.Tank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[] args) throws InterruptedException {
        // В (0;0) с fuel = 100
        //Tank justTank = new Tank();
        //// At (10;20) fuel=100
        //Tank anywareTank = new Tank(10, 10);
        //// At (20;30) fuel=200
        //Tank customTank = new Tank(20, 30, 200);
        //justTank.goForward(200);
        //justTank.printPosition();
        //anywareTank.goBackward(-200);
        //anywareTank.printPosition();
        //customTank.goForward(201);
        //customTank.printPosition();

        Scanner scanner = new Scanner(System.in);
        System.out.println("set minutes to alarm clock:");
        int timeLeft = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        String date = format.format(calendar.getTime());
        System.out.println("current time: " + date);

        AlarmClock alarm = new AlarmClock(timeLeft);
        alarm.start();
        String message = "";
         do {
            message = scanner.next();
            if (message.equals("left")) {
                System.out.println(alarm.getMinLeft() + " min left");
            }
        } while (!message.equals("stop"));

        alarm.interrupt();
        alarm.join();

    }
}
