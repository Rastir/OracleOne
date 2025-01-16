alert ("¡Bienvenida y bienvenido a nuestro sitio web!");
alert ("¡Error, completa todos los campos!");

let mensajeDeError = "¡Error, completa todos los campos!";
alert (mensajeDeError);

let nombre = "Lua";
let edad = 25;
let numeroDeVentas = 50;
let saldoDisponible = 1000;


let nombreUsuario = prompt ('Nombre de usuario?');
alert (`Bienvenido ${nombreUsuario} eres la mera versh !`)
let edadUsuario = prompt ('edad?');
let numeroSecreto = 6;
let numeroUsuario = prompt("Me indicas un numero por favor:");

console.log(numeroUsuario);
console.log(nombreUsuario);

if (edadUsuario > 18) {
    alert('¡Puedes obtener tu licencia de conducir!') 
};


if (numeroUsuario == numeroSecreto) {
    alert('Acertaste el numero') 
};
