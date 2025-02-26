
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        while(1 == 1){
            if (num % 3 == 0) {
                System.out.println("\t!! DORRRRRR !! SAY IT");
            }else{
                System.out.println("\t\t"+num);
            }
            scanner.nextLine();
            num++;

        }
    }
}