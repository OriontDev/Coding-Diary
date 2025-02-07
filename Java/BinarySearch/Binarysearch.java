public class Binarysearch{
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int middle = left + (right - left) / 2;

            if (target < arr[middle]){
                right = middle - 1;
            } else if(target > arr[middle]){
                left = middle + 1;
            } else{
                return middle;
            }
        }
        return -1;
    }
}