
// sort() = method used to sort elements of an array in place.
//               Sorts elements as strings in lexicographic order, not alphabetical
//               lexicographic = (alphabet + numbers + symbols) as strings

const numbers = [1, 3, 9, 10, 5, 7];
numbers.sort((a, b) => a - b);
console.log(numbers);

const fruits = ["Apple", "Watermelon", "Orange", "Peer"];
fruits.sort();
console.log(fruits);

const peoples = [{name: "Oriont", age: 15}, 
                 {name: "Niken", age: 16},
                 {name: "Fonda", age: 16},
];

peoples.sort((a, b) => a.name.localeCompare(b.name));
console.log(peoples);
peoples.sort((a, b) => a.age - b.age);
console.log(peoples);