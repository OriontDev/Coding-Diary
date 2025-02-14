import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void main(String[] args) {
        int option = 0;
        String playerchoice = "";
        String[] choices = {"Rock", "Paper", "Scissor"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> winMap = new HashMap<>();

        winMap.put("Rock", "Scissor");
        winMap.put("Paper", "Rock");
        winMap.put("Scissor", "Paper");

        do { 
            clearScreen();
            int randomindex = random.nextInt(choices.length);
            String botchoice = choices[randomindex];

            System.out.println("==ROCK PAPER SCISSOR==");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissor");
            System.out.print("Insert your choice : ");
            try {
                option = scanner.nextInt();
                playerchoice = choices[option - 1];

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Cannot pick number beside 1,2,3!");
                System.exit(0);
            }
            catch (Exception e) {
                System.out.println("Invalid!");
                System.exit(0);
            } 


            System.out.println("======================");

            System.out.println("Your choice : "+playerchoice);
            System.out.println("Bot's choice : "+botchoice);

            try {
                if(playerchoice.equals(botchoice)){
                    System.out.println("tie mafaka");
                } else if(winMap.get(playerchoice).equals(botchoice)){
                    System.out.println("You WIN!!!");
                }
                else{
                    System.out.println("Bro lost");
                }
            } catch (NullPointerException e) {
                System.out.println("something went wrong");
            }
            scanner.nextLine();
            System.out.print("Press enter to retry..");
            scanner.nextLine();
        } while (true);

    }
}