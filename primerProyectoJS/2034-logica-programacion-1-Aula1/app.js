//Variables 
let numeroSecreto = Math.floor(Math.random()*10)+1;
let numeroUsuario = 0;
let contadorIntentos = 1;
//let palabraVeces = 'vez';
let maximosIntentos = 3;

while(numeroUsuario != numeroSecreto){
    numeroUsuario = parseInt(prompt("Escribe un numero entre 1 y 10"));

    
    console.log(typeof(numeroUsuario));

    /*Estas son la funcion 
    que realiza la comparación */


    if (numeroUsuario == numeroSecreto) { // <------------- Si se acierta lanza este mensaje
        alert(`Correcto el numero ${numeroSecreto} es correcto, lo detectsaste en ${contadorIntentos} ${contadorIntentos == 1 ? 'vez' : 'enveces' }`) 
    } else {
        if (numeroUsuario > numeroSecreto){
            alert(`El numero numero Secreto es menor que ${numeroUsuario}`)
        } else {
            alert(`El numero numero Secreto es mayor que ${numeroUsuario}`) // <------------- Si no se acierta lanza este mensaje
        }
        //incrementamos contador de intentos
        //contadorIntentos = contadorIntentos + 1;
        //contadorIntentos += 1;
        contadorIntentos++;


        //palabraVeces = 'veces';
        if (contadorIntentos > maximosIntentos ){
            alert (`Haz realizado ${maximosIntentos} intentos y llegado al numero maximo de intentos`);
            break;
        }
        
    }
}

