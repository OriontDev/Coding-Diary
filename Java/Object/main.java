import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int option;
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        do { 
            System.out.println("=========================");
            System.out.println("Car Model : "+car.model);
            System.out.println("Car Price : "+car.price);
            System.out.println("Car Brand : "+car.brand);
            System.out.println("Car option : ");
            System.out.println("1. Start enegine");
            System.out.println("2. Stop enegine");
            System.out.println("3. Drive");
            System.out.println("4. Exit");
            System.out.print("insert option : ");
            option = scanner.nextInt();

            switch(option){
                case 1 -> car.startEngine();
                case 2 -> car.stopEngine();
                case 3 -> car.Drive();
                case 4 -> {return;}
                default -> System.out.println("Bruh");
            }
        } while (option != 4);
    }
}