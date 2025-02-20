const increaseBtn = document.getElementById("increaseBtn");
const resetBtn = document.getElementById("resetBtn");
const minusBtn = document.getElementById("minusBtn");
const countText = document.getElementById("countText");
let count = 0;



increaseBtn.onclick = function(){
    count++
    countText.textContent = count;
    if(count == 69){
        document.getElementById("myH1").textContent = "OMAGAGGAGGAG FUNI NUMBER";
    }else{
        document.getElementById("myH1").textContent = "";
    }
}

minusBtn.onclick = function(){
    count--
    countText.textContent = count;
    if(count == 69){
        document.getElementById("myH1").textContent = "OMAGAGGAGGAG FUNI NUMBER";
    }else{
        document.getElementById("myH1").textContent = "";
    }
}

resetBtn.onclick = function(){
    count = 0;
    countText.textContent = count;
    document.getElementById("myH1").textContent = "";
}
