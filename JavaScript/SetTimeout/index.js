// setTimeout() = function in JavaScript that allows you to schedule
//                            the execution of a function after an amount of time 
//                            Times are approximate
//                            setTimeout(callback, delay);
//Keep in mind that you should not use settimeout for something as precise as for a stopwatch
//because times are approximate (varies on the workload of the javascript runtime environment).

let timeoutId;

function showAlert() {
    window.alert("Hello");
}

function startTimer() {
    timeoutId = setTimeout(showAlert, 3000); //you can replace the showalert with an arrow func or anonymous func
    console.log("STARTED");
    //here im putting the settimeout on a variable so it has an id
    //so that the cleartimeout could select that spesific setimeout
}

function clearTime() {
    clearTimeout(timeoutId);
    console.log("CLEARED");
}