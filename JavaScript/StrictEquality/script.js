// = assignment operator
// == comparison operator (compares value)
// === strict equality operator (compares if value and data type equal)
// != inequality operator
// !== strict inequality operator

const PI = 3.14;

if(PI == "3.14"){ //this would work with == but not ===
    console.log("That is Pi!");
}else{
    console.log("That is NOT pi!");
}