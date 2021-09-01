import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AlarmClock extends Thread {

    private int alarmMin;
    private long alarmLongTime;
    Calendar calendar;

    public AlarmClock(int alarmMinLeft) {
        this.alarmMin = alarmMinLeft;
    }

    @Override
    public void run() {
        calendar = Calendar.getInstance();
        long startLongTime = calendar.getTime().getTime();
        alarmLongTime = startLongTime + alarmMin *60*1000;
            while (calendar.getTime().getTime()<alarmLongTime) {
                calendar = Calendar.getInstance();
            }
            calendar = Calendar.getInstance();
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
            String date = format.format(calendar.getTime());
            System.out.println("alarm! time: " + date);
    }

    public int getMinLeft() {
        long currentLongTime = calendar.getTime().getTime();
        return (int) (alarmLongTime-currentLongTime)/(1000*60);
    }
}
