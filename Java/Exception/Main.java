import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();
        }
        catch(ArithmeticException e){
            System.out.println("CANT DIVIDE BY ZERO!!1!");
        }
        catch(InputMismatchException e){
            System.out.println("Go back to school dyslexic ahh");
        }
        finally{
            scanner.close();
            System.out.println("This always run");
        }

        System.out.println("test");
    }
}