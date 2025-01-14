abstract class Location{
    abstract void displayDesc();
    abstract void displayOption();
    abstract void processOption(int choice);
}

class ElderwoodV extends Location{

    

    
    @Override
    void displayDesc() {
        System.out.println("========ElderWood Villag========");
        System.out.println("Welcome to Elderwood Village :D!");
        System.out.println("================================");
    }

    @Override
    void displayOption() {
        System.out.println("1. Work");
        System.out.println("2. Adventurer guild");
        System.out.println("3. Heal");
        System.out.println("4. Leave the Village");
    }
    
    @Override
    void processOption(int choice) {

    }

}