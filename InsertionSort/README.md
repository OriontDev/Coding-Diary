# Insertion Sort Example
This program demonstrates the insertion sort algorithm in C. It sorts an array of integers in ascending order.

## How It Works
- The array is traversed(like searched or compared) starting from the second element.
- Each element is compared with the elements before it.
- If the current element is smaller, it is swapped with the larger elements until it is in the correct position.
- The process repeats for all elements, resulting in a sorted array.

## Code Breakdown
- `Ar[]`: The array of integers to be sorted. Example input: `{5, 6, 9, 3, 3, 100, 90, 20`.
- `Temp`: A temporary variable used to hold values during swapping.
- `ArraySize`: The total number of elements in the array, calculated using `sizeof`.
- Outer `for` loop: Iterates through the array starting from the second element.
- Inner `while` loop: Performs the swapping and ensures the current element is placed in the correct position relative to previous elements.
- Final `for` loop: Prints the sorted array.

## Example Output
Given the input array `{5, 6, 9, 3, 3, 100, 90, 20}`, the sorted output will be:

`3, 3, 5, 6, 9, 20, 90, 100,`

## Notes
- This implementation uses insertion sort, which has a time complexity of O(n²) in the worst case.
- Insertion sort is best suited for small datasets or nearly sorted data.
- The program prints intermediate steps and debugging messages, such as the size of the array, current index, and when an element is swapped.

## Extra note for worst and best case
- The worst case of this sort in Big O is O(n²), but in fraction it would be N(N - 1)/2
if youre wondering why the Big O is n² its because the original form of N(N - 1)/2 was
(n² - n)/2, now because n² is the biggest here thus it is O(n²)
- The best case of this sort in Big O is O(n), but it would actually be N - 1
- The Average case of this sort is also O(n²), because it is n²/4

