import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        if(age >= 70){
            System.out.println("Ok Boomer!");
        }
        else if (age >= 18 && age <60) {
            System.out.println("Get a job!");
        }
        else if(age >= 13){
            System.out.println("Youre a teenager!");
        }
        else if(age < 13 && age >= 0){
            System.out.println("Youre a kid!");
        }
        else{
            System.out.println("Bro is not born yet");
        }
    }
}