function Car(model, year, color){
    this.model = model;
    this.year = year;
    this.color = color;
    this.drive = function(){console.log(`You drive the ${this.year} ${this.model}`)};
};

const car1 = new Car("Mustang", 1999, "Black");
const car2 = new Car("Ford", 2012, "Red");

car1.drive();
car2.drive();