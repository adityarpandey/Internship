package internship;

import java.awt.*;
import java.time.LocalTime;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    AlarmClock(LocalTime alarmTime){
        this.alarmTime = alarmTime;
    }
    public void run(){


        while(LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);
                int hour = LocalTime.now().getHour();
                int min = LocalTime.now().getMinute();
                int second = LocalTime.now().getSecond();
                System.out.printf("\r%02d:%02d:%02d" ,hour,min,second);
            }catch(InterruptedException e){
                System.out.println("Thread is Interrupted");
            }



        }
        System.out.println("*Alarm*");
        Toolkit.getDefaultToolkit().beep();


    }

}
