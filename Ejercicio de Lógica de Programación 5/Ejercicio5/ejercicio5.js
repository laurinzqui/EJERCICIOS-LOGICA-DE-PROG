

function adivinarNumeroSecreto() {
    var numeroSecreto = 25;
    var numerosIngresados = [];
  
    while (true) {
      var numero = parseInt(prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:"));
  
      if (isNaN(numero)) {
        console.log("Error: Ingresa un número válido.");
        continue;
      }
  
      numerosIngresados.push(numero);
  
      if (numero < 1 || numero > 100) {
        console.log("Error: Ingresa un número entre 1 y 100.");
        continue;
      }
  
      if (numero === numeroSecreto) {
        console.log("¡Felicidades, adivinaste el número secreto!");
        break;
      } else {
        console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
      }
    }
  
    mostrarResultado(numerosIngresados);
  }
  
  function mostrarResultado(numeros) {
    var resultado = document.getElementById("resultado");
    var listaNumeros = document.createElement("ul");
  
    numeros.forEach(function (numero) {
      var item = document.createElement("li");
      item.textContent = numero;
      listaNumeros.appendChild(item);
    });
  
    resultado.innerHTML = "";
    resultado.appendChild(listaNumeros);
  }
  
  adivinarNumeroSecreto();
  
  