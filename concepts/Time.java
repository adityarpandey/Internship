package concepts;
import java.util.Timer;
import java.util.TimerTask;

public class Time {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 5;
            public void run() {
                System.out.println("hello!");
                count--;
                if(count <=0){
                    System.out.println("TASK IS COMPLETED");
                    timer.cancel();
                }

            }
        };
    timer.schedule(task , 0, 1000);
    }

}
