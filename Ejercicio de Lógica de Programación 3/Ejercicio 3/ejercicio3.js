//Pedir numero a analizar 

//Nombro la funcion
 function converfactorial (){
   let input = parseInt(prompt("Ingrese un número para conocer su factorial"));
    //pido el número 
    let factorial = 1;
    for (let i = 1; i <= input; i++){
    factorial *= i;
   }
  
   //DOM :Mostrar en dom el factorial del número recibido
 document.getElementById("resultado").textContent ="El factorial de " + input + " es: "+ factorial;
 }

 converfactorial();


