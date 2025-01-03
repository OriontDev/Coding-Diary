# IF, ELSE, and ELIF Example  
This program demonstrates the use of conditional statements (`if`, `else`, and `else if`) in C. It includes examples of logical operators (`&&`, `||`) and comparison operators (`==`, `!=`).  

## How It Works  
- **`if` Statements**: Checks a condition and executes the corresponding block of code if the condition is true.  
- **`else` Statements**: Executes a block of code if the `if` condition is false.  
- **`else if` Statements**: Adds additional conditions to check if the `if` condition is false.  
- Logical operators (`&&`, `||`) are used to combine multiple conditions.  
- Comparison operators like `==` (equals) and `!=` (not equal) are used to compare values.  

## Code Breakdown  
- **Variables**:  
  - `x = 1`, `y = 2`, `z = 3`: Integer variables used in the conditions.  

- **First `if` Statement**:  
  - Checks if `x` is equal to `1`.  
  - Prints `"X is 1"` if true, otherwise prints `"X is NOT 1"`.  

- **Second `if` Statement**:  
  - Uses the `&&` operator to check if `x == 1` **and** `y == 2`.  
  - Prints `"X is 1 AND Y is 2"` if true, otherwise prints `"X AND Y is not 1 and 2"`.  

- **Third `if-else if` Statement**:  
  - Uses the `||` operator to check if `x` is `1` or `2`.  
  - If false, checks if `x` is `2` or `3` and prints the corresponding output.  

- **Fourth `if` Statement**:  
  - Checks if `z` is **not equal to** `x` using `!=`.  
  - Prints `"Z doesn't have the same value as X!"` if true.  

- **Comments**:  
  - `&&` means "AND".  
  - `||` means "OR".  
  - `==` is used to check equality.  
  - `!=` means "not equal to".  

## Example Output  
Given the variable values `x = 1`, `y = 2`, and `z = 3`, the program will output:  
```
X is 1  
X is 1 AND Y is 2  
X is either 1 OR 2  
Z doesn't have the same value as X!  
