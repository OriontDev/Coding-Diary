
import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.75);
        map.put("orange", 0.85);
        map.put("banana", 0.25);
        map.put("watermelon", 1.00);

        //map.remove("apple");
        //System.out.println(map.get("apple")); get value
        //System.out.println(map.containsKey("pineapple"));
        //System.out.println(map.containsValue(1.00));
        //System.out.println(map.size());

        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}