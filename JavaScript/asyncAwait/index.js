// Async/Await = Async = makes a function return a promise
//               Await = makes an async function wait for a promise

// Allows you write asynchronous code in a synchronous manner
// Async doesn't have resolve or reject parameters
// Everything after Await is placed in an event queue


const dogWalked = true;
const kitchenCleaned = true;
const trashTakenOut = true;

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

async function doChores(){
    try{
        const walkDogResult = await walkDog();
        console.log(walkDogResult);
        const cleanKitchenResult = await cleanKitchen();
        console.log(cleanKitchenResult);
        const takeOutTrashResult = await takeOutTrash();
        console.log(takeOutTrashResult);
    }
    catch(error){
        console.error(error);
    }
}
