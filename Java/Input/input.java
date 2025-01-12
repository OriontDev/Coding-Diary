import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        scanner.nextLine(); //clear input buffer

        System.out.print("Whats your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name+", You are "+age+" Years old, You will be "+(age + 1)+" years old next year.");
        System.out.println("Your favorite food is "+food);

    }
}