
import java.util.Scanner;


public class RPG{
    public static void main(String[] args) {

        Menu menu = new Menu(0);
        menu.setMenuState(0);

        if(menu.getMenuState() != -1){
            Player player = new Player(100, 100);
            Scanner scanner = new Scanner(System.in);

    

            System.out.println("Hello Player, Health = "+player.getHealth()+", Mana = "+player.getMana());
            System.out.println("Would you like to kill yourself? ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> player.setStats(0, 0);
                default -> System.out.println("k");
            }
            System.out.println("Hello Player, Health = "+player.getHealth()+", Mana = "+player.getMana());


        }
    }
}