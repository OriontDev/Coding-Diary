import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        ArrayList<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert # of foods : ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Insert food at index "+i+" : ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);
        //foods.remove(index);
        //foods.set(index element);
        //foods.get(index);

    }
}