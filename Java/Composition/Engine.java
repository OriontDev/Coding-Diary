public class Engine{
    String type;

    Engine(String type){
        this.type = type;
    }

    public void start(){
        System.out.println("The "+type+" engine is starting");
    }
}