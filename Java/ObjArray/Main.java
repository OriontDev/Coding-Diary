public class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Black");
        Car car2 = new Car("Kijang", "Green");
        Car car3 = new Car("Ferrari", "Yellow");

        Car[] cars = {car1, car2, car3};

        for(Car car : cars){ //for Car inside cars
            car.Drive();
        }
    }
}