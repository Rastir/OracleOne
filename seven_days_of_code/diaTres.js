let lenguajes = [];
let aprender = true;

let nombre = prompt('ingresa tu nombre');


let seguir =prompt(`Hola ${nombre} tienes tienes tiempo de unas preguntas? responde 1 para si, 2 para no`);

while (aprender == true) {
    if (seguir == 1) {
        let LenguajeExtra = prompt('Que lenguaje te gustaría aprender?');
        alert(`Excelente ! ${LenguajeExtra} es un gran lenguaje`);
        return;
    } if (seguir == 2) {
        alert(`Está bien ${nombre} a veces es mejor especializarse en un solo lenguaje, gracias por hablar conmigo!`);
        aprender = false;
        return; l
    } else {
        alert(`Haz ingresado una respuesta invalida ${nombre}, es importante seguir instrucciones! Gracias por hablar conmigo!`);
    }
}