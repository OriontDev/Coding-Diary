const numbers = [1, 3, 5, 7, 9];
const squared = numbers.map(function(element){
    return Math.pow(numbers, 2);
})

console.log(squared);