# String Manipulation in C

This program demonstrates various string manipulation functions in C, focusing on modifying and combining strings. The code highlights how to use different string functions from the `<string.h>` and `<ctype.h>` library.

## Key String Functions Used
The code includes examples (commented out) of the following string manipulation functions:

### `strlwr(string1)`
Converts all characters in `string1` to lowercase.

### `strupr(string1)`
Converts all characters in `string1` to uppercase.

### `strcat(string1, string2)`
Concatenates `string2` to the end of `string1`.  
Example:  
If `string1 = "Oriont"` and `string2 = "Fedora"`, the result will be:  
`string1 = "OriontFedora"`

### `strncat(string1, string2, n)`
Concatenates the first `n` characters of `string2` to the end of `string1`.  
Example:  
If `n = 4`, the result will be:  
`string1 = "OriontFedo"`

### `strcpy(string1, string2)`
Copies the contents of `string2` into `string1`, overwriting its current value.  
Example:  
`string1 = "Fedora"`

### `strncpy(string1, string2, n)`
Copies the first `n` characters of `string2` into `string1`.  
Example:  
If `n = 4`, the result will be:  
`string1 = "Fedo"`

## Code Explanation
- **String Declarations:**  
  `char string1[] = "Oriont";`  
  `char string2[] = "Fedora";`  

  These are the two strings used for manipulation.

- **Function Usage:**  
  The functions are commented out but can be activated to see how each one works. Uncomment one at a time to observe the changes in `string1`.

- **Output:**  
  The modified `string1` is printed to the console.

## Example Output
### Original:
`string1 = "Oriont"`  
`string2 = "Fedora"`

### After Uncommenting `strcat(string1, string2)`:
Output:  
`OriontFedora`

### After Uncommenting `strncpy(string1, string2, 4)`:
Output:  
`Fedo`

## Notes
- The `<string.h>` library must be included to use these functions.
- strlwr and strupr are part of `<ctype.h>` library not `<string.h>`
- Always ensure the destination string has enough memory allocated to hold the modified result.
