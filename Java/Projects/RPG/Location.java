abstract class Location{
    abstract void displayDesc();
    abstract void displayOption();
    abstract void processOption(int choice);
}

class ElderwoodV extends Location{

    private final Menu menu;
    public ElderwoodV(Menu menu) {
        this.menu = menu;
    }
    

    
    @Override
    void displayDesc() {
        System.out.println("========ElderWood Villag========");
        System.out.println("Welcome to Elderwood Village :D!");
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
        switch(choice){
            case 1 -> menu.setLocation(1);
        }
    }

}

class EWwork extends Location{

    private final Menu menu;
    public EWwork(Menu menu) {
        this.menu = menu;
    }
    
    @Override
    void displayDesc() {
        System.out.println("========ElderWood Job-desk========");
        System.out.println("Get a job lil :D");
    }

    @Override
    void displayOption() {
        System.out.println("1. Mining");
        System.out.println("2. Farming");
        System.out.println("3. Go back");
    }
    
    @Override
    void processOption(int choice) {
        switch(choice){
            case 3 -> menu.setLocation(0);
        }
    }

}