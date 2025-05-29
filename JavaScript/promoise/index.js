// Promise = An Object that manages asynchronous operations.
//                    Wrap a Promise Object around {asynchronous code}
//                    "I promise to return a value"

// DO THESE CHORES IN ORDER

// 1. WALK THE DOG
// 2. CLEAN THE KITCHEN
// 3. TAKE OUT THE TRASH

const dogWalked = true;
const kitchenCleaned = true;
const trashTakenOut = false;

function walkDog(){
    return new Promise((resolve, reject) =>{
        setTimeout(() => {
            if(dogWalked){
                resolve("You walk the dog!🐶");
            }else{
                reject("You DID'NT walk the dog!");
            }
        }, 1500);
    })
}

function cleanKitchen(){
    return new Promise((resolve, reject) =>{
        setTimeout(() => {
            if(kitchenCleaned){
                resolve("You clean the kitchen!🧹");
            }else{
                reject("You DID'NT clean the kithcen!");
            }
        }, 2000);
    })
}

function takeOutTrash(){
    return new Promise((resolve, reject) =>{
        setTimeout(() => {
            if(trashTakenOut){
                resolve("You take out the trash! 🚮");
            }else{
                reject("You DID'NT take out the trash!");
            }
        }, 1000);
    })
}

walkDog().then(value => {console.log(value); return cleanKitchen()})
         .then(value => {console.log(value); return takeOutTrash()})
         .then(value => {console.log(value); console.log("you've completed all the task!")})
         .catch(error => console.error(error));