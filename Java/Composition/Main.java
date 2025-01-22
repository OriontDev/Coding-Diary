public class Main{
    public static void main(String[] args) {

        //Composition create "Part-of" relationship :3

        Car car = new Car("Corvette", 2025, "V8");

        System.err.println(car.name);
        System.err.println(car.year);
        System.err.println(car.engine.type);

        car.start();
    }
}