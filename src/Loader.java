import tank.Tank;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[] args)  {
        // В (0;0) с fuel = 100
        //Tank justTank = new Tank();
        //// At (10;20) fuel=100
        //Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        //Tank customTank = new Tank(20, 30, 200);
        //System.out.println(Tank.getTanksCreatedReport());
        //justTank.goForward(200);
        //justTank.printPosition();
        //anywareTank.goBackward(-200);
        //anywareTank.printPosition();
        //customTank.goForward(201);
        //customTank.printPosition();

        List<String> promoList = Arrays.asList("11122", "2", "3", "23", "11122", "11122", "12315", "52352131");

        long countOfWinners = getCountOfWinners(promoList);
        System.out.println(countOfWinners);
    }

    public static long getCountOfWinners(List<String> list) {
        return list.stream()
                .map(Integer::valueOf)
                .filter(o -> o.equals(11122))
                .count();
    }
}
