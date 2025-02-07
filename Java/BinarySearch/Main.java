
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 4, 5, 8, 9, 10, 44, 99};

        System.out.println(Arrays.toString(arr));
        System.out.print("Pick one of the number in the array above! ");
        int target = scanner.nextInt();
        int index = Binarysearch.binarySearch(arr, target);
        System.out.println("The number you choose is in the index of "+index);
    }
}