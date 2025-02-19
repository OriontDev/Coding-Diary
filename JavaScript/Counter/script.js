const increaseBtn = document.getElementById("increaseBtn");
const resetBtn = document.getElementById("resetBtn");
const minusBtn = document.getElementById("minusBtn");
const countText = document.getElementById("countText");
let count = 0;


increaseBtn.onclick = function(){
    count++
    countText.textContent = count;
}

minusBtn.onclick = function(){
    count--
    countText.textContent = count;
}

resetBtn.onclick = function(){
    count = 0;
    countText.textContent = count;
}
