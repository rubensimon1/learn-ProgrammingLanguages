// Crea una función contador() que devuelva otra función que aumente un contador cada vez que se llame.
function contador() {
let cuenta = 0;
return function () {
    cuenta++;
    console.log("Contador:", cuenta);
};
}

const miContador = contador();
miContador();
miContador();
miContador();
