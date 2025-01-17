public class Car{
    String model;
    String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void Drive(){
        System.out.println("You drove the "+this.color+" "+this.model);
    }
}