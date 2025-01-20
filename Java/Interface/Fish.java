public class Fish implements Prey, Predator{

    @Override
    public void Flee(){
        System.err.println("The Fish swimmed away");
    }

    @Override
    public void Hunt(){
        System.err.println("The Fish is hunting");
    }
}