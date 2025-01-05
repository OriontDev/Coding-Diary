# Pointers in C

This program demonstrates the use of **pointers** in C, specifically how they work with variables and functions. It highlights how pointers allow us to manipulate the value of a variable by directly accessing its memory address.

---

## What is a Pointer?

A **pointer** is a variable that stores the **memory address** of another variable. Instead of holding a direct value like normal variables, pointers point to the location in memory where the value is stored.

### Key Pointer Syntax:
- `int *p`: Declares a pointer `p` that stores the memory address of an integer variable.
- `&x`: The address-of operator, which gives the memory address of variable `x`.
- `*p`: The dereference operator, which gives the value stored at the memory address held by `p`.

---

## How the Code Works

### Code Highlights:
1. **Declare and Assign a Pointer**:
   ```c
   int age = 21;
   int *pAge;
   pAge = &age; 
   ```
   - `pAge` is a pointer storing the address of `age`.
   - `&age` retrieves the memory address of the variable `age`.

2. **Access and Modify Variable Using Pointer**:
   ```c
   *pAge = *pAge + 1;
   ```
   - The `*pAge` dereferences the pointer to access the value of `age` and increments it.

3. **Passing Pointers to Functions**:
   ```c
   void printAge(int *pAge) {
       *pAge = *pAge + 1;
       printf("You are %d years old\n", *pAge);
   }
   ```
   - The pointer `pAge` is passed to the function `printAge`, allowing it to modify the value of `age` directly.

4. **Output Example**:
   - The program prints:
     ```
     Address of age : 0x7ffee6c4a768
     Address of pAge : 0x7ffee6c4a768
     Value stored at address: 21
     You are 22 years old
     Age = 22
     ```

---

## Why Use Pointers?

### Benefits:
1. **Efficient Memory Management**: Access and manipulate variables without creating copies.
2. **Dynamic Memory Allocation**: Work with memory during runtime using functions like `malloc`.
3. **Inter-Function Communication**: Pass variables by reference to modify them within other functions.
4. **Data Structures**: Implement advanced structures like linked lists, trees, and graphs.

### When to Use:
- When you need to pass large objects or arrays to a function without copying.
- When working with dynamic data or memory-intensive tasks.
- When you need to modify the original data within a function.

---

## Important Notes:
- Pointers must be initialized before use. Using uninitialized pointers can lead to undefined behavior.
- Always ensure proper memory management to avoid memory leaks or segmentation faults.

This program showcases the power of pointers, demonstrating their ability to directly modify variable values and optimize memory usage effectively.
