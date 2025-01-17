//Calculadora de indice de masa corporal // <-- funciona !
function imc (){

    let peso = prompt(`Ingrese su peso en kilogramos `);
    let altura = prompt(`Ingrese su altura en metros `);
    let imc = peso / (altura * altura);
    return alert(`Su IMC es de ${imc} ! `);
}

imc();

//convertidor de moneda // <-- funciona 
const pesos = 20.40;
function convertirDolares(dolares){
    let conversión = dolares*pesos;
    return conversión;
}

let dolares = prompt('Ingrese el numero de dolares a cambiar !');
let resultado = convertirDolares(dolares);

alert(`La contidad de pesos a entregar por ${dolares} dolares es de : ${resultado} pesos!`)

//Calcular area y perimetro de un rectangulo // <-- funciona
const ancho = prompt('Ingrese el ancho de la sala');
const largo = prompt('Ingrese el largo de la sala');

function calcularAreaRectangulo(ancho,largo){
    let area = ancho*largo;
    return area;
}

function calcularPerimetroRectangulo(ancho,largo){
    let perimetro = ancho*2 + largo*2;
    return perimetro;
}

let resultadoArea = calcularAreaRectangulo(ancho,largo);
let resultadoPerimetro = calcularPerimetroRectangulo(ancho,largo);

alert (`El area de la sala es de ${resultadoArea} y su perimetro de ${resultadoPerimetro}`);

//Calculadora de area y perimetro de circulo // <---- funciona
const pi = 3.14;
const radio = prompt('Ingrese el radio de un circulo !');

function calcularAreaCirculo(pi,radio){
    let area = pi * (radio * radio);
    return area;
}

function calcularPerimetroCirculo(pi,radio){
    let perimetro = 2 * pi * radio;
    return perimetro;
}

let resultadoAreaCirculo = calcularAreaCirculo(pi,radio);
let resultadoPerimetroCirculo = calcularPerimetroCirculo(pi,radio);

alert(`El area del circulo con el radio ${radio} ingresado es de ${resultadoAreaCirculo} y su perimetro de ${resultadoPerimetroCirculo}`);


// Mostrar tabla de multiplicar <-- funciona pero ubiera preferido usar while...
function crearTabla(numeroTabla){
    const inicioTabla = 1;
    let tablaCompleta = '';

    for (let i = inicioTabla; i <= 10 ; i++){
        let resultado = numeroTabla * i;
        tablaCompleta += `El numero ${numeroTabla} multiplicado por ${i} es :${resultado} `;
    }

    return tablaCompleta;
}

const numeroTabla = prompt('Ingrese un numero para crear su tabla de multiplicar ');
let tablaMultiplicar = crearTabla(numeroTabla);

console.log(tablaMultiplicar);
alert(tablaMultiplicar);
