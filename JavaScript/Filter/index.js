
//creates a new array by filter element of another array

const age = [5, 11, 14, 15, 16, 20, 40];
const minors = age.filter(isChild);


function isChild(element){
    return element < 18; //return element that is under 18
}

function isEven(element){
    return element % 2 === 0; //return element that is even
}