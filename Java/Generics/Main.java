public class Main{
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (Specifies the type).

        Product<String, Double> product1 = new Product<>("apple", 5.00);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product1.getName());
        System.out.println(product1.getPrice());

        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
    }
}