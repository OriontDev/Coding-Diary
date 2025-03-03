
//callback are basically where a function has another function that are planned
//to be run right after its finished, check brocode for more info

sum(displayPage, 2, 4);

function sum(callback, x, y){
    let result = x + y;
    callback(result);
}

function displayConsole(result){
    console.log(result);
}

function displayPage(result){
    document.getElementById("myH1").textContent = result;
}