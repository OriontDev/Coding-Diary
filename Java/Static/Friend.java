public class Friend{
    static int NumOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        NumOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have "+ NumOfFriends +" Friends");
    }
}