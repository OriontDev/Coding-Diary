# Loop Examples in C

This program demonstrates three types of loops in C: `for`, `while`, and `do-while`. Each loop serves a different purpose and is used based on the scenario.

## How It Works
1. **For Loop:**
   - A loop that runs a fixed number of times based on a condition.
   - Example in the code:
     ```c
     for(int i = 0; i < 10; i++){
         printf("i is currently : %d\n", i);
     }
     ```
   - This prints the numbers from `0` to `9`.

2. **While Loop:**
   - A loop that continues as long as a specified condition is true.
   - Example in the code:
     ```c
     while(x == 1){
         printf("X = 1\n");
     }
     ```
   - This loop checks the condition (`x == 1`) before executing the body.

3. **Do-While Loop:**
   - A loop that always executes the body at least once before checking the condition.
   - Example in the code:
     ```c
     do{
         printf("X = 2\n");
     }while(x == 2);
     ```
   - This loop ensures the block inside is executed at least one time, even if the condition is false initially.

## Key Notes
- **For Loop:**
  - Best for when you know in advance how many times the loop should run.
  - Combines initialization, condition, and increment in one line.

- **While Loop:**
  - Executes only if the condition is true from the beginning.
  - If the condition is false initially, the loop will not execute at all.

- **Do-While Loop:**
  - Executes the block once, then checks the condition.
  - Useful when you need the loop body to run at least one time regardless of the condition.

### Difference Between `While` and `Do-While`
| Feature           | While Loop                | Do-While Loop            |
|-------------------|---------------------------|---------------------------|
| **Condition Check** | Before executing the body | After executing the body  |
| **Minimum Execution** | May not execute at all    | Executes at least once    |

## Example Interaction
- The user is prompted to input a value for `x`.
- Based on the input:
  - If `x == 1`, the `while` loop runs indefinitely (or until manually stopped).
  - If `x == 2`, the `do-while` loop runs once, printing "X = 2".
  - If `x` is neither `1` nor `2`, only the `for` loop executes.

---
This program highlights the differences between loop structures in C, offering a hands-on understanding of their behavior in different conditions.
