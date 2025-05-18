const display = document.getElementById("display");
let errorFlag = false;


function appendToDisplay(input){
    if(errorFlag){
        display.value = "";
        errorFlag = false;
        display.value += input;
    }else{
        display.value += input;
    }
}

function calculate(){
    try{
        display.value = eval(display.value);
    }
    catch(error){
        display.value = "Error!";
        errorFlag = true;
    }
    
}

function clearDisplay(){
    display.value = "";
}