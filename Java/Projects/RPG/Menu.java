
import java.util.Scanner;

public class Menu{

    private Scanner scanner;
    private int state;

    public Menu(int state){
        this.state = state;
        this.scanner = new Scanner(System.in);
    }

    public void setMenuState(int state){
        this.state = state;
        switch(this.state){
            case 0 -> DisplayStartMenu();
            case 1 -> DisplayMainGame();
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
            case 1 -> setMenuState(1);
            case 2 -> handleExit();
            default -> DisplayStartMenu();
        }

    }

    private void DisplayMainGame(){
        System.out.println("Hi :3");
    }

    private void handleExit(){
        this.state = -1;
        System.out.println("Alt F4 for free robux");
    }
}