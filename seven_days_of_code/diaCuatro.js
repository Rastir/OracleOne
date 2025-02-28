let numeroOculto = 10;
// let numeroOculto = Math.floor(Math.random()*10)+1; <------------ usar si se quiere que el numero sea diferente cada vez!
let numeroUsuario = 0;
let intentos = 1;
let intentosMaximos = 3;
let encontrado = false;


while (numeroUsuario != numeroOculto){

    numeroUsuario = parseInt(prompt("Escribe un numero entre 1 y 10"));

    if (numeroUsuario == numeroOculto){
        alert(` Feliciades haz acertado el numero secreto que era ${numeroOculto}`)
    } else {
        if (numeroUsuario != numeroOculto){
            alert(`Buen intento pero no acertado, ingresa otro numero`)
            intentos = intentos + 1;
        }

        if (intentos > intentosMaximos){
            alert (`Buen intento, pero haz llegado al numero máximo de intentos, el numero oculto era ${numeroOculto}`);
            break;
        }
    }
}
