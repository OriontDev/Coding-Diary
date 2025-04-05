//properties are what an object have, methods are function that an object can perform
//  object = {
//              key: value,
//              function()}

const person1 = {
    firstname: "Oriont",
    lastname: "Fedora",
    age: 15,
    isEmployed: false,
    eat: () => console.log("Oriont is eating pizza"),
};

const person2 = {
    firstname: "Orionette",
    lastname: "Fedorinna",
    age: 15,
    isEmployed: true,
    eat: () => console.log("Orionette is eating hamburger"),
};

person1.eat();
person2.eat();
console.log(person1.firstname);