
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {

        //Default format are year-month-day.

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now(); //UTC timestamp
        LocalDate date2 = LocalDate.of(2025, 12, 25);
        //local.date also applicable to Datetime and put hour, minute, second into the parameter


        //formatted datetime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println(formattedDateTime);
        System.out.println(date2);

        if(date.isBefore(date2)){
            System.out.println(date+" is earlier than "+date);
        } else if(date.isAfter(date2)){
            System.out.println(date+" is later than "+date);
        } else if(date.isEqual(date2)){
            System.out.println(date+" is later than "+date);
        }

    }
}