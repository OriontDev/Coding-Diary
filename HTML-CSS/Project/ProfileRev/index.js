const text = "Selamat datang di website pribadi saya!, Ini adalah projek website saya untuk mata pelajaran DPK.";
let i = 0;
function type() {
    if (i < text.length) {
      document.getElementById("welcome-text").innerHTML += text.charAt(i);
      i++;
      setTimeout(type, 15);
    }
 }
window.addEventListener("DOMContentLoaded", type);