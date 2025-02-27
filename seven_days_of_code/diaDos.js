let nombre = prompt('ingresa tu nombre');
let edad = prompt('cuantos años tienes');
let lenguaje = prompt('Qué lenguaje de programación estás aprendiendo?');

alert(`Hola ${nombre} tienes ${edad} y estás estudiando ${lenguaje}`);

let seguir = prompt('te gustaría aprender otro lenguaje? responde 1 para si, 2 para no');

if(seguir == 1){
    let segundoLenguaje = prompt('Que lenguaje te gustaría aprender?');
    alert(`Excelente ! ${segundoLenguaje} es un gran lenguaje, gracias por hablar conmigo!`);
} if (seguir == 2) {
    alert(`Está bien ${nombre} a veces es mejor especializarse en un solo lenguaje, gracias por hablar conmigo!`);
} else {
    alert(`Haz ingresado una respuesta invalida ${nombre}, es importante seguir instrucciones! Gracias por hablar conmigo!`);
}