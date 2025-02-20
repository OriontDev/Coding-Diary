const myCheckbox = document.getElementById("myCheckbox");
const mySubmit = document.getElementById("mySubmit");
const visaBtn = document.getElementById("visaBtn");
const mastercardBtn = document.getElementById("mastercardBtn");
const paypalBtn = document.getElementById("paypalBtn");
const subsResult = document.getElementById("subsResult");
const cardResult = document.getElementById("cardResult");

mySubmit.onclick = function(){
    if(myCheckbox.checked){
        subsResult.textContent = 'You are subscribed!';
    }else{
        subsResult.textContent = 'You are NOT subscribed!';
    }

    if(visaBtn.checked){
        cardResult.textContent = 'Youre paying with VISA';
    }else if(mastercardBtn.checked){
        cardResult.textContent = 'Youre paying with MasterCard';
    }else if(paypalBtn.checked){
        cardResult.textContent = 'Youre paying with PayPal';
    }else{
        cardResult.textContent = 'Please choose a payment method!';
    }
}