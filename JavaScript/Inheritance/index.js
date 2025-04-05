class Animal{
    alive = true;

    eat(){
        console.log(`${this.name} is eating`);
    }

    sleep(){
        console.log(`${this.name} is sleeping`);
    }
}

class Cat extends Animal{
    name = "kitty";
}
class Dog extends Animal{
    name = "puppy";
}
class Rabbit extends Animal{
    name = "bunny";
}

const rabbit = new Rabbit();
const cat = new Cat();

console.log(rabbit.alive);
rabbit.eat();
rabbit.sleep();

cat.alive = false;
console.log(cat.alive);

