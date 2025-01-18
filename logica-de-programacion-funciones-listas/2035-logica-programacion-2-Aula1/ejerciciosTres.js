//Crear una lista vacia generica 
let listaGenerica = [];

//Crear una lista de lenguajes de programación
let lenguajesDeProgramacion = ['Javascript','C','C++','Kotlin','Python'];


//Insertar elementos en un array
lenguajesDeProgramacion.push('Java','Ruby','GoLang');


//Mostrar elementos de un array
function mostrarListaLen(){
    console.log(lenguajesDeProgramacion);
}
mostrarListaLen();


// Mostrar un array inverso
function mostrarListaInversa(){
    let arrayInvertido = [lenguajesDeProgramacion.reverse()];
    console.log(arrayInvertido);
}
mostrarListaInversa();

// Crear una funcion con los promedios de toda la lista
function promedioLista(){
    let numeros = [5,4,6,8,4,6,8,3,8,9];
    let sumaNumeros = 0;

    for (let i = 0; i < numeros.length; i++){
        sumaNumeros += numeros[i];
    }
    let promedio = sumaNumeros / numeros.length;
    console.log(promedio);
}

promedioLista();

// crear funcion para detectar el numero mas grande de una lista y el más pequeño de la lista

function calcularMaMe(){
    let numeros = [1,2,3];
    let numeroMa = numeros[0];
    let numeroMe = numeros[0];

    for(let num of numeros){
        if (num > numeroMa){
            numeroMa = num;
        }
        if ( num < numeroMe){
            numeroMe = num;
        }
    }
    console.log(`El numero más grande es ${numeroMa}`);
    console.log(`El numero más pequeño es ${numeroMe}`);
}

calcularMaMe();

//crear funcion para sumar todos los elementos de la lista

function sumaLista(){
    let numeros = [5,4,6,8,4,6,8,3,8,9];
    let sumaNumeros = 0;

    for (let i = 0; i < numeros.length; i++){
        sumaNumeros += numeros[i];
        console.log(sumaNumeros);
    }
}

sumaLista();


//crear funcion para devolver la posicion de la lista donde esta el elemento pasado por parametro

let numeroIngresado = prompt('Ingrese un numero a buscar');
numeroIngresado = parseInt(numeroIngresado);

function detectarNumero(numeroIngresado){
    let listaNums = [1,2,3,4,5,6,7,8,9];
    let encontrado = false;

    for (let i = 0; i < listaNums.length ; i++){
        if (numeroIngresado === listaNums[i]){
            encontrado = true;
            alert('El numero se ha encontrado');
            break;
        } 
    }

    if (!encontrado){
        alert('El numero no se encontró en la lista!');
    }
}

detectarNumero(numeroIngresado);

// crear funcion que reciba 2 listas de numeros del mismo tamaño y devuelva una nueva lista con los elementos uno a uno

function fusionListas(){
    
    let listaUno = [1,2,3];
    let ListaDos = [4,5,6];
    let listaTres = [];

    for (let i = 0 ; i < listaUno.length; i++){
        listaTres.push(listaUno[i]);
    }

    for (let i =0; i < ListaDos.length; i++){
        listaTres.push(ListaDos[i]);
    }

    console.log(listaTres);
}

fusionListas();

// crear una funcion que reviba una lista y devuelta una lista con el cuadrado(potencia) de cada numero

function listaCuadrada(){

    let lista = [1,2,3,4,5];
    let listaCua = [];

    for (let i = 0; i < lista.length; i++){
        listaCua.push(lista[i]**2);
    }

    console.log(listaCua);
}

listaCuadrada();