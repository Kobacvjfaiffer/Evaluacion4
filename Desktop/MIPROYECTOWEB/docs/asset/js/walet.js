


function realizarDeposito() {
    
    const montoDeposito = parseFloat(document.getElementById("montoDeposito").value);
    
    if (montoDeposito > 0) {
     
      const saldoActual = parseFloat(document.getElementById('saldo').textContent.slice(1)); 
      const nuevoSaldo = saldoActual + montoDeposito; 
      document.getElementById("saldo").textContent = "$" + nuevoSaldo.toFixed(2); 
    } else {
      alert("Por favor, ingrese un monto válido para el depósito.");
    }
  }
  
  
  function realizarRetiro() {
    
    const montoRetiro = parseFloat(document.getElementById("montoRetiro").value);
    
    
    const saldoActual = parseFloat(document.getElementById("saldo").textContent.slice(1));
    
    
    if (montoRetiro > 0 && montoRetiro <= saldoActual) {
      
      const nuevoSaldo = saldoActual - montoRetiro; 
      document.getElementById("saldo").textContent = "$" + nuevoSaldo.toFixed(2); 
    } else {
      alert("El monto ingresado no es válido o excede el saldo disponible.");
    }
  }