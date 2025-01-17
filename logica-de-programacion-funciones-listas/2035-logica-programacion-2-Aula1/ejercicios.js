function hola(){
    console.log('Hola mundo !');
    return;
}

hola();

function nombre (){
    let nombreUsuario = prompt('ingrese un nombre....');
    alert(`Hola ${nombreUsuario} eres un chilote!`);
    return;
}

nombre();

function numeroDoble(){
    let numero = prompt('ingrese un numero a duplicar!')
    alert(`El numero ingresado ${numero} al duplicarse es ${(numero)*2}`)
    return;
}

numeroDoble();

function promedio(){
    let numerosTotales = 3;
    let numeroUno = prompt('ingrese un numero!');
    let numeroDos = prompt('ingrese otro numero!');
    let numeroTres = prompt('ingrese un ultimo numero!');
    let promedio = ((parseInt(numeroUno) + parseInt(numeroDos) + parseInt(numeroTres)) / (numerosTotales));
    alert(`El promedio de los numeros ${numeroUno}, ${numeroDos} y ${numeroTres} es ${(promedio)}`);
    return;
}

promedio();

function numeroMayor(){
    let numeroUno = prompt('ingrese un numero!');
    let numeroDos = prompt('ingrese otro numero!');
    if (parseInt(numeroUno) > parseInt(numeroDos)){
        alert(`El numero ${numeroUno} es mayor`);
    } else {
        alert(`El numero ${numeroDos} es mayor`);
    }
    console.log(typeof(numeroUno));
    console.log(typeof(numeroDos));
    return;
}

numeroMayor();

function numeroMultiplicado(){
    let numeroUno = prompt('ingrese un numero!');
    alert(`El numero ${parseInt(numeroUno)} multiplicado por si mismo es : ${(parseInt(numeroUno)* parseInt(numeroUno))} `);
    console.log(typeof(numeroUno));
    return;
}

numeroMultiplicado();