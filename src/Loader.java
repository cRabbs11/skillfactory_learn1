import tank.Tank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[] args)  {
        // В (0;0) с fuel = 100
        Tank justTank = new Tank();
        //// At (10;20) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        System.out.println(Tank.getTanksCreatedReport());

        //justTank.goForward(200);
        //justTank.printPosition();
        //anywareTank.goBackward(-200);
        //anywareTank.printPosition();
        //customTank.goForward(201);
        //customTank.printPosition();

        //String text = "Hello world!";
        //String encryptText;
        //String decryptText;
//
        //Encoder encoder = new Encoder();
        //System.out.println("text: " + text);
        //encryptText = encoder.encrypt(text);
        //System.out.println("encript: " + encryptText);
        //decryptText = encoder.decrypt(encryptText);
        //System.out.println("decript: " + decryptText);
    }

    public static void task() {
        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        //String text = "aaaaab";
        Pattern pattern = Pattern.compile("(\\bs[a-zA-Z]*?s\\b)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            //System.out.println("find!");
            //System.out.println(matcher.toString());
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + text.substring(start, end));
        }

    }

    public static void example() {
        String text = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";
        Pattern pattern = Pattern.compile("<strike>.*?</strike>");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }

        System.out.println("Clean the text");
        System.out.println(matcher.replaceAll(""));
    }
}
