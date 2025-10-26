let count = 0;
document.getElementById("contador").addEventListener("click", () => {
    count++;
    document.getElementById("contador").textContent = count;
});
