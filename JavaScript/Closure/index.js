// closure = A function defined inside of another function, 
//                  the inner function has access to the variables 
//                  and scope of the outer function.
//                  Allow for private variables and state maintenance
//                  Used frequently in JS frameworks: React, Vue, Angular

function createGame(){
    let score = 0;

    function increment(points){
        score+=points;
        console.log(`+${points}pts`);
    }

    function decrement(points){
        score-=points;
        console.log(`+${points}pts`);
    }

    function getScore(points){
        return score;
    }

    return {increment, decrement, getScore};
    //return an object that has method of increment, decrement and getscore
}

const game = createGame();

game.increment(59);
game.increment(50);
game.decrement(20);
console.log(`The final score is ${game.getScore()}`);

score = 1000; //does not affect the score because it is outside the function

console.log(`The final score is ${game.getScore()}`);

