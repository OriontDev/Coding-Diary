import java.util.Random;

abstract class Location{
    abstract void displayDesc();
    abstract void displayOption();
    abstract void processOption(int choice);
}

class ElderwoodV extends Location{

    private final Menu menu;
    private final Player player;
    private final Random random;
    public ElderwoodV(Menu menu, Player player, Random random) {
        this.menu = menu;
        this.player = player;
        this.random = random;
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
    private final Player player;
    private final Random random;
    public EWwork(Menu menu, Player player, Random random) {
        this.menu = menu;
        this.player = player;
        this.random = random;
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
            case 1 -> menu.setLocation(2);
            case 3 -> menu.setLocation(0);
        }
    }

}

class EWmines extends Location{

    private final Menu menu;
    private final Player player;
    private final Random random;
    public EWmines(Menu menu, Player player, Random random) {
        this.menu = menu;
        this.player = player;
        this.random = random;
    }
    
    @Override
    void displayDesc() {
        if(player.getMana() <= 20){
            System.out.println("========ElderWood Mines========");
            System.out.println("You are too fatigued to mine!");
        }else{
            int salary = random.nextInt(50) + 1;
            player.minusStats(null, 15, null); //minus 15 mana
            player.addStats(null, null, salary);
            System.out.println("========ElderWood Mines========");
            System.out.println("You worked at ElderWood Mines and gained "+salary+" coins!.");
        }

    }

    @Override
    void displayOption() {
        System.out.println("1. Go back");
    }
    
    @Override
    void processOption(int choice) {
        switch(choice){
            case 1 -> menu.setLocation(0);
        }
    }

}