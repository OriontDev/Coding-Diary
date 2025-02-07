
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        int choice;
        Scanner scanner = new Scanner(System.in);


        do{

            System.out.print("\033[H\033[2J");  
            System.out.flush();  

            System.out.println("==========CONTACT BOOKS==========");
            System.out.println("Your contacts ");
            for(String key : contacts.keySet()){
                System.out.println(key+" : "+contacts.get(key));
            }
            System.out.println("---------------------");
            System.out.println("1. Add new contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Exit");
            System.out.print("Insert choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                System.out.println("====Adding Contact====");
                System.out.print("Name : ");
                String name = scanner.nextLine();
                System.out.print("Number : ");
                String num = scanner.nextLine();
                contacts.put(name, num);
            }else if (choice == 2) {
                System.out.println("====REMOVING CONTACT====");
                System.out.print("Enter the name of the contact : ");
                String target = scanner.nextLine();
                if(contacts.containsKey(target)){
                    contacts.remove(target);
                }else{
                    System.out.println("Name not found! press enter to return");
                    scanner.nextLine();
                }
            }else if(choice == 3){
                System.out.println("-------------------");
                System.out.println("Thank you for using our services!");
            }


        }while (choice != 3);
    }
}