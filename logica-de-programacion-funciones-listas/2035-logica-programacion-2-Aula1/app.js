let numeroSecreto = 0;
let numeroIntentos = 0;

let listaNUmerosSorteados = [];
let numeroMaximo = 10;

function asignarTextoElemento(elemento, texto) {
    let elementoHTML = document.querySelector(elemento);
    elementoHTML.innerHTML = texto;
    return;
}

function verificarIntento() {
    numeroDeUsuario = parseInt(document.getElementById('valorUsuario').value);

    console.log(numeroIntentos);
    if (numeroSecreto == numeroDeUsuario) {
        asignarTextoElemento('p', `Acertaste el numero en ${numeroIntentos} ${(numeroIntentos === 1) ? 'intento' : 'intentos'} `)
        document.getElementById('reiniciar').removeAttribute('disabled');
    } else {
        //usuario no acertó !
        if (numeroDeUsuario > numeroSecreto) {
            asignarTextoElemento('p', `Uhhh! casi, el numero es mayor que el numero secreto`);
        } else {
            asignarTextoElemento('p', `Uhhh! casi, el numero es menor que el numero secreto`);
        }
        numeroIntentos++;
        limpiarCaja();
    }
    return;
}

function limpiarCaja() {

    let valorCaja = document.querySelector('#valorUsuario');
    valorCaja.value = '';

    //Tambien se puede hacer más corto haciendo solo (document.querySelector ('#valorUsuario').value = ''; )
}

function condicionesIniciales() {
    asignarTextoElemento('h1', "Juego del numero secreto");
    asignarTextoElemento('p', `Ingresa un numero del 1 al ${numeroMaximo}`);
    numeroSecreto = generarNumeroSecreto();
    numeroIntentos = 1;
}

function reiniciarJuego() {
    //limpiar la caja
    limpiarCaja();
    //refrescar el sistema
    condicionesIniciales();
    //crear nuevo numero secreto
    numeroSecreto = generarNumeroSecreto();
    //deshabilitar boton de nuevo juego 
    document.querySelector('#reiniciar').setAttribute('disabled', true);

}

function generarNumeroSecreto() {
    let numeroGenerado = Math.floor(Math.random() * numeroMaximo) + 1;
    //Si el numero generado está incluido en la lista realizar una acción de lo contrario ejecutar lo mismo

    console.log(numeroGenerado);
    console.log(listaNUmerosSorteados);

    //Si  le numero generado está incluido en la lista 
    if (listaNUmerosSorteados.length == numeroMaximo) {
        asignarTextoElemento('p', 'Ya se han asignados todos los numeros posibles ! ');
    } else {

        if (listaNUmerosSorteados.includes(numeroGenerado)) {
            return generarNumeroSecreto();
        } else {
            listaNUmerosSorteados.push(numeroGenerado);
            return numeroGenerado;
        }
    }
}

condicionesIniciales();