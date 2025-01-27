
import java.util.Timer;
import java.util.TimerTask;

public class Main{
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = 3;


            @Override
            public void run(){
                System.out.println("Hello! :D");
                count--;

                if(count <= 0){
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);
        //(a, b ,c)
        //put task name in a, b for how many second after program start will the task start
        //and c if you wanna loop it, it stand for how many milisecond between repetition (OPTIONAL)
    }
}

