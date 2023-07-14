//Se crean las variables que recibiran el número a ordenar 

var numero1 = parseInt(prompt("Ingrese un número;"));
var numero2 = parseInt(prompt("Ingrese un número;"));
var numero3 = parseInt(prompt("Ingrese un número;"));

//Realizo dos arreglos, uno para los números de menor a mayor y otro para los de mayor a menor. 

//Arreglo 1 mayor a menor
var numeroMayorAMenor = [numero1,numero2,numero3].sort(function(a, b){
    return b - a;
}
);


//Arreglo 2 menor a mayor;
var numeroMenorAMayor = [numero1,numero2,numero3].sort(function(a , b){
    return a - b;

}
);

//Imprimimos información;
console.log("Sus números ordenados de menor a mayor son:",numeroMenorAMayor);
console.log("Sus números ordenados de mayor a menor son:",numeroMayorAMenor);
