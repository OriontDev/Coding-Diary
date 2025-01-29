
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert day of the week : ");
        String response = scanner.nextLine().toUpperCase();

        try {
                    Day day = Day.valueOf(response);

        switch(day){
            case MONDAY, 
                 TUESDAY, 
                 WEDNESDAY, 
                 THURSDAY, 
                 FRIDAY -> System.out.println("Its the weekdays");
            case SATURDAY, 
                 SUNDAY -> System.out.println("Its the weekends");
        }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day!");
        }

    }
}