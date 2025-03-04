
const prices = [20, 30, 10, 90, 50, 44];
const total = prices.reduce(sum);
const maximum = prices.reduce(getMax);


console.log(maximum);ssss
console.log(total);

function sum(accumulator, element){
    return accumulator + element; //previous element + next element (repeated each index)
}

function getMax(accumulator, element){
    return Math.max(accumulator, element);
}