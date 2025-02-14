
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        //Linkedlist and arraylist both have all list methods.

        LinkedList<String> cars = new LinkedList<>();

        cars.add("Suzuki");
        cars.add("Miata");
        cars.add("Ferrari");
        System.out.println(cars);

        //here are some method that only linkedlist have
        cars.addFirst("Toyota");
        cars.addLast("Honda");
        System.out.println(cars);
        cars.removeFirst();
        cars.removeLast();
        if(cars.getFirst().equals("Suzuki")){
            System.out.println("first one is still suzuki!");
        }

        //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
    }
}