# Switch case  
A switch statement in C is a control structure that allows you to execute one block of code from multiple options based on the value of an expression (usually a variable). It's an alternative to multiple if-else statements, providing a cleaner and more efficient way to handle multiple conditions, especially when you have many distinct values to compare.

## How It Works  
- **`switch` Statements**: provides a way to handle multiple potential values of a variable without the need for multiple `if-else` conditions. 
- **`break` Statements**: is essential to avoid fall-through, where code in subsequent cases might run if a break is missing.  
- **`default`**: is optional and is executed if none of the case values match the expression, think of it as the replacement of `else` statements
- **`case value`**: Each `case` compares the value of the expression to a constant. If the expression matches a `case`, the code inside that case block is executed.
- **`Expression`**: The value or variable evaluated is called Expression.


## When to use Switch?
### You have multiple conditions based on the same variable or expression
A `switch` is more readable and efficient when you are checking the same variable or expression against many different values. This can make the code cleaner compared to using multiple `if-else` conditions.
### The conditions are based on discrete values
If you are testing a variable against specific, constant values (like integers or characters), a `switch` is more appropriate than an `if` statement.
### Performance Considerations
When there are many conditions to check, a `switch` statement can be more efficient than a chain of `if-else` statements, especially if the number of cases is large, because the compiler might optimize the switch statement internally.

## When to use If-Else
### When conditions are not based on a single variable or expression
If you're testing different variables or complex conditions (like comparisons or logical expressions), an `if-else` statement is better suited.
Example : `x > 10 && y < 5`
### When you need to compare ranges or complex conditions
`switch` only works with discrete values (such as integers, characters, or enums). If you need to check for ranges (like `x > 10`), `if-else` is the right choice.

## Example Output  
The program will give an output based on the user's input, in this program's case if user input 1 it will print `"The number is 1"` and if the user input 2 it will print `"The number is 2"`. Other than that the program will print `"The number is neither 1 or 2"`.
