const result = document.getElementById("myResult");
const celBtn = document.getElementById("celBtn");
const fahBtn = document.getElementById("fahBtn");
const textBox = document.getElementById("textBox");
let temp;

function convert(){
    if(celBtn.checked){
        temp = Number(textBox.value);
        temp = temp * 9 / 5 + 32;
        result.textContent = temp.toFixed(1) + "°F";
    }else if(fahBtn.checked){
        temp = Number(textBox.value);
        temp = (temp - 32) * (5/9);
        result.textContent = temp.toFixed(1) + "°C";
    }else{
        result.textContent = "please select a unit"
    }
}