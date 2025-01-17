let numeroSecreto = 0; 
let numeroIntentos = 0;

function asignarTextoElemento(elemento, texto){
    let elementoHTML = document.querySelector(elemento);
    elementoHTML.innerHTML = texto;
    return;
}

function verificarIntento() {
    numeroDeUsuario = parseInt(document.getElementById('valorUsuario').value);
    
    console.log(numeroIntentos);
    if (numeroSecreto == numeroDeUsuario){
        asignarTextoElemento('p', `Acertaste el numero en ${numeroIntentos} ${(numeroIntentos === 1) ? 'intento' : 'intentos'} `)
        document.getElementById('reiniciar').removeAttribute('disabled');    
    } else {
        //usuario no acertó !
        if (numeroDeUsuario > numeroSecreto){
            asignarTextoElemento('p', `Uhhh! casi, el numero es mayor que el numero secreto`);
        } else {
            asignarTextoElemento('p', `Uhhh! casi, el numero es menor que el numero secreto`);
        }
        numeroIntentos++;
        limpiarCaja();
    }
    return;
}

function limpiarCaja(){

    let valorCaja = document.querySelector('#valorUsuario');
    valorCaja.value = '';

    //Tambien se puede hacer más corto haciendo solo (document.querySelector ('#valorUsuario').value = ''; )
}

function condicionesIniciales(){
    asignarTextoElemento('h1', "Juego del numero secreto");
    asignarTextoElemento('p', "Ingresa un numero del 1 al 100");
    numeroSecreto = generarNumeroSecreto();
    numeroIntentos = 1;
}
  
function reiniciarJuego(){
    //limpiar la caja
    limpiarCaja();
    //refrescar el sistema
    condicionesIniciales();
    //crear nuevo numero secreto
    numeroSecreto = generarNumeroSecreto();
    //deshabilitar boton de nuevo juego 
    document.querySelector('#reiniciar').setAttribute('disabled',true);
    
}

function generarNumeroSecreto() {
    return Math.floor(Math.random()*10) + 1;
}

condicionesIniciales();