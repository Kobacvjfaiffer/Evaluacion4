
function enviarFondos() {
    
    const destinatario = document.getElementById("destinatario").value;
    const montoEnvio = parseFloat(document.getElementById("montoEnvio").value);
    
    
    alert("Se han enviado $" + montoEnvio + " a la cuenta " + destinatario);
  }
  
  
  function copiarCodigo() {
    const codigo = document.getElementById("codigoRecepcion");
    
    
    codigo.select();
    
    
    document.execCommand("copy");
    
    
    alert("El código de recepción ha sido copiado al portapapeles.");
  }
  