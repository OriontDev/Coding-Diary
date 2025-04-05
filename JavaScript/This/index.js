const person1 = {
    firstname: "Oriont",
    lastname: "Fedora",
    age: 15,
    isEmployed: false,
    favFood: "pizza",
    eat: function(){console.log(`${this.firstname} is eating ${this.favFood}`)}
    //'this' doesnt work on arrow function, because in arrow function
    //the object it will point it to is th windows, so we have to use
    //expressions
};

person1.eat();