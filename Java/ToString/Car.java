public class Car{
    String color;
    String brand;
    int year;

    Car(String color, String brand, int year){
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    public String toString(){
        return this.color+" "+this.year+" "+this.brand;
    }
}