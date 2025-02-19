let age = window.prompt("How old are you?");
age = Number(age); //without this line, age will be a string
age += 1;

console.log(age);