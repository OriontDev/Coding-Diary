// arrow function = a concise way to write function expressions
//                  good for simple functions that you use only once
//                  (parameters) => code

const numbers = [1, 2, 3, 4, 5, 6];
const squares = numbers.map((element) => Math.pow(element, 2));
console.log(squares);

// Note : we dont need Return statement on the code above because its just one line

setTimeout(() => console.log("Hello!"), 3000);

//  const hello = function(){
//      console.log();
//  }
//this is basically simpler than the one on top \/
const hello = (name, age) => {console.log(`Hello ${name}`)
                              console.log(`you are ${age} years old`)};

hello("Oriont", 15);

//Oriont's note : So when do we use function declaration and
//                when do use function expression and arrow function?
//                if you are planning to use it a lot use declaration
//                if you are planning to use it once use function expression
//                because funcexpression doesnt need a name, HOWEVER
//                a better way is to use arrowfunction because it is shorter!