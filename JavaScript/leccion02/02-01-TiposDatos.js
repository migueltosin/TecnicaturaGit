//Tipos de dato en JavaScript
/*
La sintaxis en los comentarios
es muy similar a la de Java
es identica
*/
var nombre = 'Ariel';
console.log(typeof nombre); 
nombre = 7;
console.log(typeof nombre);
//Tipo numerico
var numero = 3000;
console.log(numero);

var objeto = {
    nombre : "Ariel",
    apelido : "Betancud",
    telefono : "2617867893"

}
console.log(typeof objeto);

//Tipo de dato boolean
var bandera = true;
console.log(bandera);

//Tipo de dato funcion ( nos permite reutilizar lineas de codigo)
function miFuncion(){}
console.log(typeof miFuncion)

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log (typeof simbolo);

//Tipo de dato clase
class persona{
    constructos(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof persona);
//Tipo de dato undefined
var x;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es object
console.log(typeof y);


//Tipo de dato array y Empty String
var autos =['Citroen','Audi','BMW','Ford'];
console.log(autos)
console.log(typeof autos);//preguntamos que tipo de dato es: 

var z ='';
console.log(typeof z);
