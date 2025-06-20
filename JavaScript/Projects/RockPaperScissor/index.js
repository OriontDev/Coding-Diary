const choices = ["rock", "paper", "scissor"];
const playerDisplay = document.getElementById("playerDisplay");
const computerDisplay = document.getElementById("computerDisplay");
const resultDisplay = document.getElementById("resultDisplay");
const playerScoreDisplay = document.getElementById("playerScoreDisplay");
const computerScoreDisplay = document.getElementById("computerScoreDisplay");
let playerScore = 0;
let computerScore = 0;


function playGame(playerChoice){
    const computerChoice = choices[Math.floor(Math.random() * 3)];
    let result = "";
    if(playerChoice === computerChoice){
        result = "ITS A TIE!"
    }else{
        switch(playerChoice){
            case "rock":
                result = (computerChoice === "scissor") ? "YOU WIN!" : "YOU LOST!";
                break;
            case "paper":
                result = (computerChoice === "rock") ? "YOU WIN!" : "YOU LOST!";
                break;
            case "scissor":
                result = (computerChoice === "paper") ? "YOU WIN!" : "YOU LOST!";
                break;
        }
    }

    playerDisplay.textContent = `PLAYER: ${playerChoice}`;
    computerDisplay.textContent = `COMPUTER: ${computerChoice}`;
    resultDisplay.textContent = result;

    resultDisplay.classList.remove("greenText", "redText")
    switch(result){
        case "YOU WIN!":
            playerScore++;
            playerScoreDisplay.textContent = playerScore
            resultDisplay.classList.add("greenText");
            break;
        case "YOU LOST!":
            computerScore++;
            computerScoreDisplay.textContent = computerScore
            resultDisplay.classList.add("redText");
            break;
    }
}