import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();

        set.add("potato");
        set.add("apple");

        System.out.println(set);
        if(set.contains("potato")){
            System.out.println("POTATOOO");
        }
    }
}