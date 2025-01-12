import java.util.Random;

public class randomnum {
    public static void main(String[] args) {
        
        Random random = new Random();

        //int x = random.nextInt(6) + 1;
        //double y = random.nextDouble(); //gives a random number between 0-1 (DECIMALS)
        boolean z = random.nextBoolean();

        System.out.println(z);



    }
}