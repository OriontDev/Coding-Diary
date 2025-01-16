

public class Car{
    double price = 50000.99;
    String model = "Mustang";
    boolean IsRunning = false;
    String brand = "Ford";

    void StartEnegine(){
        IsRunning = true;
        System.out.println("Enegine started :3");
    }
    void StopEnegine(){
        IsRunning = false;
        System.out.println("Enegine stopped :3");
    }
    void Drive(){
        if (IsRunning){
            System.out.println("Vrooooom");
        } else{
            System.out.println("Start the enegine first :(");
        }
    }
}