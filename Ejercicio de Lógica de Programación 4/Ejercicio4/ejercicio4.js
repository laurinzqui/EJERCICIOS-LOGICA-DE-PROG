//Funcion fibonacci

function fibonacci(){
    //Pedir un número y lanzar alerta en caso de no ser número
    var input = parseInt(prompt("Ingrese un número para conocer la serie de fibonacci"));
    if(isNaN(input)){
        console.log("Error: Ingrese un número válido");
        return;
    } 
    //Validar que el numero sea mayor o igual que uno
if (input<1){
    console.log ("Error: Ingrese un número mayor a o igual 1.");
    return;
}
//operacion para la serie fibonacci
var serie = [0,1];
for (var i = 2; i < input; i++){
    var sigNum = serie [ i -1]+ serie[ i -2];
    serie.push(sigNum);
}
//Convertir array a una cadena de texto
var cadenaTexto = serie.join(",");

document.getElementById("resultado").textContent = "La serie fibonacci del número ingresado es:"+ serie;

}//funcion fibonacci


//invocamos función
fibonacci();