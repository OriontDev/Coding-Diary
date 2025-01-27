import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.println("COUNTDOWN!!");
        System.out.print("Enter # of second to countdown from.. ");
        int response = scanner.nextInt();

        TimerTask task = new TimerTask(){
            int count = response;

            @Override
            public void run(){

                System.out.println(count);
                count--;

                if(count < 0){
                    System.out.println("Countdown finished!!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
        //AtFixedRate mean it will continue to repeat even if the last repetition
        //is not done yet
    }
}