package internship;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        while(alarmTime == null){
        try {
            System.out.print("enter the time of alarm: ");
            String inputTime = scanner.nextLine();
            alarmTime = LocalTime.parse(inputTime, formatter);
            System.out.println("your alarm is set for: "+alarmTime);

            System.out.println(alarmTime);
        }catch(DateTimeParseException e){
            System.out.println("Enter time in this format : HH:mm:ss ");
        }
        }
        AlarmClock alarmClock = new AlarmClock(alarmTime);
        Thread thread = new Thread(alarmClock);
        thread.start();

    }
}
