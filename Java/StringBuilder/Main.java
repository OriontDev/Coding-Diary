public class Main{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I ate cookies");

        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.append(" yummy"));
        System.out.println(sb.replace(0, 5, "burger"));
        System.out.println(sb.delete(0, 7));
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //to use String methods, you need to convert sb into string

        String[] words = sb.toString().split(" ");

        for(String word : words){
            System.out.print(new StringBuilder(word).append(" "));
        }

    }
}