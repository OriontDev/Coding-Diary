
import java.util.Scanner;


public class Menu{

    private final Scanner scanner;
    private Player player;
    private Location currLocation;
    private int state;

    public Menu(int state){
        this.state = state;
        this.scanner = new Scanner(System.in);
    }

    private void init() { // Load save
        this.player = new Player(100, 100); //creating player
        this.currLocation = new ElderwoodV(); //creating first location
        setMenuState(1);
    }

    public void setMenuState(int state){ // Setting menu state
        this.state = state;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        switch(this.state){ // All the states
            case 0 -> DisplayStartMenu();
            case 1 -> DisplayMainMenu();
            default -> System.out.println("Invalid state lil bro");
        }
    }

    public int getMenuState(){
        return this.state;
    }

    private void DisplayStartMenu(){
        System.out.println("===========Text Based RPG===========");
        System.out.println("1.Play");
        System.out.println("2.Exit");
        System.out.println("===========Text Based RPG===========");
        System.out.print("Insert Choice : ");
        int choice = this.scanner.nextInt();
        switch(choice){
            case 1 -> init();
            case 2 -> handleExit();
            default -> DisplayStartMenu();
        }

    }

    private void DisplayMainMenu(){
        System.out.println("Login Succsessful!");

        // System.out.println("Hello Player, Health = "+player.getHealth()+", Mana = "+player.getMana());
        // System.out.println("Would you like to kill yourself? ");

        this.currLocation.displayDesc();
        this.currLocation.displayOption();

        System.out.print("Selection option :");

        int choice = this.scanner.nextInt();
        int menuChange = -999;

        this.currLocation.processOption(choice);

        // switch(choice){
        //     case 1 -> player.setStats(0, 0);
        //     default -> menuChange = 1;
        //     // default -> DisplayMainMenu();
        //     // default -> System.out.println("k");
        // }
        System.out.println("Hello Player, Health = "+player.getHealth()+", Mana = "+player.getMana());
        handleMenuChange(menuChange);
    }

    private void handleMenuChange(int state) {
        if (state == -999) return;
        setMenuState(state);
    }

    private void handleExit(){
        this.state = -1;
        System.out.println("Alt F4 for free robux");
    }
}