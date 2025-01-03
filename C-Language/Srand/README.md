# Generating Random Numbers in C  

This program demonstrates the use of `srand` and `rand` functions in C to generate random numbers, specifically simulating the rolling of three dice.

## How It Works  
- The program uses the `srand` function to seed the random number generator with the current time.
- The `rand` function generates pseudo-random numbers.
- The modulo operator (`%`) and an offset (`+1`) ensure the numbers fall within the desired range of 1 to 6, simulating a die roll.

## Code Breakdown  
- **`srand(time(0));`**  
  - Seeds the random number generator with the current system time.  
  - Without seeding, `rand` would produce the same sequence of numbers each time the program runs.  

- **`rand()`**  
  - Generates a pseudo-random number.  

- **`rand() % 6 + 1`**  
  - Produces numbers in the range of 1 to 6.  
  - `% 6` limits the range to 0–5. Adding `+1` shifts it to 1–6.  

- **Dice Variables**  
  - `dice1`, `dice2`, `dice3`: Represent the results of rolling three dice, stored as integers.  

- **`time(0)`**  
  - Returns the current time in seconds since the epoch (January 1, 1970).  
  - Used as the seed to make the random number generation less predictable.  

- **`printf("%d\n", dice1);`**  
  - Prints the result of each die roll.  

## Example Output  
A sample output when the program runs:  
```
4  
2  
6  
```  
The numbers will change every time the program runs, thanks to the seeding with `srand(time(0));`.

## Notes  
- **Why Seed?**  
  Without `srand`, the `rand` function produces the same sequence of "random" numbers every time. Seeding with `time(0)` ensures variability.  

- **Using Modulo**  
  `%` narrows down the range of random numbers. Adjusting the offset (`+1`) ensures the starting point is as desired.
