
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null; //empty
        String filePath = "Ring.wav";

        System.out.print("\033[H\033[2J");
        System.out.flush(); 

        System.out.println("#=======ALARM FINAL PROJECT=======#");

        while(alarmTime == null){
            try {
                System.out.print("Enter an alarm time (HH:MM:SS) : ");
                String inputAlarm = scanner.nextLine();

                alarmTime = LocalTime.parse(inputAlarm, formatter);
                System.out.println("Alarm set for "+alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Please follow (HH:MM:SS) Format!");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}