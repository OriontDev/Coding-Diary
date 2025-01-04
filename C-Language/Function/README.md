# Function Example in C

This program demonstrates the use of functions in C. It defines a function called `add` that takes two integers as arguments, adds them, and returns the result. The program then uses this function in the `main` function to calculate the sum of two integers.

## Code Breakdown

### Function Definition
a function is a self-contained block of code that performs a specific task. It is designed to take input (if required), process the input, and return a result (if necessary). Functions are used to modularize and organize code, making it reusable, easier to read, debug, and maintain.

### Function Example Definition
- **`int add(int x, int y)`**: A function that accepts two integer parameters, `x` and `y`, and returns their sum using the `return` keyword.

### Variables in Main Function
- **`num1`**: Holds the first integer value (set to `10` in this example).
- **`num2`**: Holds the second integer value (set to `30` in this example).
- **`result`**: Stores the return value from the `add` function after passing `num1` and `num2` as arguments.

### Program Execution
1. The `add` function is declared before its usage in `main`.
2. The `add` function is called with `num1` and `num2` as arguments.
3. The sum of `num1` and `num2` is calculated and returned by the `add` function.
4. The result is printed using `printf`.

### Example Output
For the given values of `num1 = 10` and `num2 = 30`, the output will be:
```
The result is 40
```

## Notes
- Declaring the function prototype (`int add(int x, int y);`) at the beginning of the code allows us to define the function later in the program.
- This modular approach makes the code more organized and reusable.
- Functions like `add` can be called multiple times with different arguments, making them useful for repetitive tasks.
