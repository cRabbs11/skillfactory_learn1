import tank.Tank;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[] args) {
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

        //Phone xiaomi = new Phone("сломано стекло", "322 223 322", "04 марта");
        //Phone samsung = new Phone("не включается", "333 333 444", "29 марта", "samsung");
        //xiaomi.setDone(true);
//
        //System.out.println(xiaomi.isDone());
        //System.out.println(samsung.isDone());

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

        User user1 = new User("Ivan");
        User user2 = new User("Ivan");
        User user3 = new User("Sofia");
        User user4 = new User("Kliment");
        User user5 = new User("Vitalina");
        User user6 = new User("Andrey");
        User user7 = new User("Natalia");
        User user8 = new User("Sergei");
        User user9 = new User("Maria");
        User user10 = new User("Vitaliy");

        TreeSet<User> userList = new TreeSet<>(new UserComapator());

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);

        System.out.println("userList size: " + userList.size());
        for(User user: userList) {
            System.out.println(user);
        }
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
