public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        dog.Speak();
        System.out.println(plant.isAlive);
    }
}