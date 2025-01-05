# Binary Search Example in C

This program demonstrates the binary search algorithm in C. It searches for a target number within a sorted array and identifies its index if found. Binary search is a fast and efficient method that works only on sorted arrays.

---

## How Binary Search Works
1. **Initialization**: Define the `low` and `high` indices to represent the bounds of the array to be searched.
2. **Calculate Midpoint**: Compute the middle index, `mid`, using the formula:
    `mid = low + (high - low) / 2`
3. **Compare Midpoint Value**:
- If the value at `mid` matches the target, the search is successful, and the index is returned.
- If the value at `mid` is less than the target, the `low` index is adjusted to `mid + 1`, ignoring the left half.
- If the value at `mid` is greater than the target, the `high` index is adjusted to `mid - 1`, ignoring the right half.
4. **Repeat**: Steps 2 and 3 are repeated until either the target is found or `low` exceeds `high`.

---

## How Binary Search Stops
Binary search stops under two conditions:
1. **Target Found**: The value at the `mid` index matches the target, and the function returns the index.
2. **Target Not Found**: The `low` index becomes greater than the `high` index, meaning the array portion to be searched has been exhausted. In this case, the function returns `-1`.

---

## Code Breakdown
- **Array**: `{2, 4, 7, 10, 23, 45, 56, 78, 90}` (must be sorted for binary search to work).
- **Function**: 
- `binarySearch`: Takes the array, its size, and the target value as input.
- Returns the index of the target if found, or `-1` if not found.
- **Loop**:
- The `while` loop iterates until `low > high`.
- Inside the loop, `mid` is calculated, and comparisons determine which half of the array to discard.
- **Output**:
- Prints the index of the found element or a message indicating it was not found.

---

## Example Run
### Input
`Array: {2, 4, 7, 10, 23, 45, 56, 78, 90} Choose a number between the array above! 23`
### Output
`Mid : 4 Element found at index 4`

### Input
`Array: {2, 4, 7, 10, 23, 45, 56, 78, 90} Choose a number between the array above! 100`
### Output
`Mid : 4 Left eliminated!, High : 8, Low : 5 Mid : 6 Left eliminated!, High : 8, Low : 7 Mid : 7 Left eliminated!, High : 8, Low : 8 Mid : 8 Left eliminated!, High : 8, Low : 9 Element not found`

---

## Advantages of Binary Search
- **Efficiency**: Reduces search space by half at every step, resulting in a time complexity of `O(log n)`.
- **Simplicity**: Requires minimal memory as it works directly on the array.

---

## Notes
1. The array must be **sorted** for binary search to function correctly.
2. The algorithm is particularly efficient for large datasets compared to linear search.
3. Use appropriate checks to handle cases where the target is outside the range of the array.

---

Happy coding!

