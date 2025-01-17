

public class Car{
    double price = 50000.99;
    String model = "Mustang";
    boolean IsRunning = false;
    String brand = "Ford";

    void startEngine(){
        IsRunning = true;
        System.out.println("Engine started :3");
    }
    void stopEngine(){
        IsRunning = false;
        System.out.println("Engine stopped :3");
    }
    void Drive(){
        if (IsRunning){
            System.out.println("Vrooooom");
        } else{
            System.out.println("Start the engine first :(");
        }
    }
}