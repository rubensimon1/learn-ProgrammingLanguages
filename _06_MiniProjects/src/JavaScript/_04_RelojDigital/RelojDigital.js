function actualizarReloj() {
    const now = new Date();
    const h = String(now.getHours()).padStart(2,"0");
    const m = String(now.getMinutes()).padStart(2,"0");
    const s = String(now.getSeconds()).padStart(2,"0");
    document.getElementById("reloj").textContent = `${h}:${m}:${s}`;
}
setInterval(actualizarReloj, 1000);
actualizarReloj();
