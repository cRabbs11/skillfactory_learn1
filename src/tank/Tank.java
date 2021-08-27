package tank;

import java.io.*;
import java.nio.charset.StandardCharsets;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tank extends Vehicle {

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int posX, int posY) {
        this(posX, posY, 100);
    }

    public Tank(int posX, int posY, int fuel) {
        super(posX, posY);
        this.fuel = fuel;
        tankCount++;
        id = tankCount;
        ammo = 30;
        writeTankInFile(id);

    }

    private int fuel;
    private static String modelName = "T34";
    private static int tankCount;
    private final int id;
    private int ammo;

    public int getFuel() {
        return fuel;
    }

    public void addFuel(int fuel) {
        this.fuel+=fuel;
    }

    @Override
    void goForward(int position) {
        position = getRestFuelPath(position);
        move(position);
        spendFuel(position);
    }

    protected void spendFuel(int value) {
        fuel -= value;
    }

    protected void move(int position) {
        if (direction == 0) {
            posX += position;
        } else if (direction == 1) {
            posY -= position;
        } else if (direction == 2) {
            posX -= position;
        } else {
            posY += position;
        }
    }

    protected int getRestFuelPath(int position) {
        if (fuel > position && fuel > -position) {
            return position;
        } else if (position > 0) {
            return fuel;
        } else {
            return -fuel;
        }
    }

    @Override
    void goBackward(int position) {
        goForward(-position);
    }

    public void turnLeft() {
        if (direction < 3) {
            direction++;
        } else {
            direction = 0;
        }
    }

    public void turnRight() {
        if (direction > 0) {
            direction--;
        } else {
            direction = 3;
        }
    }

    void printPosition() {
        String result = String.format("The Tank.Tank %s-%s is at %s, %s now.",modelName, id, posX, posY);
        System.out.println(result);
    }

    void getShot() {
        if (ammo>0) {
            ammo--;
            System.out.println("shot!");
        } else {
            System.out.println("no ammo!");
        }
    }

    void add_ammo(int ammo) {
        this.ammo+=ammo;
    }

    int get_ammo() {
        return ammo;
    }


    private void writeTankInFile(int id) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
        String text = '\n' + format.format(calendar.getTime()) + " был создан танк номер " + id;

        try {
        FileWriter writer = new FileWriter("Tanks/tanks.txt", StandardCharsets.UTF_8, true);
        writer.write(text);
        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getTanksCreatedReport() {
        StringBuilder report = new StringBuilder("Отчет");
        try {
            FileReader fis = new FileReader("Tanks/tanks.txt", StandardCharsets.UTF_8);
            int i;
            while((i=fis.read())!=-1) {
                report.append((char) i);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return report.toString();
    }

}