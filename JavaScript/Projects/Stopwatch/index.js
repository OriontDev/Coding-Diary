const display = document.getElementById("display");
const alarmText = document.getElementById("alarmText");
let timer = null;
let startTime = 0;
let elapsedTime = 0;
let isRunning = false;
let alarmTime = null;
let alarmTriggered = false;
const ringtone = new Audio("Ringtone.mp3");

function start(){
    if(!isRunning){
        startTime = Date.now() - elapsedTime;
        timer = setInterval(update, 10);
        isRunning = true;
    }
}

function stop(){
    if(isRunning){
        clearInterval(timer);
        elapsedTime = Date.now() - startTime;
        isRunning = false;
    }
}

function reset(){
    clearInterval(timer);
    startTime = 0;
    elapsedTime = 0;
    isRunning = false;    
    display.textContent = "00:00:00:00";
    ringtone.pause();
    ringtone.currentTime = 0;
}

function setAlarm() {
    //change the input into a number, if its invalid turn it into 0
    const hours = parseInt(document.getElementById("alarmHours").value) || 0;
    const minutes = parseInt(document.getElementById("alarmMinutes").value) || 0;
    const seconds = parseInt(document.getElementById("alarmSeconds").value) || 0;

    alarmTime = (hours * 3600 + minutes * 60 + seconds) * 1000; // convert to ms
    alarmTriggered = false;

    alarmText.textContent = `Alarm set for ${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`
    alarmText.style.display = "block";
}

function update(){
    
    const currentTime = Date.now();
    elapsedTime = currentTime - startTime;

    let hours = Math.floor(elapsedTime / (1000 * 60 * 60));
    let minutes = Math.floor(elapsedTime / (1000 * 60) % 60);
    let seconds = Math.floor(elapsedTime / 1000 % 60);
    let milliseconds = Math.floor(elapsedTime % 1000 / 10);


    //make it two digits
    hours = String(hours).padStart(2, "0");
    minutes = String(minutes).padStart(2, "0");
    seconds = String(seconds).padStart(2, "0");
    milliseconds = String(milliseconds).padStart(2, "0");

    display.textContent = `${hours}:${minutes}:${seconds}:${milliseconds}`;

    if (alarmTime !== null && !alarmTriggered && elapsedTime >= alarmTime) {
        alarmTriggered = true;
        alarmText.textContent = "⏰ Alarm! Time is up!";
        stop();
        ringtone.play();
        // Optional: play a sound
        // new Audio('alarm.mp3').play();
    }
}