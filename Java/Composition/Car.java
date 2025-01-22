public class Car{
    String name;
    int year;
    Engine engine;

    public Car(String name, int year, String engineType){
        this.name = name;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    public void start(){
        engine.start();
        System.out.println("the "+year+" "+name+" is running");
    }
}