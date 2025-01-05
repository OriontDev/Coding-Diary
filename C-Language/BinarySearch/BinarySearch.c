#include <stdio.h>

// Function to perform binary search
int binarySearch(int arr[], int size, int target) {
    int low = 0, high = size - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        printf("Mid : %d\n", mid);

        // Check if the target is present at mid
        if (arr[mid] == target) {
            return mid;
        }

        // If target is greater, ignore the left half
        if (arr[mid] < target) {
            low = mid + 1;
            printf("Left eliminated!, High : %d,Low : %d\n", high, low);
        }
        // If target is smaller, ignore the right half
        else {
            high = mid - 1;
            printf("Right eliminated, High : %d,Low : %d\n", high, low);
        }
    }

    return -1;
}

int main() {
    int arr[] = {2, 4, 7, 10, 23, 45, 56, 78, 90};
    int size = sizeof(arr) / sizeof(arr[0]);
    int target;
    printf("{2, 4, 7, 10, 23, 45, 56, 78, 90}\n");
    printf("Choose a number between the array above! ");
    scanf("%d", &target);

    int result = binarySearch(arr, size, target);

    if (result != -1) {
        printf("Element found at index %d\n", result);
    } else {
        printf("Element not found\n");
    }

    return 0;
}
