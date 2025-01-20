import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Animal animal;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dog or Cat? (1 = Dog, 2 = Cat) : ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.go();
        } else if(choice == 2){
            animal = new Cat();
            animal.go();
        } else{
            System.out.println("Invalid Input bro..");
        }

    }
}