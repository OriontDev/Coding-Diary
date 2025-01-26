public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        //this is called anonymous class, it cannot be reused
        //it is for creating one unique object, if you need more than one
        //its probably better to create a new class...
        Dog dog2 = new Dog(){
            @Override
            public void speak(){
                System.out.println("The dog speaks english (aint no way)");
            }
        };

        dog.speak();
        dog2.speak();
    }
}