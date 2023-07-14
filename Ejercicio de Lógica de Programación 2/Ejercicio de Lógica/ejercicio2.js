/*Programa para convertir grados celcius a grados Farenheit.
  - Imprimir por consola o DOM la temperatura ingresada convertida de grados Celsius a grados Kelvin.*/


//Se realiza un funcion con ambas conversiones dentros
function converTemp() {
    let celsius = parseFloat(prompt("Ingresa la temperatura en grados Celsius:"));

    while (isNaN(celsius)) {// Solicitara un numero valido
      alert("Error: Debes ingresar un número válido.");
      celsius = prompt("Ingresa la temperatura en grados Celsius:");
    }
    //Se realiza la operacion de Celcius a fahrenheit
    const fahrenheit = celsius * 9/5 + 32;
    console.log(celsius, "grados Celsius son", fahrenheit, "grados Fahrenheit");
    //Se realiza la operacion de celcius a Kelvin
    const kelvin = celsius + 273.15;
    console.log(celsius, "grados Celsius son", kelvin, "grados Kelvin");
  }
  
  converTemp();