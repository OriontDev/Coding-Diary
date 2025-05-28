const vbutton = document.getElementById("show-button");
const image = document.getElementById("image");

vbutton.addEventListener("click", () => {
    if(image.style.visibility === "hidden"){
        image.style.visibility = "visible";
        vbutton.textContent = "Hide"
    }else{
        image.style.visibility = "hidden";
        vbutton.textContent = "Show"     
    }
});