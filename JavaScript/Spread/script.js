//Spread operator = ... "its like a symbol to open a box (unpack element)"

let fruits = ["apple", "banana", "watermelon"];
let numbers = [1, 2, 3, 4, 5];
let username = "oriont";

let fruits2 = [...fruits, "mango"]; //duplicating fruits and adding additional items
let words = [...username].join("-"); //changing string into an array of char

//let minimum = Math.min(numbers);
//This wont work, we have to unpack the element first

let maximum = Math.max(...numbers);